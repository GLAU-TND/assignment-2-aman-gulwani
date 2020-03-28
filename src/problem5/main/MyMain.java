/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.Scanner;

//executable class
public class MyMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MyCircularQueue myCircularQueue = new MyCircularQueue();

        System.out.println("Enter the size of Student list");

        int size = scanner.nextInt();

        scanner.nextLine();

        int arr[] = new int[size];

        int count = 0;

        for (int i = 0; i < size; i++) {

            scanner.nextLine();

            System.out.println("ENTER THE STUDENT NAME");

            String s = scanner.nextLine();

            System.out.println("ENTER THE NUMBER OF BACKLOGS");

            int b = scanner.nextInt();

            Student student = new Student(b, s);

            myCircularQueue.enqueue(student);


        }

    }

}

