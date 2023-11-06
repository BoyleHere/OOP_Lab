/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.ArrayList;
import java.util.List;

// Define a generic Stack class
class Stack<T> {
    private List<T> stack = new ArrayList<>();

    // Push an element onto the stack
    public void push(T item) {
        stack.add(item);
    }

    // Pop and return the top element from the stack
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

// Define a Student class
class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student: " + name;
    }
}

// Define an Employee class
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee: " + name;
    }
}

public class stackgeneric {
    public static void main(String[] args) {
        // Create a generic stack for Student objects
        Stack<Student> studentStack = new Stack<>();

        studentStack.push(new Student("Alice"));
        studentStack.push(new Student("Bob"));
        studentStack.push(new Student("Charlie"));

        System.out.println("Student Stack:");
        while (!studentStack.isEmpty()) {
            System.out.println(studentStack.pop());
        }

        // Create a generic stack for Employee objects
        Stack<Employee> employeeStack = new Stack<>();

        employeeStack.push(new Employee("David"));
        employeeStack.push(new Employee("Eve"));
        employeeStack.push(new Employee("Frank"));

        System.out.println("\nEmployee Stack:");
        while (!employeeStack.isEmpty()) {
            System.out.println(employeeStack.pop());
        }
    }
}
