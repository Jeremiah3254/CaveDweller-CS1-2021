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
public class Food {
    private int x, y, hpChange;
    private String name;
    private boolean Eaten;
    //fields
    
    //constructor
     public Food(String name, int x, int y, int hpChange, boolean Eaten) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.Eaten = false;
        this.hpChange = hpChange;
    }
    
    //methods
    public String toString() {
        return "x: "+x+", y: "+y;
    }
    
    //Accssors

    public void setHpChange(int hpChange) {
        this.hpChange = 10;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHPChange() {
        return hpChange;
    }

    public String getName() {
        return name;
    }

    public boolean setEaten() {
        return Eaten;
    }
    
}


