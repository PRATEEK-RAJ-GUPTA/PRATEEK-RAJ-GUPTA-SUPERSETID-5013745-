QEUSTION 1-> Explain how arrays are represented in memory and their advantages.?
ANSWER->
Array Representation in Memory:
•	Memory Layout: Arrays are stored in contiguous memory locations. This means that all elements of the array are stored one after another in memory.
•	Indexing: Arrays use indices (or offsets) to access elements. The memory address of an element can be calculated using the base address of the array and the size of each element.
•	Advantages:
•	Direct Access: Arrays allow constant time (O(1)) access to any element using its index.
•	Cache Efficiency: Because elements are contiguous, arrays can be cache-friendly, leading to better performance in accessing elements sequentially.
•	Simplicity: Arrays are simple to implement and understand, which makes them suitable for cases where the size of the dataset is known and fixed.

QUESTION 2-> Analyze the time complexity of each operation (add, search, traverse, delete)?
ANSWER->
Time Complexity:
•	Add Operation: O(1) if there's space available, as adding an element involves placing it at the next index. If the array is full, adding would require resizing, which can be O(n) in more complex implementations.
•	Search Operation: O(n), as it may require a full scan of the array to find an employee.
•	Traverse Operation: O(n), as it involves iterating through all employees.
•	Delete Operation: O(n), as it requires finding the employee first and then shifting elements to fill the gap.

QUESTION 3-> Discuss the limitations of arrays and when to use them.?
ANSWER->
•	Fixed Size: Arrays have a fixed size once created, so resizing requires creating a new array and copying elements, which can be inefficient.
•	Insertion and Deletion: Inserting or deleting elements is costly due to the need to shift elements, making it less suitable for scenarios with frequent insertions and deletions.
•	Memory Allocation: If the initial size of the array is not well-estimated, it could lead to wasted memory or the need for frequent resizing.
