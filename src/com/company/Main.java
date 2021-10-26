package com.company;

import java.util.Arrays;

//import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        double expenses = 0;
        int[] payments = { 110000, 115000, 110000, 115000, 110000, 115000, 110000, 115000, 110000, 115000, 110000, 115000, 110000, 115000, 110000, 115000, 110000, 115000, 110000, 115000, 110000, 115000, 110000, 115000, 110000, 115000, 110000, 115000, 110000, 115000};
        for (int i = 0; i < payments.length; i++) {
            expenses = expenses+ payments[i];
            System.out.println(expenses);
        }
        double expensesMin = 110000;
        int  expensesMax = -1;

        System.out.println("Сумма трат за месяц составила "+expenses + " рублей");
        int[] paymentsDay = {10000, 3000, 58000, 39000};

        for (int i = 0; i < paymentsDay.length; i++) {
            if (expensesMin > paymentsDay[i])
                expensesMin = paymentsDay[i];
            if (expensesMax < paymentsDay[i])
                expensesMax = paymentsDay[i];
        }
        System.out.println("Минимальная сумма трат за день составила " + expensesMin + " рублей.");
        System.out.println("Максимальная сумма трат составила " + expensesMax + " рублей.");

        double expensesAverage = 0;
        expensesAverage = expenses / payments.length;
        System.out.println("Средняя сумма трат за месяц составила " + expensesAverage + " рублей.");
        char[] reversFullName =  { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char fio =' ';

        for (int i = reversFullName.length-1; i >= 0; i= i - 1) {
            fio =reversFullName[i];
            System.out.print(fio);
        }
        System.out.println();
        int row=3;
        int column = 3;
        int ed = 1;
        int[][] matrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == j || i == column - 1 - j)
                    matrix[i][j] = ed;

              //  if (i == column - 1 - j)
              //      matrix[i][j] = ed;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
//Задача 6
        int [] six = {5,8,2,3,9};
        int[] six2;
        int j =0;
        six2 = new int [5];
        for (int i = six.length-1; i >=0; i--) {
            six2[j] = six[i];
            j ++;

        }
        System.out.println(Arrays.toString(six));
        System.out.println(Arrays.toString(six2));
 //Задание 7
        int prom = 0;
        for (int i = 0; i < six.length/2; i++) {
            prom = six[i];
            six[i] = six[six.length-1-i];
            six[six.length-1-i] = prom;
        }
        System.out.println(Arrays.toString(six));
//Задача 8-9
        int[] arr = {-6, 2, 5, -8, 8, 10, 4,-7, 12, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = i+1; i1 < arr.length; i1++) {
                if (arr[i] + arr[i1] == -2)
                System.out.println(arr[i] + " " + arr[i1]);}
            }


        }
        //System.out.println(Arrays.toString(arr));
        // write your code here
    }


