package lesson5;

public class ComplexEnumMain {
    public static void main(String[] args) {
        Computer comp = new Computer();
      //  comp.setState((Computer.Powerstate.OFF));
        comp.setState((Computer.Powerstate.ON));
       // comp.setState((Computer.Powerstate.SUSPEND));
        System.out.println("current state is: "+ comp.getState());
        System.out.println("description is: " + comp.getState().getDescription());
    }
}
