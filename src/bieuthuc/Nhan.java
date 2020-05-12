/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bieuthuc;

/**
 *
 * @author hoang
 */
public class Nhan extends BieuthucDecorator{

    private int toangHang;

    public int getToangHang() {
        return toangHang;
    }

    public void setToangHang(int toangHang) {
        this.toangHang = toangHang;
    }
    @Override
    public float giaTri() {
        return bieuthuc.giaTri() * toangHang;
    }

    @Override
    public String bieuThuc() {
        return "*"+this.toangHang;
    }

    
    
    
}
