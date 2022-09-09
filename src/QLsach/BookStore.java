package QLsach;

import java.util.Scanner;

public class BookStore {
    public int idBookStore;

    public String nameBookStore;

    public String address;

    public BookStore() {

    }

    public BookStore(int idBookStore,String nameBookStore, String address) {
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

    @Override
    public  String toString(){
        return "id: " + idBookStore +"|| "+ "name :" + nameBookStore +" ||"+ "address :" +address;
    }

    public void display() {
        System.out.println(this);
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
}