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

   float toangHang;

   
   public Nhan(int toanHang, bieu_thuc bieuthuc){
       super(bieuthuc);
        this.toangHang = toanHang;
   }
    public float getToangHang() {
        return toangHang;
    }

    public void setToangHang(int toangHang) {
        this.toangHang = toangHang;
    }
    @Override
    public float giaTri() {
          return super.giaTri() * toangHang;
    }

    @Override
    public String bieuThuc() {
        return   super.bieuThuc() + "*"+this.toangHang;
    }

    
    
    
}
