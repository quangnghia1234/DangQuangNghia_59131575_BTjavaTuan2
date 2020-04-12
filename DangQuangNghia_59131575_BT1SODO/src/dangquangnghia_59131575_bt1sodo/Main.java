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
public class Main {
    public static void main(String[] args) {
        LopHoc ID = new LopHoc();
    
    HocSinh hs1 = new HocSinh("CNTT", "Hát", "Đặng Quang Nghĩa", 21, "Ninh Hòa", " 59131575 ");
    HocSinh hs2 = new HocSinh("TCNH", "Nhảy", "Nguyễn Thiện Thuật", 19, "Phú Yên", " 61342567 ");
    HocSinh hs3 = new HocSinh("Markerting", "Hát", "Nguyễn Nữ Hoàng Oanh", 20, "Đà Nẵng", " 60132731 ");
    
        ID.themHocSinh(hs1);
        ID.themHocSinh(hs2);
        ID.themHocSinh(hs3);
        
        ID.inDSHS();
        
    GiaoVien gv1 = new GiaoVien("Cơ Sở Văn Hóa", "Xã Hội - Nhân Văn", "Ngô Xuân Giang", 45, "Nha Trang", "063478291");
    GiaoVien gv2 = new GiaoVien("Reading", "Ngoại Ngữ", "Hồ Quỳnh Ngân", 45, "Nha Trang", "063368291");
    
        ID.themGiaoVien(gv1);
        ID.themGiaoVien(gv1);
        
        ID.inDSGV();
    }
}