package com.IVdev.multithreading;

public class RunnableInThread {
    public static void main(String[] args) {
        Runnable target = new Runnable() {
            @Override
            public void run() {}
        };

        Thread myThread = new Thread(target);

    }

    /*
    Блок кода в main создает поток, используя Runnable.
    Какой из следующих классов может быть использован, чтобы  код в main откомпилировался?

    1. public class MyRunnable implements Runnable{ void run(){}}

    2. public class MyRunnable{public void start(){}}

    3. public class MyRunnable implements Runnable{ public void run(){}}

    4. public class MyRunnable extends Runnable{ public void run(){}}
    */
}
