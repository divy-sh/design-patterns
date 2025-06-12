package visitor;

interface FileElement {
    void accept(FileVisitor visitor);
}
