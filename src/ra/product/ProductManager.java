package ra.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static void main(String[] args) {
        //Khởi tạo đối tượng Scanner
        Scanner sc = new Scanner(System.in);
        //Khai báo danh sách các đối tượng sản phẩm
        List<Product> list = new ArrayList<Product>();

        //Khởi tạo 1 đối tượng sản phẩm
        //Product product = new Product();

        //In Menu
        do{
            System.out.println("======== MENU ========");
            System.out.println("1. Thêm mới sản phẩm");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Thoát chương trình");
            System.out.println("Mời bạn chọn 1 -> 3");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    //Khởi tạo đối tượng sản phẩm
                    Product product = new Product();

                    //Gọi phương thức input
                    product.intputData();

                    //add đối tượng vừa tạo vào danh sách list
                    list.add(product);
                    break;
                case 2:
                    System.out.println("======== Danh sách sản phẩm =======");
                    for (Product item : list) {
                        item.displayData();
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sai lựa chọn");
            }
        }while(true);
    }
}
