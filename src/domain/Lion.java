package domain;

public class Lion extends Predator {

    private String squad;
    private String age;

    public Lion(String squad, int weight) {
        this.name=name;
        this.age=age;
        this.squad=squad;
        this.weight=weight;
    }

    public Lion() {
        this("Asian", 300);
    }

    public Lion(String name) {
        this("Europe", 400);
    }
     
    /**
     *
     */
    @Override
    public void hunt() {
        System.out.println("Lion hunt a bizon");
    }
    
    @Override
    public void speak() {
        System.out.println("Wauuu");
    }
    
    @Override
    public void eat() {
        System.out.println("lion eat meat");
    }
    

}
