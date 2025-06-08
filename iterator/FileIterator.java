package iterator;

import java.util.Iterator;

public class FileIterator implements Iterator<String> {
    private final File file;
    private int index = 0;

    public FileIterator(File file) {
        this.file = file;
    }

    @Override
    public boolean hasNext() {
        return (index < file.getSize());
    }

    @Override
    public String next() {
        if (!this.hasNext()) {
            return "";
        }
        return file.getLine(this.index++);
    }
    
}
