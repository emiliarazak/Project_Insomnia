/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;
import point.Point;

/**
 *
 * @author Emilia
 */
public class Character {
    private final int max_life;
    private int life;
    private Point coordinate;
    
    public Character(int max_life, Point coordinate) {
        this.max_life=max_life;
        this.coordinate=coordinate;
        life=max_life;
    }
    
    public int getLife(){
        return life;
    }
    public void setLife(int life) {
        this.life=life;
    }
    public void Move() {
    }
    public void Attack(){
    }
}
