package ru.plnvoran;

public class Operations {
    public static void main(String[] args) {

        int a = 100;
        int b = 23;
        double c = 3.3;

        int maxInt=2147483647;
        int minInt=-2147483648;

        System.out.println("Math");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));

        System.out.println("Logic");
        System.out.println(a + " = " + b + " " + (a==b));
        System.out.println(a + " < " + b + " " + (a<b));
        System.out.println(a + " > (" + b + "-1) " + (a>(b-1)));
        System.out.println(a + " => (" + b + "+77) " + (a>=(b+77)));
        System.out.println(a + " <= (" + b + "*10) " + (a<=(b*10)));

        System.out.println("Overflow");
        System.out.println("Max int + 1 = Min int = " + (maxInt + 1));
        System.out.println("Min int - 1 = Max int = " + (minInt + (-1)));

        System.out.println("Type combinations");
        System.out.println(a + " with type int + " + c +" with type double = " + (a + c));

    }
}
