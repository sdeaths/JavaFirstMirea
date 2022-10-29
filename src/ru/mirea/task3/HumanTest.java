package ru.mirea.task3;

public class HumanTest {
    public static void main(String[] args){
        Human human = new Human(new Head("Brown"), new Leg(41), new Hand(47));
        System.out.println((human.toString()));
    }
}
