package com.jlpartee.examples.simple.beans;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringValidatorTest {

    @Test
    public void isStringValid() {
        StringValidator sv = new StringValidator("This is a string");
        assertEquals(true, sv.isValid());
    }

    @Test
    public void isStringNotValid() {
        StringValidator sv = new StringValidator(null);
        assertNotEquals(true, sv.isValid());
    }
}