/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author Laptop
 */
public class Main {
    public static void main(String[] args) {
        SinhVienPoly SV1 = new SinhVienIT(7, 6, 8, "Đặng Quang Nghĩa", "CNTT") {} ;
        System.out.println("\nSinh vien IT cua sinh vien Poly");
        SV1.xuat();
        
        SinhVienPoly SV2 = new SinhVienBiz(8, 8, "Nguyễn Tấn Tín", "tài chính ngân hàng") {};
        System.out.println("\nSinh vien Biz cua sinh vien Poly");
        SV2.xuat();
    }
}
