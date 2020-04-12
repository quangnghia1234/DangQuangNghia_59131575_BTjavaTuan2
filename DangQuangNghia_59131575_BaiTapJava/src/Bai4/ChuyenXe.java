/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

/**
 *
 * @author Laptop
 */
public class ChuyenXe {
    protected String maSoChuyenXe;
    protected String hotenTaiXe;
    protected int soXe;
    protected double doanhThu;

    public ChuyenXe(String maSoChuyenXe, String hotenTaiXe, int soXe, double doanhThu) {
        this.maSoChuyenXe = maSoChuyenXe;
        this.hotenTaiXe = hotenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getMaSoChuyenXe() {
        return maSoChuyenXe;
    }

    public void setMaSoChuyenXe(String maSoChuyenXe) {
        this.maSoChuyenXe = maSoChuyenXe;
    }

    public String getHotenTaiXe() {
        return hotenTaiXe;
    }

    public void setHotenTaiXe(String hotenTaiXe) {
        this.hotenTaiXe = hotenTaiXe;
    }

    public int getSoXe() {
        return soXe;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    
    public void hienthiTTCX()
    {
        System.out.println("Mã số chuyến xe :"+ maSoChuyenXe +", Họ tên tài xế :"+hotenTaiXe+", Số xe :"+soXe+", Doanh thu :"+doanhThu);
    }
}
