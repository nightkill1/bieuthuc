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
public abstract class BieuthucDecorator extends bieu_thuc{

    public BieuthucDecorator(bieu_thuc bieuthuc) {
        this.bieuthuc = bieuthuc;
    }
    bieu_thuc bieuthuc;
    
    
}
