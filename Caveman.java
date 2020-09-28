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
public class Caveman {
    //Fields / Instance Variabls
    private String name; 
    private int hp, x, y;
    private boolean hasKey;
    
    //Constructor 
    public Caveman(String name, int x, int y) {
        this.hp = 100;
        this.hasKey = false;
        this.name = name;
        this.x = x;
        this.y = y;
    }
    //Methods (how does it happen)
    public void speak() {
        System.out.println("Grr");
    }
    
    public String toString() {
       return "x: "+x+", y: "+y;
    }
    
    public void moveUp() {
        //y tracks how far down (largr y farther down, smaller y higher up)
        y -= 1;
    }
    
    public void moveDown() {
        y += 1;
    }
    
    public void moveRight() {
        x += 1;
    }
    
    public void moveLeft() {
        x -= 1;
    }
    
    public void eat(Food food) {
        hp += food.getHPChange();
    }
    //Accessor - getters & setters (information between objects)
    
    public void setHP(int hp) {
        if (hp <= 100 && hp >= 0) {
            this.hp = hp;
        }
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isHasKey() {
        return hasKey;
    }
    
    
}
