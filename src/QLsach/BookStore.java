package QLsach;

import java.util.Scanner;

public class BookStore {
    public int idBookStore;

    public String nameBookStore;

    public String address;

    public BookStore() {

    }

    public BookStore(int idBookStore, String nameBookStore, String address) {
        this.idBookStore = idBookStore;
        this.nameBookStore = nameBookStore;
        this.address = address;
    }

    public int getIdBookStore() {
        return idBookStore;
    }

    public void setIdBookStore(int idBookStore) {
        this.idBookStore = idBookStore;
    }

    public String getNameBookStore() {
        return nameBookStore;
    }

    public void setNameBookStore(String nameBookStore) {
        this.nameBookStore = nameBookStore;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputBookStore() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập id nhà sách :");
        idBookStore = sc.nextInt();

        System.out.print("Nhập tên nhà sách : ");
        nameBookStore = sc.nextLine();
        nameBookStore = sc.nextLine();

        System.out.print("Nhập địa chỉ nhà sách : ");
        address = sc.nextLine();
    }

    public void outputBookStore(Book[] books) {
        System.out.println("==========================");
        System.out.println("ID cửa hàng : " + idBookStore);
        System.out.println("Tên cửa hàng : " + nameBookStore);
        System.out.println("Địa chỉ : " + address);
        System.out.println("danh sách sách : ");

        boolean hasBook = false;
        for (Book b : books) {
            if (b != null && b.bookStore.idBookStore == idBookStore) {
                b.outputBook();
                hasBook = true;
            }
        }

        if (!hasBook) {
            System.out.println("không có\n");
        }
    }
}
