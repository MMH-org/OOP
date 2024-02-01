package src.polymorphismCom.CompileTime;

import src.polymorphismCom.CompileTime.Student;

public class OopPolymorphism {
    public static void main(String[] args) {
        Student student_obj1= new Student();
        student_obj1.name="Devil";
        student_obj1.age=23;

        student_obj1.PrintInfo(student_obj1.age);
    }
}
