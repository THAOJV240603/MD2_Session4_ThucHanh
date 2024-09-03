package ra.entity;

import java.util.Scanner;

public class Book {
    private String bookId;
    private String bookName;
    private double importPrice;
    private double exportPrice;
    private String author;
    private double interest;
    private int year;

    public Book() {
    }

    public Book(String bookId, String bookName, double importPrice, double exportPrice, String author, double interest, int year) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.author = author;
        this.interest = interest;
        this.year = year;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //Phương thức nhập thông tin
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào mã sách: ");
        this.bookId = sc.nextLine();
        System.out.println("Nhập vào tên sách: ");
        this.bookName = sc.nextLine();
        System.out.println("Giá nhập vào: ");
        this.importPrice = Double.parseDouble(sc.nextLine());
        System.out.println("Giá bán ra: ");
        this.exportPrice = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập vào tên tác giả: ");
        this.author = sc.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        this.year = Integer.parseInt(sc.nextLine());
        System.out.println("\n");
    }

    //Phương thức hiển thị thông tin
    public void displayData(){
        System.out.println("\n");
        System.out.println("Mã sách: " + this.bookId);
        System.out.println("Tên sách: " + this.bookName);
        System.out.println("Giá nhập: " + this.importPrice + " vnd");
        System.out.println("Giá bán: " + this.exportPrice + " vnd");
    }

    //Phương thức tính lợi nhuận
    public void processInterest(){
        this.interest = this.exportPrice - this.importPrice;
        this.displayData();
        System.out.println("Lợi nhuận: " + this.interest + " vnd \n");
    }
}
