package ru.mirea.task13;

public class Num3<T> {
    private final int INIT_SIZE = 1;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;

    //Добавление элемента в ArrayList, изменяя размер если это необходимо
    public void add(T item) {
        if (pointer == array.length - 1)
            resize(array.length + 1);
        array[pointer++] = item;
    }

    //возврат элемента по индексу
    public T get(int index) {
        return (T) array[index];
    }

    //удаление элемента по индексу
    public void remove(int index) {
        for (int i = index; i < pointer; i++)
            array[i] = array[i + 1];
        array[pointer] = null;
        pointer--;
    }

    //возвращение кол-во элементов в ArrayList
    public int size() {
        return pointer;
    }

    //метод для изменения размера массива
    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

    public static void main(String[] args) {
        Num3<String> names = new Num3<String>();

        //Добавление эл-ов в коллекцию
        names.add("Liza");
        names.add("Bob");
        names.add("Julia");
        names.add("Max");
        names.add("Kira");
        names.add("Jumeko");

        //Вывод эл-ов коллекции в консоль
        for (int i = 0; i < names.size(); i++)
            System.out.println(names.get(i));

        System.out.println("");

        //подсчет эл-ов в коллекции
        System.out.println("В списке " + names.size() + " элементов");

        //удаление объектов
        names.remove(0);

        //Вывод эл-ов коллекции в консоль
        for (int i = 0; i < names.size(); i++)
            System.out.println(names.get(i));
    }
}