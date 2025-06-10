class ImageFile implements FileElement {
    String name;
    int resolution;

    ImageFile(String name, int resolution) {
        this.name = name;
        this.resolution = resolution;
    }

    public void accept(FileVisitor visitor) {
        visitor.visit(this);
    }
}
