package ru.mirea.task6;

public class PriceableTest {
    public static void main(String[] args){
        Product product = new Product("Утюг", 1355.4);
        System.out.println(product.getType() + " цена: " + product.getPrice());
    }
}
