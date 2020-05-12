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
        System.out.print(bt.giaTri());
        bt = new Chia(5,bt);
        System.out.print(bt.giaTri());
        System.out.print(bt.bieuThuc());
        bt = new Cong(10,bt);
        System.out.print(bt.giaTri());
        System.out.print(bt.bieuThuc());
        System.out.print("=");
        System.out.print(bt.giaTri());
        
        
        
    }
    
}
