package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cd = new Book("Clean Code", 350);
        Book pirate = new Book("Pirate", 285);
        Book doctor = new Book("Come on, please help me doctor...", 3);
        Book science = new Book("Big bang of universe", 1630);
        Book[] book = new Book[4];
        book[0] = cd;
        book[1] = pirate;
        book[2] = doctor;
        book[3] = science;
        for (int i = 0; i < book.length; i++) {
            Book bk = book[i];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println("After switch: ");
        Book temp = book[0];
        book[0] = book[3];
        book[3] = temp;
        for (int i = 0; i < book.length; i++) {
            Book bk = book[i];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println("Search for a specific book: ");
        for (int i = 0; i < book.length; i++) {
            Book bk = book[i];
            if (bk.getName() == "Clean Code") {
                System.out.println(bk.getName() + " - " + bk.getPages());
            }
        }
    }
}
