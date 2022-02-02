package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {20.5, 3.7, -6.1, 7.7, -88.4, 41.3, 90.9, 4.1, -56.5, 34.6, 6.7, -12.2, -9.3, 9.6, 1.0};
        double sum = 0;
        int count = 0;
        boolean negative = false;
        for (double i : numbers) {
            if (i < 0) {
                negative = true;
            }
            if (i > 0 && negative == true) {
                sum += i;
                count++;
            }
        }
        System.out.println("Средуха: "+sum / count);
        boolean sorted = false;
        double temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i+1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                    sorted = false;


                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }




}
