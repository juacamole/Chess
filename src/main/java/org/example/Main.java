package org.example;

import javax.swing.plaf.synth.SynthOptionPaneUI;

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
        System.out.println("Grösste zahl " + a[a.length - 1]);

        int[] c = new int[10];
        for (int i = 10; i < 20; i++) {
            c[i -10] = i + 1;
            System.out.println(c[i -10]);
        }

        int[] d = new int[10];
        for (int i = 0; i < 10; i++) {
            d[i] = a[i] + c[i];

        }
        for (int z = 0; z < d.length; z++){
            System.out.println(d[z]);
        }
    }
}