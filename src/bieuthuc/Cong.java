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
public class Cong  extends BieuthucDecorator{  

    public Cong(float toanHang, bieu_thuc bieuthuc) {
        super(bieuthuc);
        this.toanHang = toanHang;
    }
    float toanHang;


    public float getToanHang() {
        return toanHang;
    }

    public void setToanHang(float toanHang) {
        this.toanHang = toanHang;
    }

    @Override
    public String bieuThuc() {
        return "+"+this.toanHang; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float giaTri() {
        return this.toanHang; //To change body of generated methods, choose Tools | Templates.
    }
    
}
