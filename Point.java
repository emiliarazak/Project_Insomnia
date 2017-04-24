/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point;

/**
 *
 * @author Emilia
 */
public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
        this.x=x;
        this.y=y;
    }
    
    public int getAbsis() {
        return x;
    }
    
    public int getOrdinat() {
        return y;
    }
    
    public void setAbsis(int x){
        this.x=x;
    }
    public void setOrdinat(int y) {
        this.y=y;
    }
    
}
