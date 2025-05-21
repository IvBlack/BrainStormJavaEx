package ya.contest.dequeue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// Кастомная реализация двусторонней очереди на основе двусвязного списка.
public class CustomDequeueClass {

    public static void main(String[] args) throws IOException {

//        4
//        4
//        push_front 861
//        push_front -819
//        pop_back
//        pop_back

//        CustomDequeRealization customDequeRealization =
//                new CustomDequeRealization();
//        customDequeRealization.pushBack(4);
//        customDequeRealization.pushFront(12);
//        customDequeRealization.pushBack(23);
//        System.out.println(customDequeRealization.size());
//        System.out.println(customDequeRealization);

        BufferedReader br = new BufferedReader
                (
                        new BufferedReader(new InputStreamReader(System.in))
                );


        int kol_vo_commands = Integer.parseInt(br.readLine());
        int dek_size = Integer.parseInt(br.readLine());

        String[] commands = new String[kol_vo_commands];

//        массив команд
        for (int i = 0; i < kol_vo_commands; i++) {
            commands[i] = Arrays.toString(br.readLine().split( " "));
        }

        parse_commands(commands);
    }


    public static void parse_commands(String[] commands) {
//        ListBasedQueue list = new ListBasedQueue();
//
//        for (String command : commands) {
//            if (command.contains("get")) {
//                Integer result = list.get();
//                System.out.println(result != null ? result : "error");
//            } else if (command.contains("size")) {
//                System.out.println(list.getSize());
//            } else if (command.contains("put")) {
//                try {
//                    // значение после put  в строке команды
////                    String value = command.split(" ")[1];
//                    Pattern pattern = Pattern.compile("\\[\\w+\\s*,\\s*(-?\\d+)\\]");
//                    Matcher matcher = pattern.matcher(command);
//                    if (matcher.find()) {
//                        // Получаем число и берем его модуль
//                        int number = Integer.parseInt(matcher.group(1));
//                        list.put(number);
//                    } else {
//                        System.out.println("Некорректный формат числа");
//                    }
//                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
//                    System.out.println("Ошибка в команде put" + e);
//                }
//            } else {
//                System.out.println("Неизвестная команда: " + command);
//            }
//        }
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
