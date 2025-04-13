
# ADS Assignment 2 — Custom Data Structures in Java

This project is part of ADS course assignment 2.

##   Implemented Classes
- `MyList<T>` – custom interface similar to List


- `MyArrayList<T>` – dynamic array implementation with head and tail nodes.


- `MyLinkedList<T>` – doubly linked list implementation


- `MyStack<T>` – LIFO structure based on `MyArrayList`


- `MyQueue<T>` – FIFO structure based on `MyLinkedList`


- `MyMinHeap<T extends Comparable<T>>` – Binary min-heap using `MyArrayList<T>` for element storage.

## How to Run

1. Open the project in IntelliJ IDEA or another IDE


2. Run `Main.java`


3. Observe the console output to verify the correctness

## Example Usage

```java
MyStack<String> stack = new MyStack<>();
stack.push("A");
stack.push("B");
System.out.println(stack.pop());