package com.example.cmput301f21t15;

public Class Rectangle extends Shape {
    private Integer l;
    private Integer b;

    public Rectangle (Integer x, Integer y, Integer l, Integer b) {
        super(x,y);
        
        this.l = l;
        this.b = b;
    }
}