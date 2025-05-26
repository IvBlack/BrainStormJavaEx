package ya.contest.dequeue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Кастомная реализация двусторонней очереди на основе двусвязного списка.
public class CustomDequeueClass {

    public static void main(String[] args) throws IOException {

//4
//4
//push_front 861
//push_front -819
//pop_back
//pop_back

        BufferedReader br = new BufferedReader
                (
                        new BufferedReader(new InputStreamReader(System.in))
                );


        int kol_vo_commands = Integer.parseInt(br.readLine().trim());
        int dek_size = Integer.parseInt(br.readLine().trim());

        String[] commands = new String[kol_vo_commands];

        // массив команд, разбитый
        for (int i = 0; i < kol_vo_commands; i++) {
            commands[i] = Arrays.toString(br.readLine().split( " "));
        }

        CustomDequeRealization list = new CustomDequeRealization();
        processCommands(list, commands);
    }

    static void processCommands(CustomDequeRealization list, String[] commands) {
        for (String command : commands) {
            String replaced = command.replaceAll("[\\[\\],]", "");
            String[] arr = replaced.split(" ");
            String func = arr[0];

            if (!isValidCommand(func)) {
                System.out.println("Неизвестная команда: " + command);
                continue;
            }

            try {
                switch (func) {
                    case "push_front":
                        list.push_front(Integer.parseInt(arr[1]));
                        break;
                    case "push_back":
                        list.push_back(Integer.parseInt(arr[1]));
                        break;
                    case "pop_front":
                        System.out.println(list.pop_front());
                        break;
                    case "pop_back":
                        list.pop_back();
                        break;
                }
            } catch (Exception ex) {
                System.out.println("Ошибка выполнения команды: " + command);
            }
        }
    }

    private static boolean isValidCommand(String cmd) {
        return cmd.equals("push_front") ||
                cmd.equals("push_back") ||
                cmd.equals("pop_front") ||
                cmd.equals("pop_back");
    }



    // элемент очереди, узел
    static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    static class CustomDequeRealization {
        private Node head;
        private Node tail;
        private int size;

        public CustomDequeRealization() {
            head = null;
            tail = null;
            size = 0;
        }

        // размер, текущее состояние поля size
        public int size() {
            return size;
        }

        // Добавление элемента в голову
        public void push_front(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            size++;
        }

        // Добавление элемента в хвост
        public void push_back(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                newNode.prev = tail;
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

        // Удаление элемента из конца
        public int pop_back() throws Exception {
            if (isEmpty()) {
                throw new Exception("Deque is empty");
            }
            int data = tail.data;
            if (head == tail) {
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
            size--;
            return data;
        }

        // удаление элемента из головы
        public int pop_front() throws Exception {
            if (isEmpty()) {
                throw new Exception("Deque is empty");
            }
            int data = head.data;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            size--;
            return data;
        }

        // Получение первого элемента
        public int front() throws Exception {
            if (isEmpty()) {
                throw new Exception("Deque is empty");
            }
            return head.data;
        }

        // Получение последнего элемента
        public int back() throws Exception {
            if (isEmpty()) {
                throw new Exception("Deque is empty");
            }
            return tail.data;
        }

        // Проверка на пустоту
        public boolean isEmpty() {
            return size == 0;
        }

        @Override
        public String toString() {
            return "CustomDequeRealization{" +
                    "head=" + head +
                    ", tail=" + tail +
                    ", size=" + size +
                    '}';
        }
    }

}
