package lesson4;

public class Contacts {
    private final String firstName;
    private final String lastName;

    public String getFirstname() {
        return firstName;
    }

    public String getFirstName() {
        return lastName;
    }

    public Contacts(String fname, String lname) {
        this.firstName = fname;
        this.lastName = lname;

    }

    @Override
    public String toString() {
        return "Contacts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';

    }
}
