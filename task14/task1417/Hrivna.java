package com.javarush.task.task14.task1417;

public class Hrivna extends Money {
    public Hrivna(double amount) {
        super(amount);
    }

    @Override
    public double getAmount() {
        return 2.63;
    }

    @Override
    public String getCurrencyName() {
        return "UAH";
    }
}
