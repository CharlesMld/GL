package main.java;

public class Money{
    private int amount;
    private String currency;
    Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }
    public String toString(){
        return "Amount: "+ this.amount + " currency: "+ this.currency;
    }
}
