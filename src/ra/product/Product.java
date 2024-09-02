package ra.product;

import java.util.Scanner;

public class Product {
    //Khai báo các trường
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //Phương thức nhập thông tin
    public void intputData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập id: ");
        this.id = sc.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        this.name = sc.nextLine();
        System.out.print("Giá: ");
        this.price = sc.nextDouble();
        System.out.print("Số lượng: ");
        this.quantity = sc.nextInt();
        System.out.print("\n");
    }

    //Phương thức hiển thị thông tin
    public void displayData(){
        System.out.println("======== Thông tin sản phẩm =======");
        System.out.println("Mã sản phẩm: " + this.id);
        System.out.println("Tên sản phâm: " + this.name);
        System.out.println("Giá: " + this.price + " vnd");
        System.out.println("Số lượng: " + this.quantity);
    }
}
