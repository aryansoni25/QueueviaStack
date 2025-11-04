package org.studyeasy;

public class Main {
    public static void main(String[] args) {
        QueueViaStack q=new QueueViaStack();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        System.out.println(q.peek());
        q.dequeue();
        System.out.println(q.peek());
        System.out.println(q.size());
    }
}