package QLsach;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int selection, bookNumber = 0;
        Book[] books = new Book[100];
        boolean flag = true;
        int currentIndex = bookNumber;


        do {
            System.out.println("Bạn chọn làm gì?");
            System.out.println("1.Nhập thông tin sách. \n" +
                    "2.Xuất danh sách sách.\n" +
                    "3.Tìm kiếm trong sách sách.\n" +
                    "4.tính tổng tiền bán sách.\n" +
                    "5.xoá sách.\n" +
                    "6.sửa thông tin sách.\n" +
                    "Nhập số khác để thoát.");
            selection = sc.nextInt();

            switch (selection) {
                case 1:

                    System.out.println("Nhập số lương sách cần khai báo: ");
                    bookNumber = sc.nextInt();
                    int condition = bookNumber + currentIndex;
                    for (int i = currentIndex; i < condition; i++) {
                        currentIndex++;
                        System.out.println("Sách thứ " + (i + 1) + ": ");
                        books[i] = new Book();
                        books[i].inputBook();
                    }

                    break;

                case 2:

                    Book[] Temp = new Book[100];
                    for (int i = 0; i < books.length; i++) {
                        if (books[i] != null ) {
                            Temp[i] = books[i];
                            System.out.println(Temp[i]); // check null trước khi thực hiện logic
                        }
                    }
                    books = Temp;
                    break;

                case 3:

                    System.out.print("nhập id sách cần tìm : ");
                    int idBookSearch = sc.nextInt(); // đặt tên biến rõ nghĩa
                    for (int i = 0; i < bookNumber; i++) {
                        if (books[i] != null && idBookSearch == books[i].id) {
                            books[i].outputBook();
                        }
                    }
                    break;

                case 4:

                    float tong = 0;
                    for (int i = 0; i < bookNumber; i++) {
                        if (books[i] != null) {
                            tong += books[i].giasach;
                        }
                    }

                    System.out.println("tổng giá tiền sách :" + tong);
                    break;

                case 5:

                    System.out.print("nhập id cuốn sách cần xoá :");
                    int idBookDelete = sc.nextInt();
                    Book[] arr = new Book[100];
                    for (int i = 0; i < bookNumber; i++) {
                        if (books[i] != null && books[i].id != idBookDelete) {
                            arr[i] = books[i];
                            System.out.println(arr[i]);
                        }
                        else  {
                            System.out.println("Hết mảng cần xoá");
                        }
                    }
                    books = arr;
                    break;

                case 6 :

                    boolean back = true;
                    System.out.print("nhập id cuốn sách cần sửa :");
                    int idBookReair = sc.nextInt();
                    for (int i = 0; i < bookNumber; i++) {
                        if (books[i] != null && idBookReair == books[i].id) {
                            books[i].outputBook();

                            do {
                                System.out.println("Bạn chọn làm gì?");
                                System.out.println("1.Sửa tên sách. \n" +
                                        "2.Sửa giá sách.\n" +
                                        "3.Sửa ngày bán.\n" +
                                        "4.Sửa tên nhà phát hành.\n" +
                                        "5.Sửa ngày bán.\n" +
                                        "6.sửa tên nhà sách.\n" +
                                        "Nhập số khác để thoát.");
                                int choose = sc.nextInt();
                                switch (choose) {
                                    case 1:
                                        System.out.print("nhập tên sách cần sửa :");
                                        String nameNew = sc.next();
                                        books[i].setTensach(nameNew);
                                        books[i].outputBook();
                                        break;

                                    case 2 :
                                        System.out.print("nhập giá sách cần sửa :");
                                        float priceNew = sc.nextFloat();
                                        books[i].setGiasach(priceNew);
                                        books[i].outputBook();
                                        break;

                                    case 3 :
                                        System.out.print("nhập ngày phát hành sách cần sửa :");
                                        int releaseDateNew = sc.nextInt();
                                        books[i].setNgayphathanh(releaseDateNew);
                                        books[i].outputBook();
                                        break;

                                    case 4 :
                                        System.out.print("nhập tên tác giả cần sửa :");
                                        String authorNew = sc.next();
                                        books[i].setTacgia(authorNew);
                                        books[i].outputBook();
                                        break;

                                    case 5 :
                                        System.out.print("nhập ngày bán sách cần sửa :");
                                        int saleDateNew = sc.nextInt();
                                        books[i].setNgayban(saleDateNew);
                                        books[i].outputBook();
                                        break;

                                    case 6 :
                                        System.out.print("nhập tên cửa cần sửa :");
                                        String nameStoreNew = sc.next();
                                        books[i].setTennhasach(nameStoreNew);
                                        books[i].outputBook();
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


