package task3;

import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> bank;

    public Bank() {
        this.bank = new ArrayList<>();
    }

    public void addAcc(BankAccount account) {
        bank.add(account);
    }

    public void refill(BankAccount account, double amount) {
        if (bank.contains(account)) {
            double accValue = bank.get(bank.indexOf(account)).getBalance();
            bank.get(bank.indexOf(account)).setBalance(accValue + amount);
        } else {
            System.out.println("Такого счета нет");
        }
    }

    public void info(){
        for (BankAccount account : bank) {
            System.out.println(account);
        }
    }

    public void withdraw(BankAccount account, double amount){
        if (bank.contains(account)) {
            double accValue = bank.get(bank.indexOf(account)).getBalance();
            if(accValue >= amount){
                bank.get(bank.indexOf(account)).setBalance(accValue - amount);
            } else {
                System.out.println("Недостаточно средств на счете");
            }

        } else {
            System.out.println("Такого счета нет");
        }
    }

    public void move(BankAccount from, BankAccount to, double amount){
        if (bank.contains(from) && bank.contains(to)) {
            double accFromValue = bank.get(bank.indexOf(from)).getBalance();
            double accToValue = bank.get(bank.indexOf(to)).getBalance();
            if(accFromValue >= amount){
                bank.get(bank.indexOf(from)).setBalance(accFromValue - amount);
                bank.get(bank.indexOf(to)).setBalance(accToValue + amount);
            } else {
                System.out.println("Недостаточно средств на счете");
            }

        } else {
            System.out.println("Такого счета нет");
        }
    }

    public void checkBalance(BankAccount account){
        System.out.println(account);
    }
}
