package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indexL = 0; // Задаем индекс элементов левого массива внутри результирующего;
        int indexR = 0; // Задаем индекс элементов правого массива внутри результирующего;
        for (int i = 0; i < rsl.length; i++) { // делаем прогонку по длинне элементов результирующего массива
            if (indexL < left.length && left[indexL] < right[indexR]) {
                // Делаем проверку, что индекс левого элемента внутри результирующего не превышает длинну левого массива +
                // Через булевый оператор "И" добавляем условие - расчет производить пока левая часть
                // не превысит количество элементов в left.
                rsl[i] = left[indexL];
                indexL++;
            } else { // сюда цикл приходит после того, как все элементы массива left закончились.
                rsl[i] = right[indexR];
                indexR++;
            }
        }
        return rsl;
    }
}
