package ca.queensu.cs.cisc124.asgmt.a2;

import java.awt.Color;
import ca.queensu.cs.cisc124.notes.basics.geometry.Point2;
import ca.queensu.cs.cisc124.notes.basics.geometry.Vector2;
import princeton.introcs.StdDraw;
public class pen {
    private Color color;
    private float radius;
    private boolean state;

    /**
     * constructor for basic pen. pen is down, black and has a radius of 0.5
     */
    public pen(){
        this.color = Color.BLACK;
        this.radius = 0.5f;
        this.state = true;
    }

    /**
     * creates a new pen with attributes copied from a different pen
     * @param other the pen to copy
     */
    public pen(pen other){
        this.color = other.color;
        this.radius = other.radius;
        this.state = other.state;
    }

    /**
     *
     * @return returns true if pen is down, false if pen is up
     */
    public boolean isOn() {
        return this.state;
    }

    /**
     * reverses the current state of the pen
     */
    public void togglePen(){
        this.state=!this.state;
    }

    /**
     *
     * @return the current color of the pen
     */
    public Color getColor(){
        return this.color;
    }
    /**
     * Sets the color of the current pen
     * @param c color to set pen to
     */
    public void setColor(Color c){
        this.color = c;
    }

    /**
     *
     * @return the current radius of the pen
     */
    public float getRadius(){
        return this.radius;
    }

    /**
     * Sets the radius of the current pen
     * @param r radius value to set pen to
     */
    public void setRadius(float r){
        this.radius = r;
    }


}

