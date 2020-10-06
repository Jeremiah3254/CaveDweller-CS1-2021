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
public class Bat {
    //Fields - Instance variabls
    private boolean alive;
    private int x, y, damage;
    
    //constructor
    public Bat(int x,int y,boolean alive) {
        this.x = x;
        this.y = y;
        this.alive = true;
        this.damage = 10;
    }
    
    
    
    
    //methods
    public String toString() {
        return "x: "+x+", y: "+y;
    }
    
    public void moveAround(Bat bat) {
        //increase/decrease x by random number
        bat.x = (int) (x + Math.random() * 3);
        bat.x = (int) (x - Math.random() * 3);
        //increasee/decrease by random number
        bat.y = (int) (y + Math.random() * 3);
        bat.y = (int) (y - Math.random() * 3);
    }
    
    public void bite(Caveman caveman) {
        //reduce the hp of the caveman
        caveman.setHP(caveman.getHp()-damage);
        System.out.println("Bat has attacked you and done "+damage+" Damage.");
    }
    //accssors (getters/setters)

    
    
    public void setDamage(int damage) {
        this.damage = 10;
    }
    
    public boolean isAlive() {
        return alive;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDamage() {
        return damage;
    }
    
    
}
