package QLsach;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int selection,select;
        ManagementBook managementBook = new ManagementBook();
        ManagementBookStore managementBookStore = new ManagementBookStore();
        boolean flag = true;
        boolean check = true;

        do {
            System.out.println("Bạn chọn làm gì?");
            MenuDefine.printBookStoreMenu();
            select = sc.nextInt();
            switch (select) {
                case MenuDefine.INPUT_BOOK_STORE_SELECTION :
                    managementBookStore.inputList();
                    break;
                case MenuDefine.OUTPUT_BOOK_STORE :
                    System.out.println("Danh sách nhà sách vừa nhập :");
                    managementBookStore.outputList(managementBook.getList());
                    break;
                case MenuDefine.SEARCH_BOOK_STORE :
                    BookStore searchBookStore = managementBookStore.storeSearch(managementBook.getList());

                    do {
                        MenuDefine.printBookMenu();
                        selection = sc.nextInt();

                        switch (selection) {
                            case MenuDefine.INPUT_BOOK_SELECTION:
                                managementBook.inputListBook(searchBookStore);
                                break;
                            case MenuDefine.OUTPUT_BOOK:
                                managementBook.outputListBook();
                                break;
                            case MenuDefine.SEARCH_BOOK:
                                managementBook.bookSearch();
                                break;
                            case MenuDefine.SUM_SHELVES_BOOK:
                                managementBook.bookSum();
                                break;
                            case MenuDefine.REMOVE_BOOK:
                                managementBook.bookRemove();
                                break;
                            case MenuDefine.EDIT_BOOK :
                                managementBook.bookEdit();
                                break;
                            default:
                                flag = false;
                        }
                    } while (flag);

                    break;
                case MenuDefine.REMOVE_BOOK_STORE :
                    managementBookStore.removeStore(managementBook.getList());

                    break;
                case MenuDefine.EDIT_BOOK_STORE:
                    managementBookStore.editStore(managementBook.getList());

                    break;
                default :
                    System.out.println("Goodbye");
                    check = false;
                    break;
            }
        } while (check);
    }
}