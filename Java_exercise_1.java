import jdk.jfr.Percentage;

import java.util.Scanner;

// Write a program to calculate percentage of a given student in CBSE board exam.His marks from 5 subject must be taken as input form the keyboard.(Marks are out of 100 0.
public class Java_exercise_1 {
    public static void main(String[]args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the numbers of five subjects");
        System.out.println("Enter the numbers in Physics subjects");
        int Physics = sc.nextInt();
        System.out.println("Enter the numbers in Hindi subjects");
        int Hindi = sc.nextInt();
        System.out.println("Enter the numbers in English subjects");
        int Englsih = sc.nextInt();
        System.out.println("Enter the numbers in Math subjects");
        int Math= sc.nextInt();
        System.out.println("Enter the numbers in Chemistry subjects");
        int Chemistry = sc.nextInt();

        float  Total = Physics + Hindi + Englsih + Math + Chemistry;
        float Average = Total/5;
        float Percentage  = (Total/500)*100;
        System.out.println("The Total marks is " +Total);
        System.out.println("The Average marks is " +Average);
        System.out.println("The Percentage marks is " +Percentage);
    }
}
