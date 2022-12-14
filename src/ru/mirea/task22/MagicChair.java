package ru.mirea.task22;

public class MagicChair implements Chair{
    private String material, name;
    public MagicChair() {
        this.SetMaterial(); this.SetName();
    }

    public void SetMaterial() {
        this.material = "Облако";
    }

    public void SetName() {
        this.name = "Магическом";
    }

    public String getName() {
        return name;
    }
}
