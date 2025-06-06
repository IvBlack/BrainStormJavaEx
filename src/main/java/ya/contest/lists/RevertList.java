package ya.contest.lists;

/*
 * Меняет порядок элементов списка на обратный, включая смену головы.
 * */
public class RevertList {
// <template>

    public static void main(String[] args) {
        Solution.test();
    }

    static class Node<V> {
        public V value;
        public Node<V> next;
        public Node<V> prev;

        public Node(V value, Node<V> next, Node<V> prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public class Solution {
        public static Node<String> solution(Node<String> head) {

            // head - неинформативно, только сбивает с толку
            if (head == null) {
                return null;
            }

            // меняем местами ноды  без цикла
            Node temporal = head.prev;
            head.prev = head.next;
            head.next = temporal;

            // крайний случай, голова
            if (head.prev == null) {
                return head;
            }

            // двигаем на сл. ноду
            return solution(head.prev);
        }

        private static void test() {
            Node<String> node3 = new Node<>("node3", null, null);
            Node<String> node2 = new Node<>("node2", node3, null);
            Node<String> node1 = new Node<>("node1", node2, null);
            Node<String> node0 = new Node<>("node0", node1, null);
            node1.prev = node0;
            node2.prev = node1;
            node3.prev = node2;
            Node<String> newNode = solution(node0);
            /* result is :*/
            assert newNode == node3;
            assert node3.next == node2;
            assert node2.next == node1;
            assert node2.prev == node3;
            assert node1.next == node0;
            assert node1.prev == node2;
            assert node0.prev == node1;
        }
    }
}
