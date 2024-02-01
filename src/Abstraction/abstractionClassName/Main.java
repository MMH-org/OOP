package src.Abstraction.abstractionClassName;

public class Main {
    public static void main(String[] args) {
        System.out.println("for img https://media.geeksforgeeks.org/wp-content/uploads/20230520123321/Abstraction-in-Java-768.webp");

        AbstractionShape s1 = new Circle("Red", 2.2);
        AbstractionShape s2 = new Rectangle("Yellow", 2, 4);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
