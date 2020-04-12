/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import Bai1.NhanVien;

/**
 *
 * @author Laptop
 */
public class Main {
    public static void main(String[] args) {
        QuanLyNhanVien QLNV = new QuanLyNhanVien();
        
        NhanVien NV1 = new NhanVien("Đặng Quang Nghĩa", "Ninh Hòa", 21, 600000, 100);
        NhanVien NV2 = new NhanVien("Đặng Quang Tiến", "Ninh Hải", 24, 800000, 150);
        NhanVien NV3 = new NhanVien("Nguyễn Thiện Thuật", "Ninh Phước", 20, 500000, 200);
        NhanVien NV4 = new NhanVien("Nguyến tấn Tín", "Ninh Hòa", 23, 900000, 200);
        NhanVien NV5 = new NhanVien("Ngô Xuân Trường", "Huế", 22, 9000000, 120);
        
        QLNV.them(NV1);
        QLNV.them(NV2);
        QLNV.them(NV3);
        QLNV.them(NV4);
        QLNV.them(NV5);
        
        QLNV.inDS();
    }
}
