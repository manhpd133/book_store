package QLsach;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {

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
        this.bookStore = bookStore;
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

    public void inputBook (BookStore bookStore) {
        this.bookStore = bookStore;
        Scanner sc = new Scanner(System.in);

        System.out.print("nhập id : ");
        idBook = sc.nextInt();

        System.out.print("nhập tên sách : ");
        nameBook = sc.nextLine();
        nameBook = sc.nextLine();

        System.out.print("nhập giá sách : ");
        bookShelves = sc.nextFloat();

        do {
            System.out.print("nhập ngày phát hành : ");
            releaseDate = sc.nextInt();
        } while (releaseDate > 31);

        System.out.print("nhập tác giả : ");
        author = sc.nextLine();
        author = sc.nextLine();

        do {
            System.out.print("nhập ngày bán : ");
            dateSale = sc.nextInt();
        } while (dateSale > 31 && dateSale < 0);
    }

    public void outputBook() {
        System.out.printf("Id sách:%-5d Tên sách: %-7s Giá tiền: %-3f  Ngày phát hành: %-3d Tác giả :%-7s Ngày bán: %-5d\n", idBook, nameBook, bookShelves, releaseDate, author, dateSale);
    }
}

