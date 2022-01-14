package com.aidai;

public class BankAccount {

    private double amount; // текущий баллланс на счету

    public double getAmount(){
        return amount;

    }
    public void deposit(double sum){
        this.amount += sum;

    }
     public void withDraw(int sum) throws LimitException{ // Для снятия денег со  счета
        if(this.amount < sum){
            throw  new LimitException("Запрашиваемая сумма больше остатка на счету",getAmount());
        }else {
            this.amount -= sum;
            System.out.println("Снято: "+ sum);
            System.out.println("Остаток:" + getAmount());
        }

     }

}
