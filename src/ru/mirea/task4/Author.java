package ru.mirea.task4;

public class Author {
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public String getEmail() {
        return email;
    }

    void setEmail (String email){
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString(){
        return "Author:\n" + "name: " + name + '\n' + "email: " + email + '\n' + "gender: " + gender;
    }
}
