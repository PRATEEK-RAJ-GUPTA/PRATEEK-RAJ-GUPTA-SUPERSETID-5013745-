QUESTION 1-> Explain the different types of linked lists (Singly Linked List, Doubly Linked List)?
ANSWER->
A linked list is a data structure where each element (node) contains a reference (link) to the next element in the sequence. This allows for dynamic memory allocation and flexible data manipulation.
•	Singly Linked List: Each node contains a reference to the next node. It allows for traversal in one direction only (forward). Operations like insertion and deletion are generally efficient when performed at the beginning or end of the list.
•	Doubly Linked List: Each node contains references to both the next and the previous nodes, allowing for traversal in both directions (forward and backward). This adds extra memory overhead compared to singly linked lists but provides more flexibility in certain operations.

QUESTION 2-> Analyze the time complexity of each operation.?
ANSWER->
•	Add Operation: O(n) in the worst case, as you may need to traverse the entire list to add a new node at the end.
•	Search Operation: O(n), as it may require a full scan of the list to find the task.
•	Traverse Operation: O(n), as it involves iterating through all tasks in the list.
•	Delete Operation: O(n) in the worst case, as you may need to traverse the list to find and delete the node.

QUESTION 3-> Discuss the advantages of linked lists over arrays for dynamic data.?
ANSWER->
•	Dynamic Size: Linked lists can grow or shrink in size dynamically without the need to resize, unlike arrays which have a fixed size.
•	Efficient Insertions/Deletions: Insertions and deletions can be performed more efficiently (O(1)) if the position is known, as no shifting of elements is required, unlike arrays where shifting can be costly.
•	Memory Efficiency: Linked lists can use memory more efficiently when the number of elements is highly variable, as they allocate memory as needed for each node.

