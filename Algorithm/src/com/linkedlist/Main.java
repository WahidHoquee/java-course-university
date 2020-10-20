package com.linkedlist;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        var linkedList = new LinkedList();

        linkedList.addLast(5);
//        linkedList.removeFirst();
//        linkedList.removeLast();
        System.out.println(linkedList.size());

        linkedList.addLast(10);
//        System.out.println(linkedList.size());
        linkedList.addFirst(2);
        linkedList.addFirst(7);
        linkedList.addFirst(19);

//        System.out.println(linkedList.size());

//        System.out.println(linkedList.indexOf(5));
//        System.out.println(linkedList.contains(50));
//        linkedList.removeFirst();
//        linkedList.removeLast();
        System.out.println(Arrays.toString(linkedList.toArray()));
        linkedList.addItem(11,3);

//        System.out.println(Arrays.toString(linkedList.reverseArray()));
//        linkedList.reversedLinkedList();
//        System.out.println(linkedList.size());

    }
}
