package ru.mirea.task12.number2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.mark - s2.mark;
    }
    public void Sort(Student[] s, int left, int right)
    {
        int leftMarker = left;
        int rightMarker = right;
        Student pivot = s[(leftMarker + rightMarker) / 2];
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (compare(s[leftMarker],pivot)>0) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot
            while (compare(s[rightMarker],pivot) <0) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    Student tmp = s[leftMarker];
                    s[leftMarker] = s[rightMarker];
                    s[rightMarker] = tmp;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < right) {
            Sort(s, leftMarker, right);
        }
        if (left < rightMarker) {
            Sort(s, left, rightMarker);
        }
    }
}
