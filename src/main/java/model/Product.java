package model;

/**
 * @author 212607214
 * @Date 1/29/2019
 */

public class Product {

    private int price;

    private String desc;

    public Product(String desc, int price) {
        this.desc = desc;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

    public String toString() {
        return "product: " + desc + ", price: " + price;
    }
}

