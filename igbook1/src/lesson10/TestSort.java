package lesson10;

import java.util.List;
import java.util.OptionalDouble;

public class TestSort {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();
        System.out.println("Average bonus paid to CO Exec");
        OptionalDouble result;
         eList.stream()
                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                .filter(e -> e.getState().equals("CO"))
                .mapToDouble(e -> e.getSalary() * Bonus.byRole(e.getRole()))
                .peek(e-> System.out.printf("Bonus $%,6.2f %n",e))
                .sorted()
                        .forEach(d-> System.out.printf("sorted bonus : $%,6.2f %n",d));

    }
}
