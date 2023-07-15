package com.jetbrains.marco;

class Rectangle extends Shape {

    public Rectangle(int height, int width){
        super(height, width);
    }
    
    
}

class Square extends Shape {

    public Square(int height, int width){
        super(height, width);
    }
    

}

class Shape{

    private int h;
    private int w;

    public Shape(int height, int width) {
        h = height;
        w = width;
    }

    public int getHeight() {
        return h;
    }

    public int getWidth() {
        return w;
    }

    public void  setHeight(int height) {
        this.h = height;
    }
    
    public void setWidthRectangle(int width) {
        this.w = width;
    }

    public int computeArea(){
        return h * w;
    }
}