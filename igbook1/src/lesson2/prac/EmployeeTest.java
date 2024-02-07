package lesson2.prac;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee emp = new Employee ();
        emp.setEmpId(001);
        emp.setName("Natasha Chetty");
        emp.setSsn ("IT10067");
        emp.setSalary(10000.00);
        System.out.println ("Employee id:         " + emp.getEmpId());
        System.out.println ("Employee name:       " + emp.getName());
        System.out.println ("Employee SSN:          " + emp.getSsn());
        System.out.println ("Employee salary:     " + emp.getSalary());
    }
}
