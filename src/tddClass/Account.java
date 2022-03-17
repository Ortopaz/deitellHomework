package tddClass;

public class Account {
    private int balance;

    public void deposit(int amount){
        if (amount <0) {amount = 0;}
        balance = amount + balance;
    }

//    public void withdrawal (int amount) {
//        balance = balance - amount;
//    }

    public void withdrawal (int amount){
        if (amount > balance ) {
            System.out.print("withdrawal amount must not be greater than balance");
        }
        else if(balance - amount < 1000){
            System.out.println("you must have 1k left");
        }
        else {
            balance = balance - amount;

        }
    }


    public int getBalance() {
        return balance;
    }

            }

