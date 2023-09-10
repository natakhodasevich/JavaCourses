package lesson3;

public class Cat { // сначала в классе создадим переменные, то есть шаблон для будущих объектов)
    String name;
    String color;
    int age;

    public static void main(String[] args) {
        Cat cat1= new Cat();
        Cat cat2= new Cat();
        cat1.name= "Barsik";
        cat1.color = "White";
        cat1.age = 4;
        cat2.name = "Mursik";
        cat2.color= "Black";
        cat2.age = 6;
        System.out.println("cat 1 name: "+ cat1.name+ "cat 1 color :"+ cat1.color+ "cat 1 age: "+cat1.age);
        System.out.println("cat 2 name: "+ cat2.name+ "cat 2 color :" + cat2.color+ "cat 1 age: "+cat2.age);
    }



}
