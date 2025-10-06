package Exception;

import java.util.Scanner;

public class BasicException {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b=sc.nextInt();

        try{
            int ans=a/b;//This statement can cause an error so wrapping it within try block
        }catch (ArithmeticException e){//Catching/Handling using catch block

            System.out.println("Division by zero is not allowed "+e.getMessage());
        }finally {//this is for cleanup purposes

            System.out.println("Program Ended!");
        }


    }



}
