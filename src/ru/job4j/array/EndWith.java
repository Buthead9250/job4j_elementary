package ru.job4j.array;

public class EndWith {
    public static boolean endWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 1; i < post.length; i++) {
            if (word[word.length - i] != post[post.length - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
