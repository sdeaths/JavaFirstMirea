package ru.mirea.task26;

public class EPayment extends Payment {
    public EPayment()
    {
        super(new EPaymentStrategy());
    }
}