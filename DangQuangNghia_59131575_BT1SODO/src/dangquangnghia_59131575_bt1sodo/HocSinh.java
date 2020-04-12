/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dangquangnghia_59131575_bt1sodo;

/**
 *
 * @author Laptop
 */
public class HocSinh extends CaNhan{
    private String lop;
    private String nangKhieu;

    public HocSinh(String lop, String nangKhieu, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }

    @Override
    public void hienthiTT() {
        System.out.println("Họ tên HS: "+hoTen);
        System.out.println("tuổi : "+tuoi);
        System.out.println("Địa Chỉ HS: "+diaChi);
        System.out.println("Số điện thoại của HS : "+sdt);
        System.out.println("Lớp : "+lop);
        System.out.println("Năng khiếu : "+nangKhieu);
    }
}
