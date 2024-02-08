package practise06_01;

public class PetMain {

    public static void main(String[] args) {
        Animal a;

        Spider s = new Spider();
        s.eat();
        s.walk();

        a = new Spider();
        a.eat();
        a.walk();
    }
    
    public static void playWithAnimal(Animal a) {
        // completed in practice
    }
    
}