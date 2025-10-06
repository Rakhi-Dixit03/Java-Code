package Exception;

import java.io.*;

public class FileReading {

    public static void main(String[] args) {
//
        try(BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\DELL\\Desktop\\Demo.txt"))){

            String line;

            while((line = br.readLine())!=null){

                System.out.println(line);


            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!"+e.getMessage());

        }catch (IOException e){

            System.out.println("An I/O error occured !"+e.getMessage());
        }



    }

}
