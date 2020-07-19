package com.bharati.learning.qa;

public class BubbleSort {

    public static int[] sort(int[] numbers, MySort sortingOrder) {

        for (int x = 0; x < numbers.length; x++) {
            for (int y = 0; y < numbers.length; y++) {
                if (sorted(numbers[x], numbers[y], sortingOrder)) {
                    int temp = numbers[x];
                    numbers[x] = numbers[y];
                    numbers[y] = temp;
                }
                System.out.print(String.format("%d,", numbers[y]));

            }
            System.out.println("\n-----------------------");

        }
        return numbers;
    }

    private static boolean sorted(int x, int y, MySort sortingOrder) {
        if (sortingOrder == MySort.ASC) {
            return x <= y;
        } else {
            return y <= x;
        }
    }

}
