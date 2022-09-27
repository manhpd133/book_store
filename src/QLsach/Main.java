package QLsach;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int selection,select;
        boolean flag = true;
        boolean check = true;

        do {
            System.out.println("Bạn chọn làm gì?");
            MenuDefine.printBookStoreMenu();
            select = sc.nextInt();
            switch (select) {
                case MenuDefine.INPUT_BOOK_STORE_SELECTION :
                    ManagementData.insertBookStore();
                    break;
                case MenuDefine.OUTPUT_BOOK_STORE :
                    System.out.println("Danh sách nhà sách vừa nhập :");
                    ManagementData.showBookStore();
                    break;
                case MenuDefine.SEARCH_BOOK_STORE :
                    ManagementData.findBookStore();
                    break;
                case MenuDefine.REMOVE_BOOK_STORE :
                    ManagementData.deleteBookStore();
                    break;
                case MenuDefine.EDIT_BOOK_STORE:
                    ManagementData.updateBookStore();
                    break;
                case MenuDefine.MENU_BOOK:
                    do {
                        MenuDefine.printBookMenu();
                        selection = sc.nextInt();

                        switch (selection) {
                            case MenuDefine.INPUT_BOOK_SELECTION:
                                ManagementData.insertBook();
                                break;
                            case MenuDefine.OUTPUT_BOOK:
                                ManagementData.showBook();
                                break;
                            case MenuDefine.SEARCH_BOOK:
                                ManagementData.findBook();
                                break;
                            case MenuDefine.SUM_SHELVES_BOOK:
                                ManagementData.sumShelvesBook();
                                break;
                            case MenuDefine.REMOVE_BOOK:
                                ManagementData.deleteBook();
                                break;
                            case MenuDefine.EDIT_BOOK :
                                ManagementData.updateBook();
                                break;
                            default:
                                flag = false;
                        }
                    } while (flag);

                    break;
                default :
                    System.out.println("Goodbye");
                    check = false;
                    break;
            }
        } while (check);
    }
}