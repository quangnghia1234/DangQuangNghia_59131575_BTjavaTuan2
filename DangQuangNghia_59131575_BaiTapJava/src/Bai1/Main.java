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
public class Main {
    public static void main(String[] args) {
        NhanVien NV1 = new NhanVien("Đặng Quang Nghĩa", "Ninh Hòa", 21, 7000000, 100);
        NhanVien NV2 = new NhanVien("Nguyễn Tấn Tín", "Huế", 20, 8000000, 200);
        
        System.out.println("Thông tin nhân viên thứ nhất \n"+NV1.getthongTin());
        System.out.println("Thông tin nhân viên thứ hai \n"+NV2.getthongTin());
    }
}
