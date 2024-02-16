package lesson11.AssertExamples;


    public class PersonClassInvariant {
        String name;
        String ssn;
        int age;

        private void checkAge()
        {
            assert age >= 18 && age < 150;
        }


        public void changeName(String fname)
        {
            checkAge();
            name=fname;
        }

        public static void main(String args[])
        {

            PersonClassInvariant person1=new PersonClassInvariant();
            person1.age=15;
            person1.name="dave";
            person1.changeName("David");
        }
}
