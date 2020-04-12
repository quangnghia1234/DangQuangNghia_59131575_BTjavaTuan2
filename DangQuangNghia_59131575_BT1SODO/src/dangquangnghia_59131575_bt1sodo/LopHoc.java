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
public class LopHoc {
    QLDS dsHS;
    QLDS dsGV;
    GiaoVien gvcn;

    public LopHoc() {
        dsHS = new QLDS();
        dsGV = new QLDS();
        gvcn = new GiaoVien();
    }

    public LopHoc(QLDS dsHS, QLDS dsGV, GiaoVien gvcn) {
        this.dsHS = dsHS;
        this.dsGV = dsGV;
        this.gvcn = gvcn;
    }

    public QLDS getDsHS() {
        return dsHS;
    }

    public void setDsHS(QLDS dsHS) {
        this.dsHS = dsHS;
    }

    public QLDS getDsGV() {
        return dsGV;
    }

    public void setDsGV(QLDS dsGV) {
        this.dsGV = dsGV;
    }

    public GiaoVien getGvcn() {
        return gvcn;
    }

    public void setGvcn(GiaoVien gvcn) {
        this.gvcn = gvcn;
    }

    public int themHocSinh(HocSinh hs){
       dsHS.them(hs);
       return 1;
    }
    
    public int themGiaoVien(GiaoVien gv){
        dsGV.them(gv);
        return 1;
    }
    
    public int inDSHS(){
        dsHS.inDS();
        return 1;
    }
    
    public int inDSGV(){
        dsGV.inDS();
        return 1;
    }

}