package shiyan.shiyan11.renwu1.service;

public class Computer {
    private String cpu;
    private String memory;
    private String disk;
    private String graphics;
    private String monitor;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "电脑配置{" +
                "CPU='" + cpu + '\'' +
                ", 内存='" + memory + '\'' +
                ", 硬盘='" + disk + '\'' +
                ", 显卡='" + graphics + '\'' +
                ", 显示器='" + monitor + '\'' +
                '}';
    }
}
