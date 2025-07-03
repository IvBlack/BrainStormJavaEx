package ya.contest.dequeue;

import java.util.Scanner;

/*
    Второй вариант dequeue
* */
class Dek2 {
    private Integer[] elements;
    private int maxSize;
    private int head;
    private int tail;
    private int size;

    public Dek2(int maxSize) {
        this.elements = new Integer[maxSize];
        this.maxSize = maxSize;
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void pushBack(int value) throws Exception {
        if (size != maxSize) {
            elements[tail] = value;
            tail = (tail + 1) % maxSize;
            size++;
        } else {
            throw new Exception("error");
        }
    }

    public void pushFront(int value) throws Exception {
        if (size != maxSize) {
            head = (head - 1 + maxSize) % maxSize;
            elements[head] = value;
            size++;
        } else {
            throw new Exception("error");
        }
    }

    public int popBack() throws Exception {
        if (isEmpty()) {
            throw new Exception("error");
        }
        tail = (tail - 1 + maxSize) % maxSize;
        int value = elements[tail];
        elements[tail] = null;
        size--;
        return value;
    }

    public int popFront() throws Exception {
        if (isEmpty()) {
            throw new Exception("error");
        }
        int value = elements[head];
        elements[head] = null;
        head = (head + 1) % maxSize;
        size--;
        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCommand = scanner.nextInt();
        int queueSize = scanner.nextInt();
        scanner.nextLine(); // Пропускаем пустую строку

        Dek2 queue = new Dek2(queueSize);

        for (int i = 0; i < countCommand; i++) {
            String command = scanner.nextLine();
            String[] parts = command.split(" ");
            String operation = parts[0];

            try {
                switch (operation) {
                    case "push_front":
                        queue.pushFront(Integer.parseInt(parts[1]));
                        break;
                    case "push_back":
                        queue.pushBack(Integer.parseInt(parts[1]));
                        break;
                    case "pop_front":
                        System.out.println(queue.popFront());
                        break;
                    case "pop_back":
                        System.out.println(queue.popBack());
                        break;
                }
            } catch (Exception e) {
                System.out.println("error");
            }
        }
    }
}

