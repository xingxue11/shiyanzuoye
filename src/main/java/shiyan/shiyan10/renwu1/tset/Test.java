package shiyan.shiyan10.renwu1.test;

import shiyan.shiyan10.renwu1.service.Americano;
import shiyan.shiyan10.renwu1.service.Coffee;
import shiyan.shiyan10.renwu1.service.Espresso;
import shiyan.shiyan10.renwu1.service.Milk;
import shiyan.shiyan10.renwu1.service.Mocha;
import shiyan.shiyan10.renwu1.service.Whip;

public class Test {
    public static void main(String[] args) {
        // 美式咖啡 +牛奶 +摩卡
        Coffee coffee = new Americano();
        coffee = new Milk(coffee);
        coffee = new Mocha(coffee);
        System.out.println(coffee.getDescription() + "，总价：" + coffee.getPrice() + "元");

        // 浓缩咖啡 +奶泡
        Coffee coffee2 = new Espresso();
        coffee2 = new Whip(coffee2);
        System.out.println(coffee2.getDescription() + "，总价：" + coffee2.getPrice() + "元");
    }
}
