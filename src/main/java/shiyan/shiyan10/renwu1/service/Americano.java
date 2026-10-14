package shiyan.shiyan10.renwu1.service;

public class Americano extends Coffee {
    @Override
    public String getDescription() {
        return "美式咖啡";
    }

    @Override
    public double getPrice() {
        return 30;
    }
}
