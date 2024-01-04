package main;

public class Order {
    String name;
    int PhoneNo;
    int items;
    int price;

    public Order(String name, int phoneNo, int items, int price) {
        this.name = name;
        PhoneNo = phoneNo;
        this.items = items;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        PhoneNo = phoneNo;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}


