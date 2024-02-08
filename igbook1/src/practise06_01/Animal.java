package practise06_01;

public abstract class Animal {
    
    protected int legs;
    
    public Animal(int legs) {
        this.legs = legs;
    }
    
    public void walk() {
        System.out.println("The animl walks on :  " + legs + " legs.");
    }
    
    public abstract void eat();
    
}