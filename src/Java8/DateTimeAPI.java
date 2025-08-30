package Java8;
import java.time.*;
import java.time.format.DateTimeFormatter;


public class DateTimeAPI {


    public static void main(String[] args){

        //Date API in Java8

        LocalDate today=LocalDate.now();// For Getting Current Date
        System.out.println("Current Date : "+today);
        LocalDate specificDate=LocalDate.of(2025,7,30);//For Creating Specific Date
        System.out.println("Specific Date : "+specificDate);
        LocalDate parsedDate=LocalDate.parse("2024-12-02");//Parsing from String Value
        System.out.println("Parsed date : "+parsedDate);


        DateTimeFormatter formatter=DateTimeFormatter.ISO_DATE;
        LocalDate newDate=LocalDate.parse("2003-08-11",formatter);
        System.out.println("Formatted date 1 : "+newDate);
        System.out.println("Formatted date 1 : "+newDate.format(formatter));

        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date1= LocalDate.parse("21/08/2024",format1);

        System.out.println("Formatted date 2 : "+date1);

        System.out.println("Formatted date 2 : "+date1.format(format1));


        // Time API in Java8

        LocalTime time=LocalTime.now();// Getting current time
        System.out.println("Current Time : "+time);
        LocalTime specificTime=LocalTime.of(1,50,0);//Creating a Specific Time
        System.out.println("Specific Time : "+specificTime);
        LocalTime parsedTime=LocalTime.parse("15:40:20");//Parse from a String
        System.out.println("Parsed Time : "+parsedTime);


        // Current Local Date and Time

        LocalDateTime dateTime=LocalDateTime.now();

        System.out.println("Current Local date and Time : "+dateTime);

        // Current date and time in specific time zone
        ZonedDateTime zonedDateTime =ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Date and Time in New_York : "+zonedDateTime);

      //Period and Duration

        Period p=Period.between(LocalDate.of(2025,3,12),LocalDate.now());
        System.out.println(p.getYears()+" years "+p.getMonths()+" Months "+p.getDays()+" Days ");

        Duration d1=Duration.between(LocalTime.NOON,LocalTime.now());
        System.out.println("1st Duration is : "+d1);

        LocalTime start=LocalTime.of(15,20);
        LocalTime end=LocalTime.of(20,20);
        Duration d2=Duration.between(start,end);
        System.out.println("2nd Duration is : "+d2);


    }


}
