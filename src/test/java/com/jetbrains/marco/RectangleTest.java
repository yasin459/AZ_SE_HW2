package com.jetbrains.marco;

import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;



class RectangleTest {
    
    @Test
    void test_rectangle(){
        Rectangle rect = new Rectangle();
        assertNotNull(rect);
    }

}





















    // @Test
    // void test_getter_setter_height(){
    //     mocked_rect.setHeight(25);
    //     int h = mocked_rect.getHeight();
    //     mocked_rect.setHeight(h+6);
    //     assertEquals(31 , mocked_rect.getHeight());
    // }
    // @Test
    // void test_getter_setter_width(){
    //     mocked_rect.setWidthRectangle(25);
    //     int h = mocked_rect.getWidth();
    //     mocked_rect.setWidthRectangle(h+6);
    //     assertEquals(31 , mocked_rect.getWidth());
    // }