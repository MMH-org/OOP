package src.Encapsulation;

public class EncapsulationMain {
    public static void main(String[] args) {
        System.out.println("for img https://media.geeksforgeeks.org/wp-content/uploads/Encapsulation.jpg");

        // person object created
        Person person = new Person(); // create Object
        person.setName("Mohsin"); // calling set method and set name
        person.setAge(22); //calling set method and set age

        // Using methods to get the values from the
        // variables
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
