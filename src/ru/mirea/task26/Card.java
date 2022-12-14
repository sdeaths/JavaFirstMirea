package ru.mirea.task26;

public class Card extends Payment{
    public Card (){
        super(new CardStrategy());
    }
}
