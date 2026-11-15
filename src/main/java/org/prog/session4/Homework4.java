package org.prog.session4;

import java.util.Arrays;
import java.util.Random;

public class Homework4 {

    public static void main(String[] args) {
        int[] ints = new int[1000];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(1000);
        }
            for (int i = 0; i < ints.length - 1; i++) {
            for (int j = 0; j < ints.length - i - 1; j++) {

                if (ints[j] > ints[j + 1]) {
                    int currentValue = ints[j];
                    int nextValue = ints[j + 1];
                    ints[j] = nextValue;
                    ints[j + 1] = currentValue;
                }
            }
        }
        System.out.println(Arrays.toString(ints));
    }

}

