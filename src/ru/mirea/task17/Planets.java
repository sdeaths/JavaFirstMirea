package ru.mirea.task17;

import java.util.Scanner;

enum Planets {
    Mercury(3.302e23, 2440),
    Venus(4.869e24, 6052),
    Earth(5.974e24, 6378),
    Mars(6.419e23, 3397),
    Jupiter(1.899e27, 71490),
    Saturn(5.685e26, 60270),
    Uranium(8.685e25, 25560),
    Neptune(1.024e26, 24760);

    private double G = 6.67408e-11;
    private double weight, radius, force;
    Planets(double w, double r) {
        weight = w;
        radius = r;
        force = (G*weight)/(radius*radius)/1000000;
    }

    public double getForce() { return force; }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int planets;
        while (true) {
            System.out.print("Введите номер планты от 1 до 9, считая от Солнца => ");
            planets = sc.nextInt();
            Planets pl;
            if (planets < 9) {
                System.out.println("Планета => " + Planets.values()[planets - 1].name());
                System.out.println("Сила притяжения для выбранной планеты => " + Planets.values()[planets - 1].getForce() + " m/s^2");
            } else System.out.println("Нет планеты с таким номером.");
        }
    }
}