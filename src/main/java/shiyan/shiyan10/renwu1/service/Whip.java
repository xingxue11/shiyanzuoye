package shiyan.shiyan10.renwu1.service;

public class Whip extends CondimentDecorator {
    public Whip(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + 奶泡";
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + 6;
    }
}