package org.prog.demo;

public class HomeworkSession2 {
    public static void main(String[] args) {
    int divBy3 = 0;
    int divBy7 = 0;
    int divBy13 = 0;
    for (int i = 0; i < 100; i = i + 1){
        if (i % 3 == 0){
            divBy3 = divBy3 + 1;
        }
        if (i % 7 == 0){
            divBy7 = divBy7 + 1;
        }
        if (i % 13 == 0){
            divBy13 = divBy13 + 1;
        }

    }
        System.out.println("Count numbers that can be divided by 3: " + divBy3);
        System.out.println("Count numbers that can be divided by 7: " + divBy7);
        System.out.println("Count numbers that can be divided by 13: " + divBy13);
    }
}
