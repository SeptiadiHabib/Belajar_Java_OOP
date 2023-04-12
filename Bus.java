package Belajar.java.now.data;

public class Bus implements Car {
    @Override
    public void drive() {
        System.out.println("Bus drive");
    }

    @Override
    public int getTier() {
        return 8;
    }

    @Override
    public boolean isBig() {
        return Car.super.isBig();
    }

    @Override
    public String gerBrand() {
        return "Hino";
    }
    @Override
    public boolean isMaintenance() {
        return false;
    }

}
