package Basics;

//Primitive Variables are passed  by Value not by reference in java
//Java Supports only pass by value

public class Main {
    public static void main(String[] args) {

        ATM bankAccount=new ATM(1000);
        bankAccount.withDraw(500);
        bankAccount.deposit(100);
        bankAccount.withDraw(700);
        bankAccount.deposit(2000);
        bankAccount.checkBalance();
        bankAccount.displayTransactions();

    }
}
