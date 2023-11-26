package com.classes.syntaxoops2;

public abstract class Baba {
    int rtb;
    static int pocketMoney;

    public Baba(int rtb, int pocketMoney) {
        this.rtb = rtb;
        this.pocketMoney = pocketMoney;
    }

    public void yemekSaati(int rtb) {
        this.rtb = rtb;
        System.out.println(rtb + " 1 saat");
    }

    public abstract void deneme();


}


class Kiz extends Baba {


    public Kiz(int rtb, int pocketMoney) {
        super(rtb, pocketMoney);
    }

    @Override
    public void deneme() {
        System.out.println("I am abstract method" + rtb + pocketMoney);
    }
}

class BabaTester {
    public static void main(String[] args) {
        Baba baba = new Baba(17, 500) {
            @Override
            public void deneme() {
                System.out.println("Bu da nerden çıktı");
            }
        };
    }

}

