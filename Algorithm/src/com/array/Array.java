package com.array;

public class Array {
    private int[] items;
    private int count;

    public Array(int length){
        items = new int[length];
    }

    public void insert(int item){
        if(items.length == count){
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items=newItems;
        }
        items[count] = item;
        count++;
    }

    public void removeAt(int index){
        if(0 > index || count <= index){
            System.out.println(-1);
        }

        for (int i = index; i < count; i++) {
            items[i] = items[i+1];
        }
        count--;
    }

    public int indexOf(int item){
        for (int i = 0; i < count; i++) {
            if(item == items[i]){
                return i;
            }
        }
        return -1;
    }

    public int max(){
        int maxVal=0;
        for (int i = 0; i < count; i++) {
            if(items[i] > maxVal) maxVal=items[i];
        }
        return maxVal;
    }

    public int[] reverse(){
        int[] reverseArray = new int[count];
        int reverseCounter = count - 1;
        for (int i = 0; i < count ; i++) {
            reverseArray[i] = items[reverseCounter];
            reverseCounter--;
        }
        return reverseArray;
    }

    public void insertAt(int item, int index){
        if(index < 0) {
            System.out.println(-1);
            return;
        }

        else if(index > count) {
            int[] newItems = new int[index + 1];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            newItems[index] = item;
            count=newItems.length;
            items=newItems;
            return;
        }

        else {
            int[] newItems = new int[count + 1];
            for (int i = 0; i < newItems.length; i++) {
                if(i < index) newItems[i] = items[i];
                else if(i == index) newItems[index] = item;
                else if(i > index)  newItems[i] = items[i-1];
            }
            items=newItems;
        }
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
