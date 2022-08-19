package QLsach;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int selection,select, bookNumber = 0;
        Book[] books = new Book[100];
        ManagementBookStore managementBookStore = new ManagementBookStore();
        boolean flag = true;
        boolean check = true;
        int currentIndex = bookNumber;

        do {
            System.out.println("Bạn chọn làm gì?");
            MenuDefine.printBookStoreMenu();
            select = sc.nextInt();
            switch (select) {
                case MenuDefine.INPUT_BOOK_STORE_SELECTION :
                    managementBookStore.inputList();
                    break;
                case MenuDefine.OUTPUT_BOOK_STORE :
                    System.out.println("Danh sách nhà sách vừa nhập :");
                    managementBookStore.outputList(books);
                    break;
                case MenuDefine.SEARCH_BOOK_STORE :
                    BookStore searchBookStore = managementBookStore.storeSearch(books);

                    do {
                        MenuDefine.printBookMenu();
                        selection = sc.nextInt();

                        switch (selection) {
                            case MenuDefine.INPUT_BOOK_SELECTION:
                                System.out.println("Nhập số lương sách cần khai báo: ");
                                bookNumber = sc.nextInt();
                                int condition = bookNumber + currentIndex;
                                for (int i = currentIndex; i < condition; i++) {
                                    currentIndex++;
                                    System.out.println("Sách thứ " + (i + 1) + ": ");
                                    books[i] = new Book();
                                    books[i].inputBook(searchBookStore);
                                }

                                break;
                            case MenuDefine.OUTPUT_BOOK:
                                Book[] temp = new Book[100];
                                for (int i = 0; i < books.length; i++) {
                                    if (books[i] != null ) {
                                        temp[i] = books[i];
                                        System.out.println(temp[i]);
                                    }
                                }

                                books = temp;
                                break;
                            case MenuDefine.SEARCH_BOOK:
                                System.out.print("nhập id sách cần tìm : ");
                                int idBookSearch = sc.nextInt();
                                for (int i = 0; i < bookNumber; i++) {
                                    if (books[i] != null && idBookSearch == books[i].idBook) {
                                        books[i].outputBook();
                                    }
                                }

                                break;
                            case MenuDefine.SUM_SHELVES_BOOK:
                                float sum = 0;
                                for (int i = 0; i < bookNumber; i++) {
                                    if (books[i] != null) {
                                        sum += books[i].bookShelves;
                                    }
                                }

                                System.out.println("tổng giá tiền sách :" + sum);
                                break;
                            case MenuDefine.REMOVE_BOOK:
                                System.out.print("nhập id cuốn sách cần xoá :");
                                int idBookDelete = sc.nextInt();
                                Book[] arr = new Book[100];
                                for (int i = 0; i < bookNumber; i++) {
                                    if (books[i] != null && books[i].idBook != idBookDelete) {
                                        arr[i] = books[i];
                                        System.out.println(arr[i]);
                                    } else {
                                        System.out.println("Hết mảng cần xoá");
                                    }
                                }

                                books = arr;
                                break;
                            case MenuDefine.EDIT_BOOK :
                                boolean back = true;
                                System.out.print("nhập id cuốn sách cần sửa :");
                                int idBookRepair = sc.nextInt();
                                for (int i = 0; i < bookNumber; i++) {
                                    if (books[i] != null && idBookRepair == books[i].idBook) {
                                        books[i].outputBook();

                                        do {
                                            MenuDefine.printEditMenu();
                                            int choose = sc.nextInt();
                                            switch (choose) {
                                                case MenuDefine.EDIT_NAME_BOOK:
                                                    System.out.print("nhập tên sách cần sửa :");
                                                    String nameNew = sc.next();
                                                    books[i].setNameBook(nameNew);
                                                    books[i].outputBook();
                                                    break;
                                                case MenuDefine.EDIT_SHELVES_BOOK:
                                                    System.out.print("nhập giá sách cần sửa :");
                                                    float priceNew = sc.nextFloat();
                                                    books[i].setBookShelves(priceNew);
                                                    books[i].outputBook();
                                                    break;
                                                case MenuDefine.EDIT_RELEASE_DATE_BOOK:
                                                    System.out.print("nhập ngày phát hành sách cần sửa :");
                                                    int releaseDateNew = sc.nextInt();
                                                    books[i].setReleaseDate(releaseDateNew);
                                                    books[i].outputBook();
                                                    break;
                                                case MenuDefine.EDIT_NAME_AUTHOR_BOOK :
                                                    System.out.print("nhập tên tác giả cần sửa :");
                                                    String authorNew = sc.next();
                                                    books[i].setAuthor(authorNew);
                                                    books[i].outputBook();
                                                    break;
                                                case MenuDefine.EDIT_DATE_SALE_BOOK :
                                                    System.out.print("nhập ngày bán sách cần sửa :");
                                                    int saleDateNew = sc.nextInt();
                                                    books[i].setDateSale(saleDateNew);
                                                    books[i].outputBook();
                                                    break;

                                                default :
                                                    back = false;
                                            }
                                        } while (back);
                                    }
                                }

                                break;
                            default:
                                flag = false;
                        }
                    } while (flag);

                    break;
                case MenuDefine.REMOVE_BOOK_STORE :
                    System.out.println("Danh sách nhà sách sau khi xoá :");
                    managementBookStore.removeStore(books);
                    break;

                default :
                    System.out.println("Goodbye");
                    check = false;
                    break;
            }
        } while (check);
    }
}


