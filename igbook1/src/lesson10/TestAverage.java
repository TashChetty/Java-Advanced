package lesson10;

import java.util.List;
import java.util.OptionalDouble;

public class TestAverage {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();
        System.out.println("Average bonus paid to CO Exec");
       OptionalDouble result;
        result = eList.stream()
                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                .filter(e -> e.getState().equals("CO"))
                .mapToDouble(e -> e.getSalary() * Bonus.byRole(e.getRole()))
                .average();
        System.out.printf("Average bonus paid: $%,6.2f %n", result.getAsDouble());
    }
}