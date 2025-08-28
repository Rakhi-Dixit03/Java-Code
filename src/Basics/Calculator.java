package Basics;

import java.util.Scanner;

public class Calculator {

    //BASIC CALCULATOR

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice=0;


        do {

            System.out.println("Enter first number : ");
            int num1 = sc.nextInt();
            System.out.println("Enter second number : ");
            int num2 = sc.nextInt();

            System.out.println("Enter operator symbol from +,-,*,/,%");
            char op = sc.next().charAt(0);

            switch (op) {

                case '+':
                    System.out.println("Sum of two numbers is : " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Subtraction of two numbers is : " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Multiplication of two numbers is : " + (num1 * num2));
                    break;

                case '/': {
                    if (num2 == 0) {
                        System.out.println("Division not possible!");
                        break;

                    }else{
                        System.out.println("Division of two numbers is : " + (num1 / num2));
                        break;
                    }

                }

                case '%': {
                    if (num2 == 0) {
                        System.out.println("It is not possible to find out remainder!");
                        break;
                    }else{
                        System.out.println("Remainder is : " + (num1 % num2));
                        break;
                    }

                }

                default:
                    System.out.println("Not a valid Operation!");
            }
            System.out.println("If you want to continue Enter 1 otherwise Enter 0 : ");
            choice=sc.nextInt();

        }while(choice==1);


    }

}
