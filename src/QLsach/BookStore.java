package QLsach;

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

    public int getIdBook() {
        return idBookStore;
    }

    public void setIdBook(int idBook) {
        this.idBookStore = idBook;
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
}
