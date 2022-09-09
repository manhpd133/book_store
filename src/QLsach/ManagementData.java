package QLsach;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ManagementData {
    public static void showBookStore() {
        try {
            Connection connection = ConnectionUtils.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM manegementbookstore ";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                BookStore bookStore = new BookStore(
                        resultSet.getInt("idbookstore"),
                        resultSet.getString("namebookstore"),
                        resultSet.getString("address"));
                bookStore.display();
            }
            connection.close();
            statement.close();
        } catch (Exception ex) {
            System.out.println("Lỗi " + ex);
        }
    }

    public static void insertBookStore() {
        BookStore bookStore = new BookStore();
        bookStore.inputBookStore();
        try {
            Connection connection = ConnectionUtils.getConnection();
            String query = "INSERT INTO manegementbookstore (idbookstore, namebookstore, address)" +
                    "VALUES (?, ?, ?) ";
            PreparedStatement statement = connection.prepareCall(query);
            statement.setInt(1, bookStore.getIdBookStore());
            statement.setString(2, bookStore.getNameBookStore());
            statement.setString(3, bookStore.getAddress());
            statement.execute();
            System.out.println(" Thêm thành công!");
        } catch (Exception ex) {
            System.out.println("Lỗi " + ex);
        }
    }

    public static void updateBookStore() {
        BookStore bookStore = new BookStore();
        bookStore.inputBookStore();
        try {
            Connection connection = ConnectionUtils.getConnection();
            String query = "UPDATE manegementbookstore " +
                    "SET namebookstore = ?, address = ?" +
                    "WHERE  idbookstore = ? ";
            PreparedStatement statement = connection.prepareCall(query);
            statement.setString(1, bookStore.getNameBookStore());
            statement.setString(2, bookStore.getAddress());
            statement.setInt(3, bookStore.getIdBookStore());
            statement.execute();
            System.out.println("Sửa thành công");
        } catch (Exception ex) {
            System.out.println("Lỗi " + ex);
        }
    }

    public static void deleteBookStore() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id can xoa: ");
        int idbookstore = sc.nextInt();
        try {
            Connection connection = ConnectionUtils.getConnection();
            String query = "DELETE FROM manegementbookstore WHERE idbookstore = ? ";
            PreparedStatement statement = connection.prepareCall(query);
            statement.setInt(1, idbookstore);
            statement.execute();
            System.out.println("Xoá thành công");
        } catch (Exception ex) {
            System.out.println("Lỗi " + ex);
        }
    }

    public static void findBookStore() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id cần tìm: ");
        int idbookstore = sc.nextInt();
        try {
            Connection connection = ConnectionUtils.getConnection();
            String query = "SELECT * FROM manegementbookstore WHERE idbookstore = ? ";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, idbookstore);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                BookStore bookStore = new BookStore(resultSet.getInt("idbookstore"),
                        resultSet.getString("namebookstore"),
                        resultSet.getString("address"));
                bookStore.display();
            }
            statement.execute();
        } catch (Exception ex) {
            System.out.println("Lỗi " + ex);
        }
    }

    public static void showBook() {
        try {
            Connection connection = ConnectionUtils.getConnection();
            Statement statement = connection.createStatement();
            Statement state = connection.createStatement();
            String query = "SELECT * " +
                    "FROM manegementbook ";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int idBookStore = resultSet.getInt("idbookstore");
                query = "SELECT * FROM manegementbookstore WHERE idbookstore = " + idBookStore;
                ResultSet result = state.executeQuery(query);
                BookStore bookStore = null;
                while (result.next()) {
                    bookStore = new BookStore(result.getInt("idbookstore"),
                            result.getString("namebookstore"),
                            result.getString("address"));
                }
                Book book = new Book(resultSet.getInt("idbook"), resultSet.getString("namebook"),
                        resultSet.getFloat("bookshelves"), resultSet.getInt("releasedate"),
                        resultSet.getString("author"), resultSet.getInt("saledate"), bookStore);
                book.displaybook();
            }
            connection.close();
            statement.close();
        } catch (Exception ex) {
            System.out.println("Lỗi " + ex);
        }
    }

    public static void insertBook() {
        Book book = new Book();
        book.inputBook();
        try {
            Connection connection = ConnectionUtils.getConnection();
            String query = "INSERT INTO manegementbook (idbook,namebook,bookshelves,author,idbookstore,releasedate,saledate)" +
                    "VALUES (?, ?, ?, ?, ?, ?, ?) ";
            PreparedStatement statement = connection.prepareCall(query);
            statement.setInt(1, book.getIdBook());
            statement.setString(2, book.getNameBook());
            statement.setFloat(3, book.getBookShelves());
            statement.setString(4, book.getAuthor());
            statement.setInt(5, book.getIdBookStore());
            statement.setInt(6, book.getReleaseDate());
            statement.setInt(7, book.getDateSale());
            statement.execute();
        } catch (Exception ex) {
            System.out.println("Lỗi " + ex);
        }
    }

    public static void deleteBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id can xoa: ");
        int idbook = sc.nextInt();

        try {
            Connection connection = ConnectionUtils.getConnection();
            String query = "DELETE FROM manegementbook WHERE idbook = ? ";
            PreparedStatement statement = connection.prepareCall(query);
            statement.setInt(1, idbook);
            statement.execute();
            System.out.println("Xoá thành công");

        } catch (Exception ex) {
            System.out.println("Lỗi " + ex);
        }
    }

    public static void updateBook() {
        Book book = new Book();
        book.inputBook();
        try {
            Connection connection = ConnectionUtils.getConnection();
            String query = "UPDATE manegementbook " +
                    "SET namebook = ?,bookshelves = ?,author = ?,idbookstore = ?,releasedate = ?,saledate = ? " +
                    "WHERE  idbook = ? ";
            PreparedStatement statement = connection.prepareCall(query);
            statement.setString(1, book.getNameBook());
            statement.setFloat(2, book.getBookShelves());
            statement.setString(3, book.getAuthor());
            statement.setInt(4, book.getIdBookStore());
            statement.setInt(5, book.getReleaseDate());
            statement.setInt(6, book.getDateSale());
            statement.setInt(7, book.getIdBook());
            statement.execute();
            System.out.println("Sửa thành công");
        } catch (Exception ex) {
            System.out.println("Lỗi " + ex);
        }
    }

    public static void findBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id cần tìm: ");
        int idbook = sc.nextInt();
        try {
            Connection connection = ConnectionUtils.getConnection();
            Statement state = connection.createStatement();
            String query = "SELECT * " +
                    "FROM manegementbook " +
                    "WHERE idbook = ? ";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1,idbook);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int idBookStore = resultSet.getInt("idbookstore");
                query = "SELECT * FROM manegementbookstore WHERE idbookstore = " + idBookStore;
                ResultSet result = state.executeQuery(query);
                BookStore bookStore = null;
                while (result.next()) {
                    bookStore = new BookStore(result.getInt("idbookstore"),
                            result.getString("namebookstore"),
                            result.getString("address"));
                }
                Book book = new Book(resultSet.getInt("idbook"), resultSet.getString("namebook"),
                        resultSet.getFloat("bookshelves"), resultSet.getInt("releasedate"),
                        resultSet.getString("author"), resultSet.getInt("saledate"), bookStore);
                book.display();
            }
            statement.close();
        } catch (Exception ex) {
            System.out.println("Lỗi " + ex);
        }
    }

    public static void sumShelvesBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id cần tìm: ");
        int idbookstore = sc.nextInt();

        try {
            Connection connection = ConnectionUtils.getConnection();
            String query = "Select sum(bookshelves) as sum " +
                    "from manegementbook " +
                    "where idbookstore = ? ";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, idbookstore);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Float sum = resultSet.getFloat("sum");
                System.out.println("Sum :" + sum);
            }
        } catch (Exception ex) {
            System.out.println("Lỗi " + ex);
        }
    }
}

