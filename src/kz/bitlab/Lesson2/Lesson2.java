package kz.bitlab.Lesson2;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        int a = 4;
//        System.out.println(a == 10);
//        System.out.println(a > 10);
//        System.out.println(a < 5);

//        if (a > 5) {
//            System.out.println("YES");
//        } else if (a == 4) {
//            System.out.println("equals");
//        } else {
//            System.out.println("NO");
//        }

        int b = 20;
        int c = 25;
        int d = 30;
        int f = 50;
//        System.out.println(d >= b && d <= c && d == f);
//        System.out.println(d >= b || d <= c);

        if (b < c && b < d) System.out.println(b);
        Scanner in = new Scanner(System.in);
        String day = in.next();
        int order = 0;

        switch (day) {
            case "Monday":
                order = 1;
                break;
            case "Tuesday":
                order = 2;
                break;
            case "Wednesday":
                order = 3;
                break;
            case "Thursday":
                order = 4;
                break;
            default:
                System.out.println("ERROR");
                break;
        }
        System.out.println(order);
    }
}
