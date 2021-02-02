package test;

import domain.Lion;

public class TestAnimal {

    public void main(String[] args){
        Lion lion = new Lion("Aphine");
        System.out.println("Lion");
       lion.hunt();
       lion.eat();
       lion.speak();
    }
}
