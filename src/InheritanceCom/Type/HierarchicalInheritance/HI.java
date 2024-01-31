package src.InheritanceCom.Type.HierarchicalInheritance;

public class HI {
    public static void main(String[] args) {
        System.out.println("for img https://cdn.programiz.com/sites/tutorial2program/files/java-hierarchical-inheritance.png");
        Circle circle_obj=new Circle();
        circle_obj.CircleMethod();
        circle_obj.shapeMethod();

        Triangle triangle_obj=new Triangle();
        triangle_obj.triangleMethod();
        triangle_obj.shapeMethod();
    }
}
