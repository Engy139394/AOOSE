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
public class Dog extends Animal
{

    public Dog() 
    {
        setOwner("Engy");
    }
    
    public void digHole()
    {
        System.out.println("dig a hole");
        
    }
    
}
