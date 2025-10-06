package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptions {

    public static void main(String[] args) {

        //Handling multiple Exceptions

        Scanner sc=new Scanner(System.in);

        try {
            System.out.println("Enter a number : ");

            int num = sc.nextInt();

            System.out.println("Your entered number is : " + num);

            FileReader fileReader = new FileReader("Demo.txt");
             fileReader.close();

        } catch (InputMismatchException e) {
            System.out.println("Invalid number format : "+e.getMessage());
        }catch (FileNotFoundException e){
            System.out.println("File not found! "+e.getMessage());
        }catch (IOException e){
            System.out.println("Error : file Operation failed!");
        } finally{
            System.out.println("Finally block always executes.");
        }






    }



}
