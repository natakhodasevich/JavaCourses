package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        compareNumbers();
    }

    public static void  printThreeWords(){
        System.out.println("orange");
        System.out.println("banana");
        System.out.println("apple");
    }

    public static void checkSumSign(){
        int a=-10;
        int b=25;
        if (a+b>=0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }

    public static void printColor(){
        int value=-110;

        if(value <= 0){
            System.out.println("Красный");
        }
         else if (value >0 && value <= 100){
            System.out.println("Желтый");
    } else{
            System.out.println("Зеленый");
        }
}
    public static void compareNumbers(){
        int a=5;
        int b=10;
        if(a>=b){
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }
    }

}
