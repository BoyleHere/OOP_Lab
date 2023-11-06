/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab11.prashast;

/**
 *
 * @author student
 */
class MyThreadUsingRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread created using Runnable interface is running.");
    }
}

class MyThreadUsingThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread created by inheriting Thread class is running.");
    }
}

public class runnableThread {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create and start thread using Runnable interface");
            System.out.println("2. Create and start thread by inheriting Thread class");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(System.console().readLine());

            switch (choice) {
                case 1:
                    MyThreadUsingRunnable runnableThread = new MyThreadUsingRunnable();
                    Thread thread1 = new Thread(runnableThread);
                    thread1.start();
                    break;
                case 2:
                    MyThreadUsingThread thread2 = new MyThreadUsingThread();
                    thread2.start();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
