package QLsach;



// Nên xoá những import không dùng
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Book extends Nhasach {
//     Một dòng nên khai một biến
//     Ví dụ:
//     public int id;
//
//     public int ngay_phat_hanh;
    public int id,ngay_phat_hanh;
    public String tensach,tacgia; // Đặt tên biến nên theo quy tắc (tenSach hoặc ten_sach)
    public float giasach;
    public int ngayban;
    public String tennhasach;


    public Book(){

    } // Sau mỗi block code nên cách dòng
    public Book (int id,String tensach,float giasach,int ngay_phat_hanh,String tacgia,int ngayban,String tennhasach,String diachi) { // Cần format lại code, sau dấu , nên có khoảng trắng
        super(id,tennhasach,diachi);
        this.id = id;
        this.tensach = tensach;
        this.giasach = giasach;
        this.ngay_phat_hanh = ngay_phat_hanh;
        this.tacgia = tacgia;
        this.ngayban = ngayban;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public float getGiasach() {
        return giasach;
    }

    public void setGiasach(float giasach) {
        this.giasach = giasach;
    }

    public int getNgay_phat_hanh() {
        return ngay_phat_hanh;
    }

    public void setNgay_phat_hanh(int ngay_phat_hanh) {
        this.ngay_phat_hanh = ngay_phat_hanh;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public int getNgayban() {
        return ngayban;
    }


    public void setNgayban(int datenew) {
        this.ngayban = datenew;
    }

    public String getTennhasach() {
        return tennhasach;
    }

    public void setTennhasach(String tennhasach) {
        this.tennhasach = tennhasach;
    }


    public void nhap () { // nên đặt tên hàm rõ nghĩa hơn, nhập gì?
        Scanner sc = new Scanner(System.in);

        System.out.print("nhập id : ");
        id = sc.nextInt();

        System.out.print("nhập tên sách : ");
        tensach = sc.nextLine();
        tensach = sc.nextLine();

        System.out.print("nhập giá sách : ");
        giasach = sc.nextFloat();

        System.out.print("nhập ngày phát hành : ");
        ngay_phat_hanh = sc.nextInt();

        System.out.print("nhập tác giả : ");
        tacgia = sc.nextLine();
        tacgia = sc.nextLine();

        System.out.print("nhập ngày bán : ");
        ngayban = sc.nextInt();

        System.out.print("nhập tên nhà sách : ");
        tennhasach = sc.nextLine();
        tennhasach = sc.nextLine();

    }
    @Override
    public String toString () {
        return "id : " + this.id + ", ten sach: " + this.tensach +
                ", gia sach: " + this.giasach + ", ngay phat hanh: " + this.ngay_phat_hanh +
                ", tac gia: " + this.tacgia + ", ngay ban : " + this.ngayban + ", nha sach : " + this.tennhasach;

    }
    public void hienThiTT() { // không nên viết tắt
        System.out.printf("%-5d %-15s %-3f %-10d %-15s %-5d %-15s \n", id, tensach, giasach, ngay_phat_hanh,tacgia,ngayban,tennhasach);
    }


}

