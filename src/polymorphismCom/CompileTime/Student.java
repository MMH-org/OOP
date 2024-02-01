package src.polymorphismCom.CompileTime;

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
