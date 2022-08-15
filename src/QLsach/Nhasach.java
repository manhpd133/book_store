package QLsach;

public class Nhasach {
    public int idBookStore;

    public String nameBookStore;

    public String adress;


    public Nhasach () {

    }
    public  Nhasach (int idBookStore, String nameBookStore, String adress) {
        this.idBookStore = idBookStore;
        this.nameBookStore = nameBookStore;
        this.adress = adress;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }


}
