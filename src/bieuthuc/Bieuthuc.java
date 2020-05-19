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
public class Bieuthuc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bieu_thuc bt = new toanHangDonGian(10);
        
        BieuthucDecorator btdc = new Nhan(5, bt);
        System.out.println(btdc.bieuThuc()+ btdc.giaTri());
        
        
        
    }
    
}
