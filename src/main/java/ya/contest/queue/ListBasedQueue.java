//package ya.contest.queue;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.List;
//
//public class ListBasedQueue {
////    List <Node<Integer>> lst = new LinkedList<>();
////    public Node<Integer> head;
//
//    List <Integer> lst = new ArrayList<>();
//    int curr_size = 0;
//    int max_size = Integer.MAX_VALUE;
//
//    // Внутренний класс узла
////    private class Node<Integer> {
////        private Integer data;
////        private Node<Integer> next;
////
////        public Node(Integer data) {
////            this.data = data;
////            this.next = null;
////        }
////    }
//
//    public ListBasedQueue(int max_size) {
//        this.curr_size = 0;
//        this.max_size = max_size;
//    }
//
//    public boolean put(Integer nd){
////        List<Integer> q = new LinkedList<>();
//
//        if (curr_size >= max_size) {
//            return false;
//        }
//
//        lst.add(nd);
//        curr_size++;
//        return true;
//    }
//
//    public Integer get(List <Integer> lst) throws IndexOutOfBoundsException {
//        if (lst.isEmpty()) {
//            System.out.println("error");
//            return null;}
//
//        lst.remove(0);
////        Integer header = head.data;
//        curr_size--;
//        return header;
//    }
//
//    public int size(List<Node<Integer>> lst){
//        Node curr = head;
//        int count = 0;
//
//        while(curr != null){
//            curr = curr.next;
//            count++;
//        }
//        return count;
//    }
//
//    //======================================
//
//    //маршрутизатор команд из потока ввода
//    public void parse_commands(int kol_vo, String[] commands) {
////        ListBasedQueue listBasedQueue = new ListBasedQueue(10);
//
//        for (String command : commands) {
//            if (command.contains("get") && !lst.isEmpty()) {
//                System.out.println(lst.get(0));
//                get(lst);
//            } else if (command.contains("put")) {
//                put(new Node(command.replaceAll("[\\[\\]]", "").split(", ")));
//            } else if (command.contains("size")) {
//                System.out.println(size(lst));
//            }
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader
//                (
//                        new BufferedReader(new InputStreamReader(System.in))
//                );
//
//        //перехват ввода с консоли
//        int kol_vo_commands = Integer.parseInt(br.readLine());
//        String[] commands = new String[kol_vo_commands];
//
//        //массив команд
//        for (int i = 0; i < kol_vo_commands; i++) {
//            commands[i] = Arrays.toString(br.readLine().split( " "));
//        }
//
//        ListBasedQueue lbq = new ListBasedQueue(6);
//        lbq.parse_commands(kol_vo_commands, commands);
//    }
//}
