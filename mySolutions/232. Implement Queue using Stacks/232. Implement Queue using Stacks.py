from collections import deque
class MyQueue:
    
    inputStack = deque()
    
    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.inputStack = deque()

    def push(self, x: int) -> None:
        """
        Push element x to the back of queue.
        """
        self.inputStack.append(x)        

    def pop(self) -> int:
        """
        Removes the element from in front of queue and returns that element.
        """
        temp = deque()
        
        while len(self.inputStack) > 0:
          temp.append(self.inputStack.pop())
        
        popValue = temp.pop()
        
        while len(temp) > 0:
          self.inputStack.append(temp.pop())
          
        return popValue
        

    def peek(self) -> int:
        """
        Get the front element.
        """
        return self.inputStack[0]

    def empty(self) -> bool:
        """
        Returns whether the queue is empty.
        """
        return len(self.inputStack) == 0


# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()