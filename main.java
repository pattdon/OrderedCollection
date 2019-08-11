/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patta
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comparables obj = new Comparables();
        obj.MadeArray(10);
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.insert(5);
        obj.insert(6);
        obj.insert(7);
        obj.insert(8);
        obj.insert(9);
        obj.insert(10);
        //obj.output();
        //obj.findMax();
        //obj.findMin();
        obj.remove(4);
        //obj.output();
        obj.insert(1, 123);
        obj.output();
        obj.isEmpty();
        obj.MadeEmpty();
        obj.output();
    }
    
}






















