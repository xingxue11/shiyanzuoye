package shiyan.shiyan11.renwu1.service;

public class ComputerBuilder {
    private Computer computer = new Computer();

    public ComputerBuilder cpu(String cpu) {
        computer.setCpu(cpu);
        return this;
    }

    public ComputerBuilder memory(String memory) {
        computer.setMemory(memory);
        return this;
    }

    public ComputerBuilder disk(String disk) {
        computer.setDisk(disk);
        return this;
    }

    public ComputerBuilder graphics(String graphics) {
        computer.setGraphics(graphics);
        return this;
    }

    public ComputerBuilder monitor(String monitor) {
        computer.setMonitor(monitor);
        return this;
    }

    public Computer build() {
        return computer;
    }
}
