package ya.contest.lists;

/*
 * Меняет голову и хвост списка местами.
 * */
public class ExchangeListTailHead {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Исходный список:");
        printList(head);

        head = solution(head);

        System.out.println("Список после обмена:");
        printList(head);
    }

    public static Node solution(Node head) {
        // крайние случаи
        if (head == null || head.next == null) {
            return head;
        }

        // двигаем метку tail до хвоста списка
        Node prev = null;
        Node tail = head;
        while (tail.next != null) {
            prev = tail;
            tail = tail.next;
        }

        // если достигли хвоста - меняем с головой местами
        head.data = head.data ^ tail.data;
        tail.data = head.data ^ tail.data;
        head.data = head.data ^ tail.data;

        // обновить ссылку на хвост
        if (prev == head) {
            head.next = tail;
        }
        return head;
    }

    // Метод для вывода списка
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
