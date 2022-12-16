package ru.mirea.task23;

public class Dog {
    private String name;
    private int size;
    private int year;
    public Dog(String name, int size,int year) {
        this.name = name;
        this.size = size;
        this.year = year;
    }
    public int hashCode() {
        int result;
        if(name == null) {
            result = 0;
        } else
            result = name.hashCode();
        return result;
    }
    public static void main(String[] args){
        Dog dog1 = new Dog("Bob", 45, 2);
        Dog dog2 = new Dog("Rex", 23, 3);
        Dog dog3 = new Dog("Rex", 25, 2);
        if (dog1.hashCode() == dog2.hashCode()){
            System.out.println("Dog " + dog1.name + " is equal to the dog " + dog2.name);
        }
        else
            System.out.println("Dog " + dog1.name + " is not equal to the dog " + dog2.name);
        if (dog2.hashCode() == dog3.hashCode()){
            System.out.println("Dog " + dog2.name + " is equal to the dog " + dog3.name);
        }
        else
            System.out.println("Dog " + dog2.name + " is not equal to the dog " + dog3.name);
    }
}
