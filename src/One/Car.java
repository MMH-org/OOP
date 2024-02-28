package src.One;

public class Car {
    int numbersWheels;
    String color;
    float maxSpeed;
    float currentFul;
    int numberOfSeat;

    public void drive(){
        System.out.println("Car is Drive");
        currentFul --;
    }
    public  void addFul(float fuel){
        currentFul += fuel;
    }

    public float getCurrentFul(){
        return currentFul;
    }

}
