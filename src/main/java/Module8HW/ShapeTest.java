package Module8HW;

public class ShapeTest {
    public static void main(String[] args) {

        Shape circle = new Circle();
        System.out.println("This shape is " + circle.getName());
        Shape cube = new Cube();
        System.out.println("This shape is " + cube.getName());
        Shape cylinder = new Cylinder();
        System.out.println("This shape is " + cylinder.getName());
        Shape oval = new Oval();
        System.out.println("This shape is " + oval.getName());
        Shape quad = new Quad();
        System.out.println("This shape is " + quad.getName());

    }
}
