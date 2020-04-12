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
public class Main {
    public static void main(String[] args) {
        QuanLyChuyenXe QLCX = new QuanLyChuyenXe();
        ChuyenXeNoiThanh CXNoT1 = new ChuyenXeNoiThanh(3, 100, "MS123", "Đặng Quang Nghĩa", 59131575, 2000000);
        ChuyenXeNoiThanh CXNoT2 = new ChuyenXeNoiThanh(4, 130, "MS124", "Nguyen thien thua", 59131875, 2400000);
        ChuyenXeNoiThanh CXNoT3 = new ChuyenXeNoiThanh(5, 150, "MS125", "Đặng tấn Tín", 59131579, 2500000);
        ChuyenXeNgoaiThanh CXNgT1 = new ChuyenXeNgoaiThanh("Nha Trang", 4, "MS126", "Nguyễn Tấn Thi", 59483833, 1000000);
        ChuyenXeNgoaiThanh CXNgT2 = new ChuyenXeNgoaiThanh("Huế", 4, "MS127", "Le Xuan Trung", 59131111, 1000000);
        ChuyenXeNgoaiThanh CXNgT3 = new ChuyenXeNgoaiThanh("Đà Nẵng", 4, "MS128", "Nguyễn Tấn Kiet", 59112261, 1000000);
        
        QLCX.themChuyenXe(CXNoT1);
        QLCX.themChuyenXe(CXNoT2);
        QLCX.themChuyenXe(CXNoT3);
        QLCX.themChuyenXe(CXNgT1);
        QLCX.themChuyenXe(CXNgT2);
        QLCX.themChuyenXe(CXNgT3);
        
        QLCX.inDSCX();
        
        System.out.println("Tổng doanh thu chuyến xe ngoại thành :"+QLCX.tinhDoanhThuNgoaiThanh());
        System.out.println("Tổng doanh thu chuyến xe nội thành :"+QLCX.tinhDoanhThuNoiThanh());
        System.out.println("tổng doanh thu cả 2 loại xe :"+QLCX.tongDoanhThu());
    }
}
