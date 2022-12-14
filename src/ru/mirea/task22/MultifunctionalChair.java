package ru.mirea.task22;

public class MultifunctionalChair implements Chair{
    private String material, name;
    public MultifunctionalChair() {
        this.SetMaterial(); this.SetName();
    }

    public void SetMaterial() {
        this.material = "Металл";
    }

    public void SetName() {
        this.name = "Многофункциональном";
    }

    public String getName() {
        return name;
    }
}
