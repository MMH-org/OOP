package src;

class Pen{
    String color;
    String type; //ballpoint pen or gel pen

    public void write(){
        System.out.println("writing Something");
    }
}


public class oop {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color="blue";
        pen1.type="gel";

        pen1.write();
    }
}
