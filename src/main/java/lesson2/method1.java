package lesson2;

public class method1 {
    public static void main(String[] args) {

    checksum();

    }
    public static void checksum(){

        int a=10;
        int b=10;
        int sum= a+b;

        if (sum>=10 && sum <=20) {
            System.out.println("true");
        } else {
                System.out.println("false");
        }
    }
}
