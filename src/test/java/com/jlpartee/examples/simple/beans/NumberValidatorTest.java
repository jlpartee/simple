package com.jlpartee.examples.simple.beans;

import org.junit.Assert;
import org.junit.Test;


public class NumberValidatorTest {

    @Test
    public void isNumberValidTest(){
        NumberValidator nv = new NumberValidator("12345");
        Assert.assertEquals(true, nv.isValid());
    }

    @Test
    public void isNumberNotValidTest(){
        NumberValidator nv = new NumberValidator("12345abscdef");
        Assert.assertEquals(false, nv.isValid());
    }

    @Test
    public void isNumberValidIntegerTest(){
        NumberValidator nv = new NumberValidator("125689");
        Assert.assertEquals(true, nv.isInteger());
    }

    @Test
    public void isNumberNotValidIntegerTest(){
        NumberValidator nv = new NumberValidator("2147483648");
        Assert.assertEquals(false, nv.isInteger());
    }

    @Test
    public void isNumberValidDoubleTest(){
        NumberValidator nv = new NumberValidator("2147483648.567");
        Assert.assertEquals(true, nv.isDouble());
    }
}
