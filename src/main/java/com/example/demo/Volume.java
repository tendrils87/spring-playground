package com.example.demo;

public class Volume {
    private int length;
    private int width;
    private int height;
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int calcVolume(){
        return length*width*height;
    }
}
