package src.polymorphismCom;

class Student{
    String name;
    int age;

    public void PrintInfo(String name){
        System.out.println(name);
    }
    public void PrintInfo(int age){
        System.out.println(age);
    }
    public void PrintInfo(String name,int age){
        System.out.println(name+" "+age);
    }

}



public class OopPolymorphism {
    public static void main(String[] args) {
        Student student_obj1= new Student();
        student_obj1.name="Devil";
        student_obj1.age=23;

        student_obj1.PrintInfo(student_obj1.age);
    }
}
