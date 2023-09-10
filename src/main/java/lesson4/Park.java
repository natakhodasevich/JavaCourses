package lesson4;

import java.sql.SQLOutput;

public class Park{
    public static void main(String[] args) {
      Attrakcion att1= new Attrakcion("Kolokolchik","13-16",10);
      att1.info();
    }
}



 class Attrakcion {
    String name;
    String workingTime;
    int price;
    public Attrakcion(String name, String workingTime, int price){
        this.name=name;
        this.workingTime = workingTime;
        this.price = price;
    }
    public void info(){
        System.out.println("Аттракцион: "+ name + " Bремя работы: "+ workingTime + " Цена: "+ price);
    }
}

