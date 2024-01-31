package src.InheritanceCom.Type.HierarchicalInheritance;

public class HI {
    public static void main(String[] args) {
        Circle circle_obj=new Circle();
        circle_obj.CircleMethod();
        circle_obj.shapeMethod();

        Triangle triangle_obj=new Triangle();
        triangle_obj.triangleMethod();
        triangle_obj.shapeMethod();
    }
}
