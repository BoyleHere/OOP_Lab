/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

// Define the Node class for the linked list
class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

// Define the SinglyLinkedList class
class SinglyLinkedList<T> {
    private Node<T> head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

class linkedlist{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SinglyLinkedList<Integer> integerList = new SinglyLinkedList<>();
        System.out.println("Enter integers to add to the list (type 'done' to stop):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("done")) {
                break;
            }
            try {
                Integer value = Integer.parseInt(input);
                integerList.insert(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }

        SinglyLinkedList<Double> doubleList = new SinglyLinkedList<>();
        System.out.println("Enter doubles to add to the list (type 'done' to stop):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("done")) {
                break;
            }
            try {
                Double value = Double.parseDouble(input);
                doubleList.insert(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a double.");
            }
        }

        System.out.println("Integer List:");
        integerList.display();

        System.out.println("Double List:");
        doubleList.display();

        scanner.close();
    }
}
