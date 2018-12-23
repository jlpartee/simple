package com.jlpartee.examples.simple.beans;

public abstract class Validator implements IValidation {
    public Validator() {
    }
    public abstract boolean isValid();
}
