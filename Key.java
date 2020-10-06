/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cavedweller;

/**
 *
 * @author 800215
 */
public class Key {
    //fields
    private int x,y;
    //constructors
    
    public Key(int x,int y) {
        this.x = x;
        this.y = y;
    }
    
    
    
    //methods
    
    public String toString() {
        return "x: "+x+", y: "+y;
    }
    
    
    
    //accessors

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    
}
