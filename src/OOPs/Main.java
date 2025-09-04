package OOPs;

public class Main {


    public static void main(String[] args) {
        //Creating Pet Object
        DigitalPet myPet=new DigitalPet();

        //Calling setter methods on this object

        myPet.setName("Denny");
        myPet.setHungerLevel(HungerLevel.Moderate);
        myPet.setHappinessLevel(Happiness.More);
        myPet.setIsSleeping(false);

        //Changing behaviour of object through methods

        myPet.sleep();
        myPet.feed();
        myPet.play();
        myPet.displayPet();


    }
}
