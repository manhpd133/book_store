package QLsach;

import java.util.Scanner;

public class Book extends BookStore{

    public int idBook;

    public int releaseDate;

    public String nameBook;

    public String author;

    public float bookShelves;

    public int dateSale;

    public BookStore bookStore;

    public Book() {

    }

    public Book (int idBook, String nameBook, float bookShelves, int releaseDate, String author, int dateSale, BookStore bookStore) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.bookShelves = bookShelves;
        this.releaseDate = releaseDate;
        this.author = author;
        this.dateSale = dateSale;
        this.bookStore= bookStore;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public float getBookShelves() {
        return bookShelves;
    }

    public void setBookShelves(float bookShelves) {
        this.bookShelves = bookShelves;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getDateSale() {
        return dateSale;
    }

    public void setDateSale(int newDate) {
        this.dateSale = newDate;
    }

    public BookStore getBookStore() {
        return bookStore;
    }

    public void setBookStore(BookStore bookStore) {
        this.bookStore = bookStore;
    }

    @Override
    public  String toString(){

        return "idBook: " + idBook +"|| "+ "nameBook :" + nameBook +" ||"+ "bookShelves :" + bookShelves +" ||"+ "releaseDate :" + releaseDate +" ||"+ "author :" + author +" ||"+ "dateSale :" + dateSale +" ||" + "idBookStore :" + bookStore.idBookStore ;
    }

    public void displaybook() {
        System.out.println(this);
    }

    public void inputBook () {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhập id : ");
        idBook = sc.nextInt();

        System.out.print("nhập tên sách : ");
        nameBook = sc.nextLine();
        nameBook = sc.nextLine();

        System.out.print("nhập giá sách : ");
        bookShelves = sc.nextFloat();

        System.out.print("nhập tác giả : ");
        author = sc.nextLine();
        author = sc.nextLine();

        System.out.print("nhập id nhà sách : ");
        idBookStore = sc.nextInt();

        do {
            System.out.print("nhập ngày phát hành : ");
            releaseDate = sc.nextInt();
        } while (releaseDate > 31|| releaseDate <= 0);

        do {
            System.out.print("nhập ngày bán : ");
            dateSale = sc.nextInt();
        } while (dateSale > 31 || dateSale <= 0);
    }
}