package OOPs;

public class DigitalPet {

//Instance variables or Properties
    private String name;
    private  HungerLevel hungerLevel;
    private Happiness happinessLevel;
    private boolean isSleeping;

    //0-Parameter Constructor
    public DigitalPet(){

    }
  //Parameterised Constructor
    public DigitalPet(String name,HungerLevel level,Happiness happy,boolean sleep){
        this.hungerLevel=level;
        this.happinessLevel=happy;
        this.isSleeping=sleep;

    }

    //Public getters and Setters


    //Getters
    public String getName(){
        return this.name;
    }


    public HungerLevel getHungerLevel(){
        return this.hungerLevel;
    }

    public Happiness getHappinessLevel(){
        return this.happinessLevel;
    }

    public boolean getIsSleeping(){
        return this.isSleeping;

    }


    //Setters

    public void  setName(String name){
        this.name=name;
    }


    public void setHungerLevel(HungerLevel level){
         this.hungerLevel=level;
    }



    public void setHappinessLevel(Happiness level) {
        this.happinessLevel = level;
    }


    public void setIsSleeping(boolean sleep){
        this.isSleeping=sleep;

    }


    //Methods
    public void feed(){
        hungerLevel=HungerLevel.Low;
        System.out.println("Pet has eaten it's food.Now it's hunger level is "+hungerLevel);
    }

    public void play(){

        happinessLevel=Happiness.Extremely;
        System.out.println("Pet is enjoying playing...It is feeling : "+happinessLevel+" happy.");
    }

    public void sleep(){
        isSleeping=true;
        System.out.println("Pet is sleeping now.");
    }


    public void displayPet(){

        System.out.println("**************************");
        System.out.println("Your Pet's name is "+name);
        System.out.println("How much hungry is it feeling ? ");

        if(hungerLevel==HungerLevel.Low){
            System.out.println(hungerLevel+" because It has just eaten it's food.");
        }else {
            System.out.println("Feed your dog it is feeling "+hungerLevel+" hunger");
        }

        System.out.println("It is looking "+happinessLevel+" happy");
        System.out.println("Is it Sleeping ?\n"+isSleeping);

    }


}
