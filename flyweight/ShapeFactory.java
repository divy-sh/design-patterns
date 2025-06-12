import java.util.HashMap;
import java.util.Map;

class ShapeFactory {
    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle() {
        if (!circleMap.containsKey("Circle")) {
            circleMap.put("Circle", new Circle());
            System.out.println("Creating new Circle object");
        }
        return circleMap.get("Circle");
    }
}