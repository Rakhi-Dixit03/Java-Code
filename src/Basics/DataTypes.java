package Basics;

public class DataTypes {

    public static void main(String []args){

        //There are 2 types of data types in java --- Primitive and Non-Primitive
       //Primitive Data Types --- There are 8 Primitive data types that are already provided by java and are fixed in size
        byte num=34;
        short s=56;
        char ch='A';
        int age=13;
        long data=54678;
        float price=45.8F;
        double large=6368.864;
        boolean choice=true;

        //Finding Size of these Data Types using static int variables i.e. MIN_VALUE & MAX_VALUE and Wrapper Classes

        System.out.println("Minimum value of int data type is :"+Integer.MIN_VALUE);// -2147483648
        System.out.println("Maximum value of int data type is :"+Integer.MAX_VALUE);// 2147483647

        System.out.println("Minimum value of byte data type is :"+Byte.MIN_VALUE);// -128
        System.out.println("Maximum value of byte data type is :"+Byte.MAX_VALUE);// 127

        System.out.println("Minimum value of long data type is :"+Long.MIN_VALUE);// -9223372036854775808
        System.out.println("Maximum value of long data type is :"+Long.MAX_VALUE);// 9223372036854775807


        //Non-Primitive data types----Not provided by java but are created by programmers and are not fixed in size
        //Also known as "reference variable" or "object reference"
        //some non-primitive data types are: classes,objects,Strings,Arrays,Interfaces etc

        String name="Rakhi";//String
        String hobbies[]={"Reading","Playing","Dancing"};//Array of Strings


        //Wrapper Classes--- The classes which are used to convert primitive into objects and
        // objects into primitive data types,There are 8 wrapper classes--
        // Boolean,Character,Byte,Short,Integer,Float,Long,Double

        //Autoboxing and Unboxing
        //Autoboxing:Automatic conversion of primitive data type into its corresponding wrapper classes by java compiler

        int a=10;
        Integer i=a;//automatic
 //     Integer ii=new Integer(a); //Explicit

        Integer iii=Integer.valueOf(a);//internally compiler will use this expression for conversion

        System.out.println(a);//10
        System.out.println(i);//10
        System.out.println(iii);//10


       //Unboxing:Automatic conversion of an object of wrapper type into its corresponding primitive value by java compiler

        Integer obj=10;
        int b= obj.intValue(); //Explicitly
        int bb=obj;  //internally --->(bb=obj.intValue(10))

        System.out.println(obj);//10
        System.out.println(b);//10
        System.out.println(bb);//10



    }

}
