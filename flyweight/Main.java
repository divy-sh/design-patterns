public class Main {
    public static void main(String[] args) {
        Shape redCircle = ShapeFactory.getCircle();
        redCircle.draw("Red");

        Shape blueCircle = ShapeFactory.getCircle();
        blueCircle.draw("Blue");
    }
}