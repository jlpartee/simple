package com.jlpartee.examples.simple.beans;

public class StringValidator extends Validator {
    String _StringToBeValiadated;

    StringValidator(String aString) {
        _StringToBeValiadated = aString;
    }

    @Override
    public boolean isValid() {
        // assume false until proven otherwise
        boolean results = false;

        if (_StringToBeValiadated != null) {
            if (!_StringToBeValiadated.isEmpty()) {
                results = true;
            }
        }
        return results;
    }
}
