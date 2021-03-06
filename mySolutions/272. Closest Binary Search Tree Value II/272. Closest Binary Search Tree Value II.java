/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> closestKValues(TreeNode root, double target, int k) {
        LinkedList<Integer> window = new LinkedList<>(); 
        Stack<TreeNode> stack = new Stack<>();
        
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            
            root = stack.pop();
            
            if (window.size() == k) {
                if (Math.abs(root.val - target) > Math.abs(target - window.get(0))) {
                    return window;
                }
                window.removeFirst();
            }
            
            window.add(root.val);
            
            root = root.right;
        }
        
        return window;
        
    }
        
}