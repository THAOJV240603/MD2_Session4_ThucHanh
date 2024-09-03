package ra.Run;
import ra.entity.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookImp {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        //In Menu
        do{
            System.out.println("****************** MENU ******************\n" +
                    "1. Nhập thông tin n sách (n nhập từ bàn phím)\n" +
                    "2. Tính lợi nhuận các sách\n" +
                    "3. Hiển thị thông tin sách\n" +
                    "4. Sắp xếp sách theo giá bán tăng dần\n" +
                    "5. Sắp xếp sách theo lợi nhuận giảm dần\n" +
                    "6. Tìm sách theo tên sách (tên sách nhập từ bàn phím)\n" +
                    "7. Thống kê số lượng sách theo năm xuất bản\n" +
                    "8. Thống kê số lượng sách theo tác giả\n" +
                    "9. Thoát");
            System.out.println("Mời bạn chọn 1 -> 9");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập số lượng muốn thêm: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        //Khởi tạo đối tượng sản phẩm
                        Book book = new Book();

                        //Gọi phương thức nhập thông tin sách
                        book.inputData();

                        //add book vào list
                        list.add(book);
                    }
                    break;
                case 2:
                    //Tính lợi nhuận cho từng sách
                    for (Book book : list) {
                        book.processInterest();
                    }
                    break;
                case 3:
                    //Hiển thị danh sách
                    System.out.println("======== Danh sách ======== ");
                    for (Book book : list) {
                        book.displayData();
                    }
                    break;
                case 4:
                    //Nhập từ khóa cần tìm

                    //Chạy vòng lặp kiểm tra xem có tên trùng không, nếu trùng thì hiển thị thông tin

                    break;
                case 5:
                    //Thống kê theo năm xuất bản
                    //Khai báo tong = 0
                    //Nhập vào năm sản xuất từ bàn phím
                    //Chạy for để duyệt qua tất cả các sách
                        //Trong vòng for
                            //Nếu năm nhập vào từ bàn phím == năm của sách thì tăng tong +=1
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.out.println("Sai lựa chọn");
            }
        }while(true);
    }
}
