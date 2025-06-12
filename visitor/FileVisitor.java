package visitor;

interface FileVisitor {
    void visit(TextFile file);
    void visit(ImageFile file);
}
