package com.array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Array data = new Array(3);

        data.insert(7);
        data.insert(12);
        data.insert(4);
        data.insert(6);
        data.insert(9);

        data.removeAt(3);

        int[] reversedArray = data.reverse();
        System.out.println(Arrays.toString(reversedArray));
        System.out.println(data.indexOf(4));
        System.out.println(data.max());

        data.insertAt(21,9);
        data.print();
    }
}
