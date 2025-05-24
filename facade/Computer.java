package facade;

public class Computer {
    private CPU cpu;
    private GPU gpu;
    private Memory memory;
    public Computer() {
        cpu = new CPU();
        gpu = new GPU();
        memory = new Memory();
    }

    public void start() {
        this.cpu.freeze();
        this.memory.load();
        this.cpu.jump(23);
        this.cpu.execute("load doom");
        this.gpu.render();
    }
}
