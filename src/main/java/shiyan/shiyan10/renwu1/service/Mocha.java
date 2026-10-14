package shiyan.shiyan10.renwu1.service;

public class Mocha extends CondimentDecorator {
    public Mocha(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + 摩卡";
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + 8;
    }
}