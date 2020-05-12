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
public class toanHangDonGian extends bieu_thuc{

    public toanHangDonGian(float toanHang) {
        this.toanHang = toanHang;
    }
    private float toanHang;

    public float getToanHang() {
        return toanHang;
    }
    
    public void setToanHang(float toanHang) {
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return this.toanHang;
    }

    @Override
    public String bieuThuc() {
        return strBuider.append(toanHang).toString();
    }
    StringBuilder strBuider = new  StringBuilder();
    
}
