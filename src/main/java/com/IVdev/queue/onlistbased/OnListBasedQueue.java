//package com.IVdev.queue;
//
//import java.util.AbstractQueue;
//import java.util.Iterator;
//import java.util.LinkedList;
//
///*
//Очереди в Java работают аналогично очереди к кассе в магазине.
//После того, как мы объявим нашу очередь, мы можем добавлять новые элементы в конец и удалять их из начала.
//Ниже дана реализация методов очереди с LinkedList для хранения элементов нашей очереди.
//*/
//
//public class CustomQueue<Object> extends AbstractQueue {
//
//    private LinkedList<Object> elements;
//
//    public CustomQueue() {
//        this.elements = new LinkedList<Object>();
//    }
//
//
//
//
//    @Override
//    public Iterator iterator() {
//        return elements.iterator();
//    }
//
//    @Override
//    public boolean offer(Object arg0) {
//        elements.add(arg0);
//        return true;
//    }
//
//    @Override
//    public Object peek() {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'peek'");
//    }
//
//    @Override
//    public Object poll() {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'poll'");
//    }
//
//    @Override
//    public int size() {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'size'");
//    }
//
//}
