package com.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
    }
    private Node first;
    private Node last;
    private int size=0;

    public void addLast(int item){
        var node = new Node(item);
        if(first == null) {
            first = last = node;
        }
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item){
        var node = new Node(item);
        if(first == null) {
            first = last = node;
        }
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public void addItem(int item, int position){
        var current = first;
        int index = 0;
        while (current != null){
            if(index == (position-1)){
                var temp = current.next;
                Node val = new Node(item);
                val.next = temp;
                current.next = val;
            }
            current = current.next;
            index++;
        }
    }


    public int indexOf(int item){
        int index = 0;
        Node current = first;
        while (current != null){
            if(current.value == item){
                return index;
            }
            else{
                current = current.next;
                index++;
            }
        }
        return -1;
    }

    public boolean contains(int item){
        Node current = first;
        while (current != null){
            if (current.value == item){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void removeFirst(){
        if(first == null){
            throw new NoSuchElementException();
        }
        if(first == last){
            first = last = null;
        }
        else {
            Node second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    public void removeLast(){
        if(first == null){
            throw new NoSuchElementException();
        }
        else if(first == last){
            first = last = null;
        }
        else{
            var current = first;
            while (current != null){
                if(current.next == last)
                    break;
                current = current.next;
            }
            var previous = current;
            previous.next = null;
            last = previous;
        }
        size--;
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        int[] array = new int[size];
        var current = first;
        int index = 0;
        while (current != null){
            System.out.println(current.value);
            array[index] = current.value;
            index++;
            current = current.next;
        }
        return array;
    }

    public int[] reverseArray(){
        int[] array = new int[size];
        var current = first;
        int index = size-1;
        while (current != null){
            array[index] = current.value;
            index--;
            current = current.next;
        }
        return array;
    }

    public void reversedLinkedList(){
        var previous = first;
        var current = first.next;
        while(current != null){
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        first = previous;
    }

}
