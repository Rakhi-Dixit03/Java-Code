package Basics;

//Methods and Parameters Practice


import java.util.ArrayList;

public class ATM {

    private static int TotalBalance;
    private static final ArrayList<String> transactionLog=new ArrayList<>();


    public ATM(){

    }

    public ATM(int initialAmount){
        TotalBalance=initialAmount;
        transactionLog.add("Initial Amount "+initialAmount);

    }

    public void deposit(int amount){

        if(amount>0){
            TotalBalance+=amount;
            System.out.println("Amount Deposited successfully!");
            transactionLog.add("Amount Deposited "+amount);
            System.out.println("Now Your New  Balance is : ₹"+TotalBalance);

        }
    }

    public void withDraw(int amount){

        if(amount>TotalBalance){
            System.out.println("You don't have enough balance to make this transaction.");
            System.out.println("Your current Balance is : "+TotalBalance);

        }else{

            TotalBalance-=amount;
            System.out.println("₹"+amount+" Amount Withdrawn SuccessFully!");
            transactionLog.add("Amount Withdrawn "+amount);
            System.out.println("Remaining Balance is : ₹ "+TotalBalance);


        }


    }

    public void checkBalance(){
        System.out.println("Your Balance is : "+TotalBalance);

    }

   public  void displayTransactions(){

        transactionLog.add("Current Balance : "+TotalBalance);
        System.out.println("**** Transaction History ****");
        for(String trans : transactionLog){

            System.out.println(trans);

        }


   }

}
