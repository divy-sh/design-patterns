package visitor;

class TextFile implements FileElement {
    String name;
    int size;

    TextFile(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void accept(FileVisitor visitor) {
        visitor.visit(this);
    }
}