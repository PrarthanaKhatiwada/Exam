package main;

public class main {
    public static void main(String[] args) {
        Tshirt Order1 = new Order();
        Order1.setName("Prarthana Khatiwada");
        Order1.setCode(90);
        Order1.setPrice(5000);
        Order1.setBrand("Win");

        System.out.println(Order1.getName());
        System.out.println(Order1.getCode());
        System.out.println(Order1.getPrice());
        System.out.println(Order1.getBrand());
    }
}