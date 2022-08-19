package QLsach;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagementBookStore {

    private ArrayList<BookStore> list;

    public ManagementBookStore() {
        list = new ArrayList<BookStore>(100);
    }

    public void addStore(BookStore stores) {
        list.add(stores);
    }

    public void removeStore(BookStore stores) {

    }

    int storeNumber = 0;

    public void inputList(Scanner sc) {
        BookStore stores;
        int countIndex = storeNumber;
        System.out.print("Nhập số nhà sách : ");
        storeNumber = sc.nextInt();
        int assginIndex = storeNumber + countIndex;
        for ( int i = countIndex; i < assginIndex; i ++) {
            countIndex++;
            System.out.println("Nhà sách " + (i + 1) + ": ");
            stores = new BookStore();
            stores.inputBookStore(sc);
            addStore(stores);
        }
    }

    public void outputList(Book[] books) {
        int i = 0;
         for (BookStore stores : list) {
             System.out.println("\n Nhà sách thứ " + (i + 1) + ":");
             stores.outputBookStore(books);
             i++;
         }
    }

    public BookStore storeSearch(Book[] books) {
        BookStore searchBookStore = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập id nhà sách cần tìm : ");
        int idStoreSearch = sc.nextInt();
        for (BookStore bookStore : list) {
            if (bookStore != null && idStoreSearch == bookStore.getIdBookStore()) {
                System.out.println("Nhà sách vừa tìm kiếm :");
                bookStore.outputBookStore(books);
                searchBookStore = bookStore;
            } else {
                System.out.println("không có");
            }
        }

       return searchBookStore;
    }

    public void removeStore(Book[] books) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập id cần xoá : ");
        int idStoreRemove = sc.nextInt();
        for(BookStore stores : list) {
            if (stores != null && stores.getIdBookStore() != idStoreRemove) {
                removeStore(stores);
                stores.outputBookStore(books);
            } else {
                System.out.println("Hết danh sách cần xoá !!!!!");
            }
        }
    }
}