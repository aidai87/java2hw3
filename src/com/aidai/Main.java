package com.aidai;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(2000);
        System.out.println(account.getAmount());

        while (true){
            try{
                account.withDraw(6000);

            }catch (LimitException e){
                try {
                    account.withDraw((int) account.getAmount());
                    break;
                } catch (LimitException ex) {
                    ex.printStackTrace();
                }

            }
        }

    }
}
