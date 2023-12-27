class Student {
    int rollNo;
    String studentName ; // default value is null
}


public class Main {

    public  static  void main(String[] args){
        Student obj = new Student();
        System.out.println(obj.rollNo);
        System.out.println(obj.studentName);
    }
}