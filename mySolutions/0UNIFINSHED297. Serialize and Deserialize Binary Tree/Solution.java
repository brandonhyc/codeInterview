/**
 * Definition of TreeNode: 
 * public class TreeNode { 
 *      public int val; 
 *      public TreeNode left, right; 
 *      public TreeNode(int val) { 
 *          this.val = val; this.left = this.right = null; 
 *      } 
 * }
 */

public class Solution {
    /**
     * This method will be invoked first, you should design your own algorithm to
     * serialize a binary tree which denote by a root node to a string which can be
     * easily deserialized by your own "deserialize" method later.
     */
    public String serialize(TreeNode root) {
        // write your code here
        //01_
        if (root == null) {
            return "[]";
        }
        
        Queue<TreeNode> que = new LinkedList<>();
        LinkedList<String> labels = new LinkedList<>();
        

        que.offer(root);
        while (!que.isEmpty()) {
            TreeNode node = que.poll();
            labels.add(Integer.toString(node.val));
            
            if (node.left != null) {
                que.offer(node.left);                
            } else {
                labels.add("#");
            }
            if (node.right != null) {
                que.offer(node.right);                
            } else {
                labels.add("#");
            }
        }

        while (labels.getLast() == "#") {
            labels.removeLast();
        }

        String res = labels.toString(); 
        System.out.printf("res: %s\n", res);
        return res;

    }

    /**
     * This method will be invoked second, the argument data is what exactly you
     * serialized at method "serialize", that means the data is not given by system,
     * it's given by your own serialize method. So the format of data is designed by
     * yourself, and deserialize it here as you serialize it in "serialize" method.
     */
    public TreeNode deserialize(String data) {
        // write your code here

        if (data.equals("[]")) return null;

        String[] labels = data.replaceAll("[", "").replaceAll("]", "").replaceAll(" ","").split(",");
        System.out.print(labels);
        System.out.print("\n");

        TreeNode root = new TreeNode(Integer.parseInt(labels[0]));
        Queue<TreeNode> que = new LinkedList<>();
        boolean isLeft = false;

        TreeNode head = root;
        que.offer(root);        
        for (int i = 1; i < labels.length; i++) {
            
            isLeft = !isLeft;
            if (labels[i] == "#") {
                continue;
            }

            TreeNode next = new TreeNode(Integer.parseInt(labels[i]));
            if (isLeft) {
                head = que.poll();
                head.left = next;
            } else {
                head.right = next;
            }
            que.offer(next);
        }

        return root;
        
    }
}