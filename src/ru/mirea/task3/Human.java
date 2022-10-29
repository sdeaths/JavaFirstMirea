package ru.mirea.task3;

import java.util.Arrays;

class Head{
    private String eye;
    private String hair;

    public Head(){
        this.eye = "Blue";
        this.hair = "Brown";
    }
    public Head(String eye){
        this();
        this.eye = eye;
    }
    public Head(String eye, String hair){
        this(eye);
        this.hair = hair;
    }
    @Override
    public String toString(){
        return "Head{" + "eye= " + eye + ", hair= " + hair + '}';
    }
}
class Leg{
    private int lenght;
    Leg(int lenght){
        this.lenght = lenght;
    }
    @Override
    public String toString(){
        return "Leg{" + "lenght=" + lenght + '}';
    }
}
class Hand{
    private int lenght;
    Hand(int lenght){
        this.lenght=lenght;
    }
    @Override
    public String toString(){
        return "Hand{" + "lenght=" + lenght + '}';
    }
}
public class Human {
    private Leg legs;
    private Hand hands;
    private Head head;

    public Human(Head head, Leg legs, Hand hands){
        this.head = head;
        this.legs = legs;
        this.hands = hands;
    }
    @Override
    public String toString(){
        return "Human{" + "legs= " + legs.toString() + ", hands= " + hands.toString() + ", head= " + head + '}';
    }
}
