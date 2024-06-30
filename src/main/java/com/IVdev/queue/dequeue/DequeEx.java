package com.IVdev.queue.dequeue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class DequeEx {
    static Queue<Integer> q = new ArrayDeque<>(Arrays.asList(11, 33, 55, 22, 44));

    public static void main(String[] args) {
        q.poll();
        q.forEach(System.out::println);
    }
}
