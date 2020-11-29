package ru.job4j.oop;

public class Cat {
    private String name;
    private String food;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void show() {
        System.out.println(this.name + " love to eat a " + this.food);
    }

    public String sound() {
        String voice = " may-may";
        return voice;
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        String say = peppy.sound();
        Cat nick = new Cat();
        nick.eat("Sosages");
        nick.giveNick("Nick");
        nick.show();
        System.out.println("Peppy says" + say);
    }
}
