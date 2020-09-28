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
    double temp;
    int size;
    Bat bat;
    Caveman caveman;
    Key key;
    Food Food1;
    Food Food2;
    Door door;
    
    public Cave() {
        this.temp = Math.random() * 100;
        this.size = (int)(Math.random()*11) + 6;
        //Inastantiate (sets the attributes)
        this.Food1 = new Food("Apple",(int)(Math.random() * this.size),(int)(Math.random() * this.size));
        this.Food2 = new Food("Grape",(int)(Math.random() * this.size),(int)(Math.random() * this.size));
        this.caveman = new Caveman("Grog",(int)(Math.random() * this.size),(int)(Math.random() * this.size));
       
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
        
        System.out.println(caveman.toString());
    }
    
    public String toString() {
        return ""+size;
    }
     
}
