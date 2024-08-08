package com.devsuperior.entities;

public class Order {

    private int code;

    private double basic;

    private double discount;

    public Order(int code, double basic, double discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    public Order() {
    }

    public int getCode() {
        return code;
    }

    public double getbasic() {
        return basic;
    }

    public double getdiscount() {
        return discount;
    }

    public double getValueDiscount() {
        return basic * (discount / 100);
    }

    public double getValueWithDiscount() {
        return basic - getValueDiscount();
    }
}