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
public abstract class SinhVienIT extends SinhVienPoly{
   private double diemJava;
   private double diemCss;
   private double diemHtml;

    public SinhVienIT(double diemJava, double diemCss, double diemHtml, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public void setDiemCss(double diemCss) {
        this.diemCss = diemCss;
    }

    public double getDiemHtml() {
        return diemHtml;
    }

    public void setDiemHtml(double diemHtml) {
        this.diemHtml = diemHtml;
    }
    
    
    /**
     *
     * @return
     */
    @Override
    public double getDiem(){
       return (2*diemJava + diemHtml + diemCss)/4; 
    }
}