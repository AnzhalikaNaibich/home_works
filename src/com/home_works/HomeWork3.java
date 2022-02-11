package com.home_works;

import java.util.Arrays;
import java.util.Random;

public class HomeWork3 {
    public static void main(String[] args) {
        //task1(); //определить индексы четных элементов массива
        //task2(); //Среднее арифметическое положительных элементов массива
        //task3(); //Максимальный отрицательный элемент массива
        //task4(); //Число, чаще всего встречающееся в массиве
        //task5(); //Найти наибольший элемент и его порядковый номер в массиве
        //task6(); //Поменять местами минимальный и максимальный элементы
        //task7(); //Сдвиг массива
        //task8(); //Неповторяющиеся элемнты массива
        //task9(); //Реверс массива
        task10(); //Сумма четных положительных элементов массива
    }

    public static void task1() {
        int[] array = {8, 3, 15, 6, 4, 2};
        int[] array2 = new int[6];
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array2[i] = i;
                System.out.print(array2[i] + " ");
            }
        }
        System.out.println();

        // или с рандомными числами
        Random random = new Random();
        int[] array3 = new int[10];
        int[] array4 = new int[10];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = random.nextInt(100);
            System.out.print(array3[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] % 2 == 0) {
                array4[i] = i;
                System.out.print(array4[i] + " ");
            }
        }
    }

    public static void task2() {
        int[] array = {-5, -1, 0, 1, 4, 5, 8, 9};
        double sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
                count += 1;
                {
                    System.out.print(array[i] + " ");
                }
            }
        }
        double avg = sum / count;
        System.out.println();
        System.out.println("среднее " + avg);
    }

    public static void task3() {
        int[] array = {-9, -7, -1, -3, -5, 0, 1, 4, 5, 8, 9};
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max && array[i] < 0) {
                max = array[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }

    public static void task4() {
        int[] array = {11, 22, 2, 5, 6, 7, 1, 22, 333, 4};
        int num = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int count2 = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count2++;
                }
                if (count2 > count) {
                    count = count2;
                    num = array[i];
                }
            }
        }
        System.out.println(num + " Встречается: " + count);
    }
    public static void task5() {
        int[] array = new int[25];
        Random random = new Random();
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(max);
        System.out.println(index);
    }
    public static void task6() {
        int[] array = new int[9];
       Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        int max = array[0];
        int min = array[0];
        int index_max = 0;
        int index_min = 0;
        for (int i = 0; i < array.length; i++) {
                    if (array[i] > max) {
                        max = array[i];
                        index_max = i;
                    }
                    else if (array[i] < min) {
                        min = array[i];
                        index_min = i;
                    }
        }
        System.out.println();
        System.out.println(max + " " + min);
        int a = array[index_max];
        array[index_max] = array[index_min];
        array[index_min] = a;
     for (int i = 0; i < array.length; i++) {
         System.out.print(array[i] + " ");
     }
    }
    public static void task7() {
        int[] array = {2, 4, 1, 10,};
        int step = 2;
        for (int i = 0; i < step; i++) {
            for (int j = 0; j < array.length - 1; j++){
                array[j] = array[j+1];
                System.out.println(Arrays.toString(array));
            }
            array[array.length - 1] = 0;
        }
    }
    public static void task8() {
        int[] array = {11, 22, 22, 5, 6, 5, 5, 22, 333, 5};
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if(count == 1)
                System.out.print(array[i] + " ");
        }
    }

    public static void task9() {
        int [] array = {1, 2, 3, 4, 5};
        int j = 0;
        int[] reverse = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--, j++) {
            reverse[j] = array[i];
            System.out.print(reverse[j] + " ");
        }
    }
    public static void task10() {
        int[] array = {-9, 5, -1, -3, 5, 0, 1, 4, 5, 8, 9};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        System.out.println("сумма четных положительных элеиентов равна " + sum);
    }
}
