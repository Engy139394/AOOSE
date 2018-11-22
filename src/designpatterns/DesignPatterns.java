/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns;

/**
 *
 * @author EngyE
 */
public class DesignPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Dog Rocky = new Dog();
        Rocky.setHeight("123");
        System.out.print(Rocky.getHeight());
        Rocky.digHole();
        
    }
    
}
