package ya.contest.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Класс для узла связанного списка
// Кастомная реализация очереди на основе связного списка.
class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}

// Реализация связанного списка
class ListBasedQueue {
    private Node head;
    private int size;

    public ListBasedQueue() {
        this.head = null;
        this.size = 0;
    }

    // Добавление элемента в конец списка
    public void put(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    // Извлечение первого элемента
    public Integer get() {
        if (head == null) {
            return null;
        }
        int data = head.getData();
        head = head.getNext();
        size--;
        return data;
    }

    public int getSize() {
        return size;
    }
}

// Основной класс с обработкой команд
public class ListCommandsResolver {

    //маршрутизатор команд из потока ввода
    public static void parse_commands(String[] commands) {
        ListBasedQueue list = new ListBasedQueue();

        for (String command : commands) {
            if (command.contains("get")) {
                Integer result = list.get();
                System.out.println(result != null ? result : "error");
            } else if (command.contains("size")) {
                System.out.println(list.getSize());
            } else if (command.contains("put")) {
                try {
                    // значение после put  в строке команды
//                    String value = command.split(" ")[1];
                    Pattern pattern = Pattern.compile("\\[\\w+\\s*,\\s*(-?\\d+)\\]");
                    Matcher matcher = pattern.matcher(command);
                    if (matcher.find()) {
                        // Получаем число и берем его модуль
                        int number = Integer.parseInt(matcher.group(1));
                        list.put(number);
                    } else {
                        System.out.println("Некорректный формат числа");
                    }
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                    System.out.println("Ошибка в команде put" + e);
                }
            } else {
                System.out.println("Неизвестная команда: " + command);
            }
        }
    }

    public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader
                (
                        new BufferedReader(new InputStreamReader(System.in))
                );

        //перехват ввода с консоли
        int kol_vo_commands = Integer.parseInt(br.readLine());
        String[] commands = new String[kol_vo_commands];

//        массив команд
        for (int i = 0; i < kol_vo_commands; i++) {
            commands[i] = Arrays.toString(br.readLine().split( " "));
        }

        parse_commands(commands);
    }
}
