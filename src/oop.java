package src;

class Pen{
    String color;
    String type; //ballpoint pen or gel pen

    public void write(){
        System.out.println("writing Something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}

class Student_{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class oop {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color="blue";
        pen1.type="gel";

//        pen1.write();
        Pen pen2 = new Pen();
        pen2.color="black";
        pen2.type="ball Pen";

        pen1.printColor();
        pen2.printColor();
    }
}
