package Arrays;

//For Storing and Analysing Numerical Data

import java.util.Scanner;

public class GradeBook {

   private int numOfStudents;
   private int numOfSub;
   private String[] stuNames;
   private  int[][] Grades;
   Scanner sc=new Scanner(System.in);

    public GradeBook(){
    }

    public GradeBook(int n,int noOfSubjects){
        numOfStudents=n;
        numOfSub=noOfSubjects;
        stuNames=new String[n];
        Grades=new int[n][numOfSub];

    }


    //Method to add Students

    public void addStuNames() {

        for (String stuName : stuNames) {
            if (stuName != null) {
                System.out.println("Elements already added!");
                return;
            }
        }

        for (int i = 0; i < stuNames.length; i++) {
            System.out.println("Enter Student's Full Name : ");
            stuNames[i] = sc.nextLine();
        }

    }

    //Method to add  Grades

     public void  addStuGrades(){


         for (int[] grades: Grades) {
             for(int grade: grades){
                 if (grade!= 0) {
                     System.out.println("Elements already added!");
                     return;
                 }

             }

         }

         for(int i=1;i<=numOfStudents;i++){
             System.out.println("Enter Grades of Student  "+i);
             for(int j=1;j<=numOfSub;j++){
                 System.out.println("Enter his/her Grades in Subject "+j);
                 Grades[i-1][j-1]=sc.nextInt();

             }
         }
    }


  //Displaying Grades

   public void displayGrades(){
        if(Grades==null){
            System.out.println("Can't find relevant data!");
            return;
        }
        for(int i=0;i<numOfStudents;i++){

            System.out.println("Name : "+stuNames[i]);
            System.out.print("Grades of All Subjects : ");

            for(int j=0;j<numOfSub;j++){
                System.out.print(Grades[i][j]+" ");

            }
            System.out.println();
            System.out.println("*******************");

        }



   }

   //Displaying Average Grade in each subject

   public void averageGrades(){

      if(Grades==null || numOfStudents==0){
          System.out.println("There is no relevant data available.");
          return;
      }
      int avgGradeOfSub=0;
      int sum=0;

       for(int j=0;j<numOfSub;j++){
           sum=0;
           avgGradeOfSub=0;

           for(int i=0;i<numOfStudents;i++){

              sum+=Grades[i][j];

           }
           avgGradeOfSub=sum/numOfStudents;
           System.out.println("Average Grade of Subject "+(j+1)+" is : "+avgGradeOfSub);
       }


   }

   //Method to Display the highest grade in each subject along with his/her name

    public void highestGrade(){
        if(Grades==null){
        System.out.println("Can't find relevant data!");
        return;
        }

       for(int j=0;j<numOfSub;j++){
           int stIdx=0;
           int highest=0;
           for(int i=0;i<numOfStudents;i++){

               if(Grades[i][j]> highest){
                   highest=Grades[i][j];
                   stIdx=i;
               }


           }
           System.out.println("Higest Grade in "+(j+1)+" Subject is : "+highest+" Scored by : "+stuNames[stIdx]);
       }

    }


    public void lowestGrade(){

        if(Grades==null){
            System.out.println("Can't find relevant data!");
            return;
        }

        for(int j=0;j<numOfSub;j++){
            int stIdx=0;
            int lowest=Integer.MAX_VALUE;

            for(int i=0;i<numOfStudents;i++){

                if(Grades[i][j]<lowest){
                    lowest=Grades[i][j];
                    stIdx=i;
                }


            }
            System.out.println("Lowest Grade in "+(j+1)+" Subject is : "+lowest+" Scored by : "+stuNames[stIdx]);
        }



    }

}
