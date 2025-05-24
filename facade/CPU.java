package facade;

public class CPU {
    public void freeze() {
        System.out.println("Freezing cpu...");
    }

    public void jump(int pos) {
        System.out.printf("Jumping to position: %d\n", pos);
    }

    public void execute(String instruction) {
        System.out.printf("Executing instruction: %s\n", instruction);
    }
}
