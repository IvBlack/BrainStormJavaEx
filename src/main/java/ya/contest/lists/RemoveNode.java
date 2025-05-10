package ya.contest.lists;

public class RemoveNode {

    public static void main(String[] args) {
        Solution.test();
    }
    static class Node<V> {
        public V value;
        public Node<V> next;

        public Node(V value, Node<V> next) {
            this.value = value;
            this.next = next;
        }

        public  void print(){
            System.out.println(this.value);
        }
    }
// <template>

    public static class Solution {
        public static Node<String> solution(Node<String> head, int idx) {
            if(idx < 0 || head == null) {
                return head;
            }

            Node<String> prev = null;
            //с головы начать
            Node <String> current = head;
            int currIdx = 0;

            while (current != null && currIdx < idx) {
                prev = current;
                current = current.next;
                currIdx++;
            }



            //отвяжем ссылки от удаленной ноды
            if (current != null) {
                prev.next = current.next;
            } else if (idx == 0) {
                head = head.next;
            } else {
                System.out.println("Current node is null!");
            }
            head.print();
            return head;
        }

        private static void test() {
            Node<String> node3 = new Node<>("node3", null);
            Node<String> node2 = new Node<>("node2", node3);
            Node<String> node1 = new Node<>("node1", node2);
            Node<String> node0 = new Node<>("node0", node1);
            Node<String> newHead = solution(node0, 1);
            assert newHead == node0;
            assert newHead.next == node2;
            assert newHead.next.next == node3;
            assert newHead.next.next.next == null;
            // result is : node0 -> node2 -> node3
        }
    }
}

            /*
            * def solution(node, index):
    def get_node_by_index(node, index):
        while index:
            node = node.next_item
            index -= 1
        return node

    if index == 0:
        node = node.next_item
    else:
        # получаем предыдущий элемент связанного списка
        previous_node = get_node_by_index(node, index - 1)
        # получаем следующий элемент связанного списка
        next_node = get_node_by_index(node, index + 1)
        # заменяем next_item предыдущего элемента на следующий элемент списка
        previous_node.next_item = next_node
        return node*/
