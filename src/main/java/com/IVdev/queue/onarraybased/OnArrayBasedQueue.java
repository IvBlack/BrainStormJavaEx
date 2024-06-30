package com.IVdev.queue.onarraybased;

/*
    Реализация собственной очереди на языке Java.
    Р. Лафоре.
*/
public class OnArrayBasedQueue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public OnArrayBasedQueue (int s) {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear  = -1;
        nItems = 0;
    }

    //вставка в конец очереди
    public void insert(long j)
    {
        if (rear == maxSize - 1)
        {
            rear = -1;
            queArray[++rear] = j; // Увеличение rear и вставка
            nItems++;
        }
    }

    //извлечениe элемента в начале очереди
    public long remove()
    {
        long temp = queArray[front++];
        if (front == maxSize)
        {
            front = 0; //циклический перенос
            nItems--;
        }
        return temp;
    }


    //чтение из начала очереди
    public long peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    //индикатор переполнения очереди
    public boolean isFull() {
        return (nItems == maxSize);
    }

    //кол-во элементов очереди
    public int size() {
        return nItems;
    }
}

class QueueApp {
    public static void main(String[] args) {
        OnArrayBasedQueue custQueue = new OnArrayBasedQueue(5);
        custQueue.insert(10);
        custQueue.insert(20);
        custQueue.insert(30);
        custQueue.insert(40);

        custQueue.remove();
        custQueue.remove();
        custQueue.remove();

        custQueue.insert(50);
        custQueue.insert(60);
        custQueue.insert(70);
        custQueue.insert(80);


        while (!custQueue.isEmpty()) {
            long n = custQueue.remove();
            System.out.println(n);
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
