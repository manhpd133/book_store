package QLsach;


import java.util.Scanner;


public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, n = 0;
        Book[] books = new Book[100];
        boolean flag = true;
        int currentIndex = n;

        do {
            System.out.println("Bạn chọn làm gì?");
            System.out.println("1.Nhập thông tin sách. \n" +
                    "2.Xuất danh sách sách.\n" +
                    "3.Tìm kiếm trong sách sách.\n" +
                    "4.tính tổng tiền bán sách.\n" +
                    "5.xoá sách.\n" +
                    "6.sửa thông tin sách.\n" +
                    "Nhập số khác để thoát.");
            a = sc.nextInt();

            switch (a) {
                case 1:
                    System.out.println("Nhập số lương sách cần khai báo: ");
                    n = sc.nextInt();
                    int condition = n + currentIndex;
                    for (int i = currentIndex; i < condition; i++) {
                        currentIndex++;
                        System.out.println("Sách thứ" + (i + 1) + ": ");
                        books[i] = new Book();
                        books[i].nhap();
                    }

                    break;
                case 2:

                    System.out.printf("%-5s %-15s %-5s %-5s %-10s %-5s %-15s \n", "ID", "Tên sách", "Giá sách", "Ngày phát hành", "Tác Giả", "Ngày bán", "Tên nhà sách");
                    for (int i = 0; i < n; i++) {

                        books[i].hienThiTT();

                    }
                    break;
                case 3:

                    System.out.print("nhập id sách cần tìm : ");
                    int x = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        if (x == books[i].id) {
                            books[i].hienThiTT();
                        }
                    }
                    break;
                case 4:
                    float tong = 0;
                    for (int i = 0; i < n; i++) {
                        tong += books[i].giasach;
                    }
                    System.out.println("tổng giá tiền sách :" + tong);
                    break;
                case 5:

                    System.out.print("nhập id cuốn sách cần xoá :");
                    int b = sc.nextInt();
                    //Book book = null;
                    Book[] arr = new Book[100];

                    //int size = books.length;

                    // Cần lặp qua các phần tử của mảng books hiện tại, check bookId
                    // Nếu bookId khác với id cần xoá thì thực hiện copy phần tử sang mảng mới tạo arr

                    for (int i = 0; i < n; i++) {

                        if (books[i] != null && books[i].id != b) {

                            arr[i] = books[i];

                            System.out.println(arr[i]);
                        }
                    }
                    books = arr;
                    break;
                case 6 :
                    // tìm đến bookId cần sửa
                    boolean back = true;

                    System.out.print("nhập id cuốn sách cần sửa :");
                    int c = sc.nextInt();
                    //Book[] arrnew = new Book[100];
                    for (int i = 0; i < n; i++) {
                        if (books[i] != null && c == books[i].id) {
                            books[i].hienThiTT();

                            do {
                                System.out.println("Bạn chọn làm gì?");
                                System.out.println("1.Sửa tên sách. \n" +
                                        "2.Sửa giá sách.\n" +
                                        "3.Sửa ngày bán.\n" +
                                        "4.Sửa tên nhà phát hành.\n" +
                                        "5.Sửa ngày bán.\n" +
                                        "6.sửa tên nhà sách.\n" +
                                        "Nhập số khác để thoát.");
                                int d = sc.nextInt();
                                switch (d) {
                                    case 1:
                                        System.out.print("nhập tên sách cần sửa :");
                                        String nameNew = sc.next();
                                        books[i].setTensach(nameNew);
                                        books[i].hienThiTT();
                                        break;

                                    case 2 :
                                        System.out.print("nhập giá sách cần sửa :");
                                        float priceNew = sc.nextFloat();
                                        books[i].setGiasach(priceNew);
                                        books[i].hienThiTT();
                                        break;

                                    case 3 :
                                        System.out.print("nhập ngày phát hành sách cần sửa :");
                                        int release_dateNew = sc.nextInt();
                                        books[i].setNgay_phat_hanh(release_dateNew);
                                        books[i].hienThiTT();
                                        break;

                                    case 4 :
                                        System.out.print("nhập tên tác giả cần sửa :");
                                        String authorNew = sc.next();
                                        books[i].setTacgia(authorNew);
                                        books[i].hienThiTT();
                                        break;

                                    case 5 :
                                        System.out.print("nhập ngày bán sách cần sửa :");
                                        int sale_dateNew = sc.nextInt();
                                        books[i].setNgayban(sale_dateNew);
                                        books[i].hienThiTT();
                                        break;
                                    case 6 :
                                        System.out.print("nhập tên cửa cần sửa :");
                                        String name_storeNew = sc.next();
                                        books[i].setTennhasach(name_storeNew);
                                        books[i].hienThiTT();
                                        break;

                                        default :
                                        back = false;

                                }

                            }while (back);
                        }
                    }

                    break;

                default:
                    System.out.println("Goodbye");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}


