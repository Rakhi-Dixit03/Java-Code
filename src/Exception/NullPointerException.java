package Exception;

public class NullPointerException {

    public static void main(String[] args) {

        String name=null;

        try {
            int length = name.length();//This will throw a null Pointer exception
            //When attempting to use a reference that points to no object

            System.out.println("Your name has  " + length + " letters.");

        }catch (java.lang.NullPointerException e){
            System.out.println("Cannot call method on null objects : "+e.getMessage());
        }

    }



}
