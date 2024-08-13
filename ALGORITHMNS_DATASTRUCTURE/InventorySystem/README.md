
QUESTION->Explain why data structures and algorithms are essential in handling large inventories.
ANSWER->Handling large inventories efficiently requires careful management of data storage and retrieval. The key challenges are:

Handling large inventories efficiently requires careful management of data storage and retrieval. The key challenges are:
•	Efficiency: Operations like adding, updating, and retrieving products need to be performed quickly to ensure the system's responsiveness.
•	Scalability: The system must handle large volumes of data as the inventory grows without significant performance degradation.
•	Accuracy: Accurate data retrieval and updates are crucial for maintaining inventory integrity.


QUESTION-> Discuss the types of data structures suitable for this problem.
ANSWER-> • 
•	ArrayList: Provides dynamic resizing and allows random access. However, insertion and deletion operations can be costly (O(n) time complexity) due to shifting elements.
•	LinkedList: Allows efficient insertions and deletions (O(1) time complexity) but has slower access times (O(n) time complexity).
•	HashMap: Provides constant-time average complexity for insertions, deletions, and lookups (O(1) on average) but requires hashing and handling collisions.
•	TreeMap: Offers log-time complexity for insertions, deletions, and lookups (O(log n)) and maintains the order of elements.

Given the need for efficient retrieval and modification, HashMap is often the most suitable choice for inventory management. It allows for quick lookups by product ID and efficient insertions and deletions.