package shiyan.shiyan11.renwu1.tset;

import shiyan.shiyan11.renwu1.service.Computer;
import shiyan.shiyan11.renwu1.service.ComputerBuilder;

public class TestComputer {
    public static void main(String[] args) {
        System.out.println("=====任务1：电脑生成器=====");
        Computer pc = new ComputerBuilder()
                .cpu("i9")
                .memory("32G")
                .disk("512G SSD")
                .graphics("独立显卡")
                .monitor("有")
                .build();
        System.out.println(pc);

        Computer officePc = new ComputerBuilder()
                .cpu("i5")
                .memory("8G")
                .disk("256G SSD")
                .graphics("集成显卡")
                .monitor("无")
                .build();
        System.out.println(officePc);
    }
}
