package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String word = "Неизвестное слово. " + eng;
        return word;
    }

    public static void main(String[] args) {
        DummyDic speaker = new DummyDic();
        String word = speaker.engToRus("DummyDic");
        System.out.println(word);
    }
}
