package ru.job4j.array;

public class Merge {
    /**
     * for (int i = 0; i < rsl.length; i++) { // делаем прогонку по длинне элементов результирующего массива
     * if (indexL < left.length && left[indexL] < right[indexR]) {
     *                 // Делаем проверку, что индекс левого элемента внутри результирующего не превышает длинну левого массива +
     *                 // Через булевый оператор "И" добавляем условие - расчет производить пока левая часть
     *                 // не превысит количество элементов в left.
     *                 } else { // сюда цикл приходит после того, как все элементы массива left закончились.
     * @param left  int indexL = 0; // Задаем индекс элементов левого массива внутри результирующего;
     * @param right int indexR = 0; // Задаем индекс элементов правого массива внутри результирующего;
     * @return
     */
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indexL = 0;
        int indexR = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (indexL < left.length && left[indexL] < right[indexR]) {
                rsl[i] = left[indexL];
                indexL++;
            } else {
                rsl[i] = right[indexR];
                indexR++;
            }
        }
        return rsl;
    }
}
