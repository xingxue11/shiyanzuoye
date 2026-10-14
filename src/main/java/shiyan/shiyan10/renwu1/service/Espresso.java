package shiyan.shiyan10.renwu1.service;

public class Espresso extends Coffee {
    @Override
    public String getDescription() {
        return "浓缩咖啡";
    }

    @Override
    public double getPrice() {
        return 25;
    }
}