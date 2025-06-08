package iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        File file = new File();
        file.writeLine("Hello");
        file.writeLine("world!");
        file.writeLine("I");
        file.writeLine("am");
        file.writeLine("creating");
        file.writeLine("an");
        file.writeLine("iterator!");

        Iterator<String> iterator = file.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
