package Arrays;

import java.util.Scanner;

public class GradeBookOperator {

    public static void main(String[] args) {



        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of Students for whom you want to calculate grades  : ");
        int n=sc.nextInt();
        System.out.println("Enter number of Subjects : ");
        int numOfSub=sc.nextInt();

        GradeBook gradeBook=new GradeBook(n,numOfSub);
        int ans=0;


        do {

            System.out.println("Enter your choice  which operation you want to perform : ");
            System.out.println("1 for adding Student Names");
            System.out.println("2 for adding student's subjects grades");
            System.out.println("3 for displaying grades ");
            System.out.println("4 for Getting Average grades in each subject");
            System.out.println("5 for getting highest grades student in each subject");
            System.out.println("6 for lowest grade student in each subject.");

            int choice = sc.nextInt();


            switch (choice) {

                case 1:
                    gradeBook.addStuNames();
                    break;
                case 2:
                    gradeBook.addStuGrades();
                    break;

                case 3:
                    gradeBook.displayGrades();
                    break;

                case 4:
                    gradeBook.averageGrades();
                    break;

                case 5:
                    gradeBook.highestGrade();
                    break;
                case 6:
                    gradeBook.lowestGrade();
                    break;
                default:
                    System.out.println("Not a valid input try something else.");

            }
            System.out.println("Enter your choice : To continue press 1 otherwise 0 ");
            ans=sc.nextInt();

        }while(ans==1);



    }

}
