package QLsach;

public abstract class Nhasach {
    public int id;
    public String tennhasach;
    public String diachi;

    public Nhasach () {

    }
    public  Nhasach (int id,String tennhasach,String diachi) {
        this.id = id;
        this.tennhasach = tennhasach;
        this.diachi = diachi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTennhasach() {
        return tennhasach;
    }

    public void setTennhasach(String tennhasach) {
        this.tennhasach = tennhasach;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }


}
