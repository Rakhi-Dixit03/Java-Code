package OOPs;

//Implementation of Multiple Inheritance using interfaces

//An interface is just like an abstract class but here in interfaces all methods need
// to be public and abstract unlike abstract classes
//Interface defines a contract that classes can implement,enabling 100% abstraction and multiple inheritance
//Java doesn't support multiple inheritance at class level
//Multiple inheritance can only be implemented in java through interfaces
// By Default  all the methods in interfaces are public and abstract
//And all the fields/variables are public,static and final

//1st Interface Animal containing two methods nameOfAnimal and move
public interface Animal {
    void nameOfAnimal(String name);
    void move();
}

//2nd Interface Herbivorous containing eatPlant method
interface Herbivorous{
    void eatPlant(String plantName);


}

//3rd Interface carnivorous containing eatMeat method
interface Carnivorous{

    void eatMeat();

}

class Color{
    void color(String color){
        System.out.println("Color of our animal is "+color);
    }
}


//class Bear extends one class Color and implementing 3 interfaces at a time Animal,Herbivorous and Carnivorous
//Showing how Multiple inheritance works in java

class Bear extends Color implements Animal,Herbivorous,Carnivorous {
//implementation of  eatPlant Method
    public void eatPlant(String plantName){

        System.out.println("Eats green plants like:"+plantName);



    }
    //implementation of move Method
    public void move(){
        System.out.println("It moves Slowly.");

    }
    //implementation of  nameOfAnimal Method
    public void nameOfAnimal(String name){
    System.out.println("Our Animal is :"+name);


    }
    //implementation of eatMeat Method
    public void eatMeat(){

        System.out.println("Eats meat.");
    }

}