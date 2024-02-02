package src.polymorphismCom.RunTime;

public class Main {
    // Overriding the parent method
    public void method() {
        System.out.println("Method 2");
    }

    // Driver code
    public static void main(String args[]) {
        Test test = new Test();
        test.method();
    }
}
