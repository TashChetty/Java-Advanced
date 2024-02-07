package Exercises.lesson4;

public class TestEqualsOverride {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Jac", "gtb78", 2000);
        Employee emp2 = new Employee(1,"Jac", "gtb78", 2000);
        System.out.println(emp1.equals(emp2));

        emp2=emp1;
        System.out.println(emp1.equals(emp2));
    }
}
