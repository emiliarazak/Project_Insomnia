/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cell;
import point.Point;

/**
 *
 * @author Emilia
 */
public class Cell {
    private Point coordinate;
    //type='r' adalah road,type='o' adalah obstacle
    private final char type;
    
    public Cell(char type, Point coordinate) {
        this.type=type;
        this.coordinate=coordinate;
    }
    
    public Point getCoordinate() {
        return coordinate;
    }
    
    public void setCoordinate(Point coordinate) {
        this.coordinate=coordinate;
    }
    
    public char getType() {
        return type;
    }
    
}
