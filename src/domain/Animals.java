package domain;

public class Animals {

    protected String name;

    protected int weight;

    protected int age;

    public void animal() {
        name="generig animals";
        weight=350;
    }

    public void eat() {
         System.out.println("Animal Eating...");
    }

    public void hunt() {
    }

    public void water() {
    }

    public void speak() {
        System.out.println("Animal speaking");
    }

}
