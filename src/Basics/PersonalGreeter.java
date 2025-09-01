package Basics;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class PersonalGreeter {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("What's your Good  mame? ");
        String name=sc.nextLine();
        System.out.println("How old are you?");
        int age=sc.nextInt();
        System.out.println("When did you born? Enter your DOB in this pattern dd/MM/yyyy - ");
        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date= LocalDate.parse(sc.next(),format);
        System.out.println("What do you love to do in your free time?");
        sc.nextLine();
        String hobby=sc.nextLine();
        System.out.println("How much time do you spend on screen in a day?");
        double screenTime=sc.nextDouble();
        System.out.println("Are you a Student? Enter true/ false");
        boolean student =sc.nextBoolean();

        System.out.print("Hi! "+name+" Great to meet you!\n"+"You born on "+ date.format(format)+"\nYou have completed "+age+" years of your life.\n");
        System.out.print("You love to do "+hobby+" in your free time.\n");

        if(student){
            System.out.println("Your screen time is "+screenTime+"\nAs a student you must focus on learning!");
        }else{
            System.out.println("Enjoy your screen time! Perhaps with a cup of coffee!");
        }




    }


}
