package ru.mirea.task28;

public class Car {
    int price;
    int year;
    Model model;

    public Car(Model model, int year, int price) {

        this.year = year;
        this.price = price;
        this.model = model;

    }
    public void info() {
        System.out.println("Машина: " + model.model + " " + model.speed + " " + price + " " + year);
    }
    private static class Model {
        String model;
        int speed;

        public Model(String model, int speed) {
            this.speed = speed;
            this.model = model;
        }
    }
    public static void main(String[] args) {

        Car audi = new Car(new Model("Audi", 250), 2011, 29700);
        audi.info();

        Car bmw = new Car(new Model("BMW", 250), 2012,  2920000) {
            public void info() {
                System.out.println(model.model + " скорость:" + model.speed + " цена:" + price + " год:" + year);
            }
        };
        System.out.println();
        bmw.info();
    }
}
