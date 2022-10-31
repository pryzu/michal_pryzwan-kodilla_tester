package com.kodilla.abstracts.homework;

public abstract class  Shape {
    public int height;
    public int wide;
    public Shape (int height, int wide){
        this.height = height;
        this.wide = wide;
    }
    public int getHeight(){
        return height;
    }
    public int getWide(){
        return wide;
    }

    public abstract void surfaceArea();
    public abstract void circuit();

}
