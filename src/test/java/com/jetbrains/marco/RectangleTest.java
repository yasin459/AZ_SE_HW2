package com.jetbrains.marco;

import org.junit.jupiter.api.*;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class RectangleTest {
    
    @Test
    void test_rectangle(){
        Rectangle rect = new Rectangle(10,12);
        assertNotNull(rect);
    }

    @Test
    void test_compute_area(){
        int h =10;
        int w =12;
        Rectangle rect = new Rectangle(h,w);
        assertEquals(h*w, rect.computeArea());
    }

    @Test
    void test_getter_setter_height(){
        Rectangle rect = new Rectangle(5,7);
        rect.setHeight(25);
        int h = rect.getHeight();
        rect.setHeight(h+6);
        assertEquals(31 , rect.getHeight());
    }
    @Test
    void test_getter_setter_width(){
        Rectangle rect = new Rectangle(5,7);
        rect.setWidthRectangle(25);
        int h = rect.getWidth();
        rect.setWidthRectangle(h+6);
        assertEquals(31 , rect.getWidth());
    }


    @Test
    void test_shape(){
        Shape rect = new Shape(10,12);
        assertNotNull(rect);
    }

    @Test
    void test_compute_area_shape(){
        int h =10;
        int w =12;
        Shape rect = new Shape(h,w);
        assertEquals(h*w, rect.computeArea());
    }

    @Test
    void test_getter_setter_height_shape(){
        Shape rect = new Shape(5,7);
        rect.setHeight(25);
        int h = rect.getHeight();
        rect.setHeight(h+6);
        assertEquals(31 , rect.getHeight());
    }
    @Test
    void test_getter_setter_width_shape(){
        Shape rect = new Shape(5,7);
        rect.setWidthRectangle(25);
        int h = rect.getWidth();
        rect.setWidthRectangle(h+6);
        assertEquals(31 , rect.getWidth());
    }

    @Test
    void test_square(){
        Square rect = new Square(12,5);
        assertNotNull(rect);
    }

}