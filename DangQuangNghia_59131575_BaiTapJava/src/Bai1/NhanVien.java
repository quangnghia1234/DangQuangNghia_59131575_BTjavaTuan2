/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author Laptop
 */
public class NhanVien {
    String ten;
    String diaChi;
    int tuoi;
    double tienLuong;
    int tongSoGioLam;

    public NhanVien() {
    }

    public NhanVien(String ten, String diaChi, int tuoi, double tienLuong, int tongSoGioLam) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
        this.tienLuong = tienLuong;
        this.tongSoGioLam = tongSoGioLam;
    }

    public NhanVien(String nghia, int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public int getTongSoGioLam() {
        return tongSoGioLam;
    }

    public void setTongSoGioLam(int tongSoGioLam) {
        this.tongSoGioLam = tongSoGioLam;
    }
    public String getthongTin() {
        return  "tên :" + ten +", Địa chỉ :" + diaChi + ", tuoi :" + tuoi + ", tienLuong :" + tienLuong + ", tongSoGioLam :" + tongSoGioLam + ",Tiền thưởng :"+tinhThuong();
    }
    public double tinhThuong(){
        if(tongSoGioLam < 100) return 0;
        else if (tongSoGioLam >= 200)
            return (int) (tienLuong*0.2);
        return (int) (tienLuong*0.1);
    }
}
