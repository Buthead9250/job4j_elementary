package ru.job4j.array;

public class EndWith {
    public static boolean endWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < word.length - 1; i++) {
            if (word[word.length - 1] != post[post.length - 1]) {
                result = false;
            }
        }
        return result;
    }
}
