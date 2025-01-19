package Exm20122013.partie2.cnam.util;

import java.util.Scanner;

public class Terminal {

    private static Scanner sc = new Scanner(System.in);

    public static double saisirDouble(String message) {
        System.out.print(message);
        return sc.nextDouble();
    }

    public static int saisirInt(String message) {
        System.out.print(message);
        return sc.nextInt();
    }
}
