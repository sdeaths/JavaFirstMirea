package ru.mirea.task26;

public class Payment {
    PaymentStrategy paymentStrategy;

    public Payment(PaymentStrategy paymentStrategy)
    {
        this.paymentStrategy = paymentStrategy;
    }

    public void askData()
    {
        paymentStrategy.askData();
    }
}
