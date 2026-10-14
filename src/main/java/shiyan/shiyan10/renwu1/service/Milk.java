package shiyan.shiyan10.renwu1.service;

public class Milk extends CondimentDecorator {
    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + 牛奶";
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + 5;
    }
}