package QLsach;

public class MenuDefine {

    public static final int INPUT_BOOK_STORE_SELECTION = 1;
    public static final int OUTPUT_BOOK_STORE = 2;
    public static final int SEARCH_BOOK_STORE = 3;
    public static final int REMOVE_BOOK_STORE = 4;

    public static void printBookStoreMenu() {
        System.out.println("1.Nhập thông nhà sách. \n" +
                            "2.Xuất danh sách nhà sách.\n" +
                            "3.Tìm kiếm nhà sách.\n" +
                            "4.xoá nhà sách.\n" +
                            "Nhập số khác để thoát.");
    }

    public static final int INPUT_BOOK_SELECTION = 1;
    public static final int OUTPUT_BOOK = 2;
    public static final int SEARCH_BOOK = 3;
    public static final int SUM_SHELVES_BOOK = 4;
    public static final int REMOVE_BOOK = 5;
    public static final int EDIT_BOOK = 6;

    public static void printBookMenu() {
        System.out.println("1.Nhập thông tin sách. \n" +
                            "2.Xuất danh sách sách.\n" +
                            "3.Tìm kiếm trong sách sách.\n" +
                            "4.tính tổng tiền bán sách.\n" +
                            "5.xoá sách.\n" +
                            "6.sửa thông tin sách.\n" +
                            "Nhập số khác để thoát.");
    }

    public static final int EDIT_NAME_BOOK= 1;
    public static final int EDIT_SHELVES_BOOK= 2;
    public static final int EDIT_RELEASE_DATE_BOOK= 3;
    public static final int EDIT_NAME_AUTHOR_BOOK= 4;
    public static final int EDIT_DATE_SALE_BOOK= 5;

    public static  void printEditMenuBook() {
        System.out.println("Bạn chọn làm gì?");
        System.out.println("1.Sửa tên sách. \n" +
                            "2.Sửa giá sách.\n" +
                            "3.Sửa ngày bán.\n" +
                            "4.Sửa tên tác giả.\n" +
                            "5.Sửa ngày bán.\n" +
                            "Nhập số khác để thoát.");
    }

    public static final int EDIT_NAME_BOOKSTORE= 1;
    public static final int EDIT_ADDRESS_BOOKSTORE= 2;

    public static void printEditMenuStore() {
        System.out.println("Bạn chọn làm gì?");
        System.out.println("1.Sửa tên nhà sách. \n" +
                            "2.Sửa địa chỉ nhà sách.\n" +
                            "Nhập số khác để thoát.");
    }
}
