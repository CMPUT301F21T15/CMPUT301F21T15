package com.example.cmput301f21t15;

public abstract class Shape {

    private Integer x;
    private Integer y;
    
    private String color = "$PUT_YOUR_CHOICE_OF_COLOR";

    private String color;

    public Shape(Integer x, Integer y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
}
