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
public class GiaoVien extends CaNhan{
    private String monDay;
    private String toBoMon;

    public GiaoVien() {
    }

    public GiaoVien(String monDay, String toBoMon, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }

    @Override
    public void hienthiTT() {
        System.out.println("Họ tên Giáo Viên : "+hoTen);
        System.out.println("Tuổi :"+tuoi);
        System.out.println("Địa Chỉ Giáo Viên : "+diaChi);
        System.out.println("Số điện thoại của Giáo Viên : "+sdt);
        System.out.println("Môn dạy : "+monDay);
        System.out.println("Tổ bộ môn : "+toBoMon);
    }
    
}
