package main;

public class Tshirt {
    String name;
    int Code;
    int Price;
    String Brand;
    String description;
    String[] availableSizes = {"S", "M", "L", "XL", "XXL"};

    public Tshirt(String name, int code, int price, String brand, String description, String[] availableSizes) {
        this.name = name;
        Code = code;
        Price = price;
        Brand = brand;
        this.description = description;
        this.availableSizes = availableSizes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getAvailableSizes() {
        return availableSizes;
    }

    public void setAvailableSizes(String[] availableSizes) {
        this.availableSizes = availableSizes;
    }
    //Method to describe t-shirt
    public void displayinfo(){
         String name =this.name;
         int code = Code;
         int price = Price;
         String brand = Brand;
         String description = this.description;

        System.out.println("The customer " +this.name+ " has bought a tshirt of code "+Code+ "with the price of" +Price+"of the brand"+Brand+"with the description"+this.description);    }
}


