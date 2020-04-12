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
public class ChuyenXeNgoaiThanh extends ChuyenXe{
    String noiDen;
    int soNgay;

    public ChuyenXeNgoaiThanh(String noiDen, int soNgay, String maSoChuyenXe, String hotenTaiXe, int soXe, double doanhThu) {
        super(maSoChuyenXe, hotenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgay = soNgay;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }
    
    @Override
    public void hienthiTTCX(){
        System.out.println("\nThông tin chuyến xe ngoại thành :");
        super.hienthiTTCX();
        
        System.out.println(", Nơi đến :"+noiDen+", Số ngày :"+soNgay);
    }
}

