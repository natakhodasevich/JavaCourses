package lesson3;

public class User {
    private int id;
    private String name;
    private String position;
    private int age;


    public User (int id, String name, String position, int age){
        this.id= id;
        this.name = name;
        this.position = position;
        this.age=age;
    }

    public void info(){
        System.out.println( "id: "+id + "; Name: "+ name+"Position: "+ position + "Age: " + age);
    }
    public void changePosition(){
        this.position = position;
        System.out.println("The user" + name + " got a new position: " + position);
    }







}
