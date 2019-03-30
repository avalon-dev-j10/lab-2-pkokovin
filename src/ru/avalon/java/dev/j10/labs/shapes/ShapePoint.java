/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs.shapes;

import static java.lang.Math.sqrt;

/**
 *
 * @author pashak
 */
public class ShapePoint implements Point{
    private final float x;
    private final float y;

    public ShapePoint(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    

    @Override
    public float getX() {
        return x;
    }

    @Override
    public float getY() {
        return y;
    }
    
    public float distanceTo(ShapePoint other){
        float m = this.x - other.x;
        float n = this.y - other.y;
        return (float)sqrt(m*m+n*n);
    }
    
}
