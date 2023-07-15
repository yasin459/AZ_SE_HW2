package com.jetbrains.marco;

import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.assertEquals;


class RectangleTest {
    int h =12;
    int w = 10;
    Rectangle rect = new Rectangle(h, w);
    
    @Test
    void test_rectangle(){
        assertEquals(w*h, rect.computeArea());
    }
    

}
