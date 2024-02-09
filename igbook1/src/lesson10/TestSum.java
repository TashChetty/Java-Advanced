package lesson10;

import java.util.List;

public class TestSum {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();
        System.out.println("total CO Bonus");
        double result;
        result = eList.stream()
                .filter(e->e.getRole().equals(Role.EXECUTIVE))
                .filter(e->e.getState().equals("CO"))
                .mapToDouble(e->e.getSalary()*Bonus.byRole(e.getRole()))
                .sum();
        System.out.printf("total bonus paid: $%,6.2f %n", result);

       double result2 = eList.stream()
                .filter(e->e.getRole().equals(Role.EXECUTIVE))
                .filter(e->e.getState().equals("CO"))
               .peek(e-> System.out.println("Name: " + e.getGivenName()+ "Surname: "+ e.getSurName()))
               .mapToDouble(e->e.getSalary()*Bonus.byRole(e.getRole()))
               .peek(e-> System.out.printf("Bonus: $%,6.2f %n ",e))
                .sum();
        System.out.printf("total bonus paid: $%,6.2f %n", result);
    }
}
