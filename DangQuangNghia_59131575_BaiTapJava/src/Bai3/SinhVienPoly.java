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
public abstract class SinhVienPoly {
  protected String hoTen;
   protected String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    public abstract double getDiem();
    
    public String getHocluc(){
        if (getDiem() <5 ) return "yếu";
        else if( 5 <= getDiem() && getDiem() < 6.5) return "Trung Bình";
        else if(6.5 <= getDiem() && getDiem() <7.5) return "Khá";
        else if(7.5 <= getDiem() && getDiem() <9 ) return "Giỏi";
        else if (getDiem() >= 9) return "Xuất Sắc";
       return null;
    }
    
    public void xuat(){
        System.out.println("Họ tên :"+hoTen);
        System.out.println("Tên ngành học :"+nganh);
        System.out.println("Điểm :"+getDiem());
        System.out.println("Học lực :"+getHocluc());
    }
}
