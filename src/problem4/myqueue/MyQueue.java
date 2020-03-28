/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

public class MyQueue {

    private Node front, end, tmp;

    private int size;

    public MyQueue() {

        front = null;

        end = null;

        tmp = null;

        size = 0;
    }
}
