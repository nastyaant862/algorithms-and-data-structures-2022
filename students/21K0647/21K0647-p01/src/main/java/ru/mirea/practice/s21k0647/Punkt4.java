package ru.mirea.practice.s21k0647;

import java.util.Scanner;

public class Punkt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []array = new int[n];
        int i = 0, j = 0, maxi = -999999999, mini = 999999999;
        float a = 0;
        while (i < n) {
            int b = sc.nextInt();
            array[i] = b;
            i++;
        }
        while (j < n) {
            a += array[j];
            if (array[j] < mini) {
                mini = array[j];
            }
            if (array[j] > maxi) {
                maxi = array[j];
            }
            j++;
        }

        j = 0;
        float b = 0;
        do {
            b += array[j];
            j++;
        } while (j < n);
        System.out.print("Sum: ");
        System.out.println(b);
        System.out.print("SR: ");
        System.out.println(b / n);
        System.out.print("Min: ");
        System.out.println(mini);
        System.out.print("Max: ");
        System.out.println(maxi);
    }
}