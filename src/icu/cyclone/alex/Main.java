package icu.cyclone.alex;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size:");
        int[] vector = FillVector(sc.nextInt());

        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.toString(TurnoverVector(vector)));
    }

    public static int[] FillVector(int size) {
        int[] vector = new int[size];
        for (int i = 0; i < size; i++) {
            vector[i] = (int) (Math.random() * 100);
        }
        return vector;
    }

    public static int[] TurnoverVector(int[] vector) {
        int x;
        for (int i = 0; i < vector.length / 2; i++) {
            x = vector[i];
            vector[i] = vector[vector.length - 1 - i];
            vector[vector.length - 1 - i] = x;
        }
        return vector;
    }
}
