package com.bharati.learning.qa;

import sun.java2d.pipe.BufferedMaskBlit;

import java.util.Arrays;

public class HospitalInformation {

    private int[] numbers = new int[10];
    private String sentence1;
    private String sentence2;

    public HospitalInformation() {
    }

    public HospitalInformation(int[] numbers, String sentence1, String sentence2) {
        this.numbers = numbers;
        this.sentence1 = sentence1;
        this.sentence2 = sentence2;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public String getSentence1() {
        return sentence1;
    }

    public void setSentence1(String sentence1) {
        this.sentence1 = sentence1;
    }

    public String getSentence2() {
        return sentence2;
    }

    public void setSentence2(String sentence2) {
        this.sentence2 = sentence2;
    }

    public void sortNumbers() {
        this.numbers = BubbleSort.sort(this.numbers, MySort.DESC);
        //Arrays.sort(this.numbers);
    }

    public int[] sortAndReturnNumbers() {

        return null;
    }


    public static void main(String[] args) {
        HospitalInformation hospitalInformation = new HospitalInformation();
        int[] jptArray = {1, 5, 45, 23, 67, 99, 3, 205, 1006, 8};
        hospitalInformation.setNumbers(jptArray);
        hospitalInformation.sortNumbers();
        int[] retArray = hospitalInformation.getNumbers();
        for (int x = 0; x < retArray.length; x++) {
            System.out.print(String.format("%d,", retArray[x]));

        }

    }
}
