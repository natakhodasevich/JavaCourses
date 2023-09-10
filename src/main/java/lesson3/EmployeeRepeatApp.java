package lesson3;

public class EmployeeRepeatApp {

    public static void main(String[] args) {
        showinformation();

    }


    static class EmployeeRepeat {
        private String name;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;

        public EmployeeRepeat(String name, String position, String email, String phone, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        public void info() {
            System.out.println("name: " + name + " position: " + position + " email: " + email + " phone: " + phone + " salary: " + salary + " age: " + age);

        }
    }

    public static EmployeeRepeat[] createArray() {
        EmployeeRepeat people[] = new EmployeeRepeat[5];
        people[0] = new EmployeeRepeat("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        people[1] = new EmployeeRepeat("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        people[2] = new EmployeeRepeat("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 45);
        people[3] = new EmployeeRepeat("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 47);
        people[4] = new EmployeeRepeat("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 49);

        return people;
    }

    public static void showinformation() {
        for (EmployeeRepeat a : createArray())
            if (a.age > 40)
                a.info();


    }
}
