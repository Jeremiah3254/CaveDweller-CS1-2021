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
public class Cave {
   private double temp;
   private int size;
   private Bat bat;
   private Bat bat2;
   private Caveman caveman;
   private Key key;
   private Food Food1;
   private Food Food2;
   private Door door;
    
    public Cave() {
        this.temp = Math.random() * 100;
        this.size = (int)(Math.random()*11) + 6;
        //Inastantiate (sets the attributes)
        this.Food1 = new Food("Apple",(int)(Math.random() * this.size),(int)(Math.random() * this.size),10,false);
        this.Food2 = new Food("banana",(int)(Math.random() * this.size),(int)(Math.random() * this.size),5,false);
        this.bat = new Bat((int)(Math.random() * this.size),(int)(Math.random() * this.size),true);
        this.bat2 = new Bat((int)(Math.random() * this.size),(int)(Math.random() * this.size),true);
        this.caveman = new Caveman("Grog",(int)(Math.random() * this.size),(int)(Math.random() * this.size));
        this.door = new Door((int)(Math.random() * this.size),(int)(Math.random() * this.size));
        this.key = new Key((int)(Math.random() * this.size),(int)(Math.random() * this.size));
       
    }
    // check for Apple
    private void checkCollisions1() {
        if (caveman.getX() == Food1.getX() && caveman.getY() == Food1.getY()) {
            caveman.eat(Food1);
        } 
        if ((caveman.getX() == Food2.getX() && caveman.getY() == Food2.getY())) {
            caveman.eat(Food2);
        }
        if (caveman.getX() == bat.getX() && caveman.getY() == bat.getY()) {
            bat.bite(caveman);
        }
        if (caveman.getX() == key.getX() && caveman.getY() == key.getY()) {
            //caveman.setHasKey(true);
            //key.giveKey(caveman);
            caveman.pickdUpKey();
        }
        if (caveman.getX() == door.getX() && caveman.getY() == door.getY()) {
            caveman.openDoor();
        }
        if (caveman.getX() == bat2.getX() && caveman.getY() == bat2.getY()) {
            bat.bite(caveman);
        }
    }

     
     
    public void handleInput(String input) {
        if (input.trim().equalsIgnoreCase("up")) {
           caveman.moveUp();
          // System.out.println(caveman.toString());
       }
        else if (input.trim().equalsIgnoreCase("down")) {
            caveman.moveDown();
           // System.out.println(caveman.toString());
        }
        else if (input.trim().equalsIgnoreCase("right")) {
            caveman.moveRight();
           // System.out.println(caveman.toString());
        }
        else if (input.trim().equalsIgnoreCase("left")) {
            caveman.moveLeft();
            //System.out.println(caveman.toString());
        }
        else if (input.trim().equalsIgnoreCase("close")) {
            System.exit(0);
        }
        else {
            System.out.println("(not a valid movement option)");
            //System.out.println(caveman.toString());
        }
        checkCollisions1();
        bat.moveAround(bat);
        bat.moveAround(bat2);
        System.out.println(caveman.toString());
        //System.out.println(bat.toString());
        //System.out.println(bat2.toString());
    }
    
    public String toString() {
        return ""+size;
    }
     
}
