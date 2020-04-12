/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dangquangnghia_59131575_bt1sodo;

import java.util.ArrayList;

/**
 *
 * @author Laptop
 */
public class QLDS implements IQLDS{
    ArrayList<CaNhan> ds;

    public QLDS() {
        ds = new ArrayList();
    }

    @Override
    public int them(CaNhan p) {
        ds.add(p);
        return 1;
    }

    @Override
    public int xoa(String ten) {
       for (int i = 0; i<ds.size(); i++){
            if (ds.get(i).getHoTen().equals(ten)){
                ds.remove(i);
            }
        }
        return 1;
    }

    @Override
    public void inDS() {
        for(int i=0; i<ds.size(); i++){
            ds.get(i).hienthiTT();
        }
    }
    
    
}
