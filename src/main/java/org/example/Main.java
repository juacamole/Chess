package org.example;

public class Main {
    public static void main(String[] args) {

        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i + 1;
            System.out.println(a[i]);
        }
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            b = b + a[i];
        }
        System.out.println(b);
        System.out.print("Grösste zahl " + a[a.length - 1]);

        int[] c = new int[20];
        for (int i = 10; i < 20; i++) {
            a[i] = i + 1;
            System.out.println(c[i]);
        }
    }
}