//package QLsach;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.Scanner;
//
//public class ManagementBook {
//    private List<Book> list;
//
//    public ManagementBook() {
//        list = new ArrayList<>();
//    }
//
//    public void addBook(Book books) {
//        list.add(books);
//    }
//
//    public void removeBook(Book books) {
//        list.remove(books);
//    }
//
//    public List<Book> getList() {
//        return list;
//    }
//
//    public void setList(ArrayList<Book> list) {
//        this.list = list;
//    }
//
//    public void inputListBook(BookStore bookStore) {
//        Scanner sc = new Scanner(System.in);
//        Book books;
//        System.out.println("Nhập số lương sách cần khai báo: ");
//        int bookNumber = sc.nextInt();
//        for (int i = 0; i < bookNumber; i++) {
//            System.out.println("Sách thứ " + (i + 1) + ": ");
//            books = new Book();
//            books.inputBook(bookStore);
//            addBook(books);
//        }
//    }
//
//    public void outputListBook() {
//        int i = 0;
//        for (Book book :list) {
//            System.out.println("\nSách thứ " + (i + 1) + ":");
//            book.outputBook();
//            i++;
//        }
//    }
//
//    public void bookSearch() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("nhập id sách cần tìm : ");
//        int idBookSearch = sc.nextInt();
//        for (Book books : list) {
//            if (books != null && idBookSearch == books.idBook) {
//                books.outputBook();
//            }
//        }
//    }
//
//    public void bookSum() {
//        float sum = 0;
//        for (Book book : list) {
//            if (book != null) {
//                sum += book.bookShelves;
//            }
//        }
//
//        System.out.println("tổng giá tiền sách :" + sum);
//    }
//
//    public void bookRemove() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("nhập id cuốn sách cần xoá :");
//        int idBookDelete = sc.nextInt();
//        for (Book books : list) {
//            if (books != null && books.idBook != idBookDelete) {
//                removeBook(books);
//                books.outputBook();
//            } else {
//                System.out.println("Hết mảng cần xoá");
//            }
//        }
//    }
//
//    public void bookEdit() {
//        Scanner sc = new Scanner(System.in);
//        boolean back = true;
//        System.out.print("nhập id cuốn sách cần sửa :");
//        int idBookRepair = sc.nextInt();
//        for (Book book :list) {
//            if (book != null && idBookRepair == book.idBook) {
//                book.outputBook();
//
//                do {
//                    MenuDefine.printEditMenuBook();
//                    int choose = sc.nextInt();
//                    switch (choose) {
//                        case MenuDefine.EDIT_NAME_BOOK:
//                            System.out.print("nhập tên sách cần sửa :");
//                            String nameNew = sc.next();
//                            book.setNameBook(nameNew);
//                            book.outputBook();
//                            break;
//                        case MenuDefine.EDIT_SHELVES_BOOK:
//                            System.out.print("nhập giá sách cần sửa :");
//                            float priceNew = sc.nextFloat();
//                            book.setBookShelves(priceNew);
//                            book.outputBook();
//                            break;
//                        case MenuDefine.EDIT_RELEASE_DATE_BOOK:
//                            System.out.print("nhập ngày phát hành sách cần sửa :");
//                            int releaseDateNew = sc.nextInt();
//                            book.setReleaseDate(releaseDateNew);
//                            book.outputBook();
//                            break;
//                        case MenuDefine.EDIT_NAME_AUTHOR_BOOK :
//                            System.out.print("nhập tên tác giả cần sửa :");
//                            String authorNew = sc.next();
//                            book.setAuthor(authorNew);
//                            book.outputBook();
//                            break;
//                        case MenuDefine.EDIT_DATE_SALE_BOOK :
//                            System.out.print("nhập ngày bán sách cần sửa :");
//                            int saleDateNew = sc.nextInt();
//                            book.setDateSale(saleDateNew);
//                            book.outputBook();
//                            break;
//
//                        default :
//                            back = false;
//                    }
//                } while (back);
//            }
//        }
//    }
//}