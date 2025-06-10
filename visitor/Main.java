public class Main {
    public static void main(String[] args) {
        FileElement[] files = {
            new TextFile("notes.txt", 100),
            new ImageFile("photo.jpg", 300)
        };

        FileSizeCalculator calculator = new FileSizeCalculator();
        for (FileElement file : files) {
            file.accept(calculator);
        }

        System.out.println("Total size: " + calculator.getTotalSize() + " KB");
    }
}
