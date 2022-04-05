package kz.bitlab.lesson1;

import java.util.Scanner;

public class Lesson1 {
    public static String surname = "Ivanov";
    public static void main(String[] args) {
//        System.out.print("Bitlab ");
//        System.out.println("Academy");
//        System.out.println("Hello world!");

//        String name = "Almaz";
        surname = "Sadykov";

        String name = "George Washington";


//        System.out.println(name);
//        System.out.println(surname);
//        System.out.println("The first president of USA is " + name);
//
//        double a = 22;
//        double b = 3;
//        System.out.println("multiply = " + a * b);
//        System.out.println("divide = " + a / b);
//
//        int almaty = 2_000_000;
//        int astana = 1_000_000;
//        System.out.println("total = " + (almaty + astana));
//
//        double c = a / b;
//        System.out.println("divide a/b = " + c);
//
//        int x = 14940;
//        int y = 12;
//        System.out.println(x % y);

        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String myName = in.next();
        System.out.println("How old are you?");
        int myAge = in.nextInt();
        System.out.println("Hello " + myName + "! You are " + myAge + "years old.");
    }
}

class Lesson2 {

}
