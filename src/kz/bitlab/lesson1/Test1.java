package kz.bitlab.lesson1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Integer a = 356;
        String number = a.toString();
        String[] strArray = number.split("");
        a = Integer.parseInt(strArray[2]);
        System.out.println(strArray[2]);
    }
}
