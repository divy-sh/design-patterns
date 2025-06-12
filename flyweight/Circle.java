class Circle implements Shape {
    private final String type = "Circle"; // intrinsic state

    @Override
    public void draw(String color) {
        System.out.println("Drawing " + type + " with color " + color);
    }
}