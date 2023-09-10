package lesson3;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

     public Employee (String name, String position, String email, String phone, int salary, int age){
         this.name = name;
         this.position = position;
         this.age = age;
         this.phone = phone;
         this.email = email;
         this.salary= salary;
     }
    public void info(){
        System.out.println("name: "+ name+ " position: "+ position +" email: "+ email+ " phone: " + phone + " salary: "+ salary+ " age: "+ age );
    }

    public static Employee[] arrayCreation() {
        Employee[] arr = new Employee[5];
        arr[0] = new Employee("Nata Khodasevich", "QA", "nata@gmail.com", "6952325", 500, 26);
        arr[1] = new Employee("Masha Khodasevich", "QA", "nata@gmail.com", "6952325", 500, 36);
        arr[2] = new Employee("Lena Khodasevich", "QA", "nata@gmail.com", "6952325", 500, 46);
        arr[3] = new Employee("Vita Khodasevich", "QA", "nata@gmail.com", "6952325", 500, 56);
        arr[4] = new Employee("Katia Khodasevich", "QA", "nata@gmail.com", "6952325", 500, 66);
        return arr;
     }

    public static void showInformation(){
         for (Employee arr : arrayCreation())
            if (arr.age > 40)
                arr.info();
    }

    public static void main(String[] args) {
        showInformation();
    }
}
