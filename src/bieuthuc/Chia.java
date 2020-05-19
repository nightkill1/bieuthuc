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
public class Chia extends BieuthucDecorator{

    public Chia(int toanHang, bieu_thuc bieuthuc) {
        super(bieuthuc);
        this.toanHang = toanHang;
    }
    float toanHang;

    @Override
    public String bieuThuc() {
        return super.bieuThuc() +"/" + toanHang; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float giaTri() {
        return  super.giaTri() / toanHang;  //To change body of generated methods, choose Tools | Templates.
    }

    
    public void setToanHang(int toanHang) {
        this.toanHang = toanHang;
    }
}
