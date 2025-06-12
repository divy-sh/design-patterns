package visitor;

class FileSizeCalculator implements FileVisitor {
    int totalSize = 0;

    public void visit(TextFile file) {
        totalSize += file.size;
    }

    public void visit(ImageFile file) {
        // let's say each resolution unit equals 2KB
        totalSize += file.resolution * 2;
    }

    public int getTotalSize() {
        return totalSize;
    }
}
