# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

from collections import deque
class BSTIterator:
    
    root = None
    stack = deque()
    
    def __init__(self, root: TreeNode):
        self.root = root
        self.stack = deque()
        
    def next(self) -> int:
        """
        @return the next smallest number
        """
        while len(self.stack) != 0 or self.root != None:
            while self.root != None:
                self.stack.append(self.root)
                self.root = self.root.left
            
            self.root = self.stack.pop()
            temp = self.root
            
            self.root = self.root.right
            return temp.val
        

    def hasNext(self) -> bool:
        """
        @return whether we have a next smallest number
        """
        return len(self.stack) != 0 or self.root != None


# Your BSTIterator object will be instantiated and called as such:
# obj = BSTIterator(root)
# param_1 = obj.next()
# param_2 = obj.hasNext()