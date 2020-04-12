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
public class ChuyenXeNoiThanh extends ChuyenXe{
    private int soTuyen;
    private int soKm;

    public ChuyenXeNoiThanh(int soTuyen, int soKm, String maSoChuyenXe, String hotenTaiXe, int soXe, double doanhThu) {
        super(maSoChuyenXe, hotenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKm() {
        return soKm;
    }

    public void setSoKm(int soKm) {
        this.soKm = soKm;
    }

    @Override
    public void hienthiTTCX() {
        System.out.println("\nThông tin chuyến xe nội thành :\n");
        super.hienthiTTCX();
        
        System.out.println(", Số tuyến :"+soTuyen+", Số Km đi được"+soKm);
    }
}
