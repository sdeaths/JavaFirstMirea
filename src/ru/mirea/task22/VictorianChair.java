package ru.mirea.task22;

public class VictorianChair implements Chair{
    private String material, name;
    public VictorianChair() {
        this.SetMaterial(); this.SetName();
    }

    public void SetMaterial() {
        this.material = "Дерево";
    }

    public void SetName() {
        this.name = "Викторианском";
    }

    public String getName() {
        return name;
    }
}
