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
public class Tru extends BieuthucDecorator{

    public Tru(int toanHang, bieu_thuc bieuthuc) {
        super(bieuthuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int toanHang;

    @Override
    public String bieuThuc() {
        return bieuThuc()+"-"+ toanHang;
    }
}
