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
public class BieuthucDecorator extends bieu_thuc{
bieu_thuc bieu_thuc;
    
    @Override
    public float giaTri() {
        return bieu_thuc.giaTri();
    }

    @Override
    public String bieuThuc() {
        return bieu_thuc.bieuThuc();
    }

    public BieuthucDecorator(bieu_thuc bieuthuc) {
        this.bieu_thuc = bieuthuc;
    }
    
    
    
}
