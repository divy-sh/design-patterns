package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class File {
    private List<String> lines;

    public File() {
        this.lines = new ArrayList<>();
    }

    public void writeLine(String line) {
        this.lines.add(line);
    }

    public String getLine(int index) {
        if (index >= this.lines.size()) {
            return "";
        }
        return this.lines.get(index);
    }

    public int getSize() {
        return lines.size();
    }

    public Iterator<String> createIterator() {
        return new FileIterator(this);
    }
}
