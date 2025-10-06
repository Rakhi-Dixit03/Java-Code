package Exception;

import java.util.Scanner;

public class CustomException {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your age : ");//When we enter age below 18 it will throw a custom exception
        int age=sc.nextInt();

        try{
            checkAge(age);
        }catch(InValidAgeException e){
            System.out.println(e.getMessage());
        }

    }

    public static void checkAge(int age)throws InValidAgeException{

        if(age<18){

            throw new InValidAgeException("You are not an adult!You cannot vote.");
        }

        System.out.println("Valid Age!" +age+" you can vote.");

    }


}
//Custom Exception class

class InValidAgeException extends Exception{

public InValidAgeException(String message){
    super(message);

}

}