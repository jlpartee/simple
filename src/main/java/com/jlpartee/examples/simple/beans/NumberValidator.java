package com.jlpartee.examples.simple.beans;

public class NumberValidator extends Validator {

    String _StringToBeValiadated;

    public NumberValidator(String aString) { _StringToBeValiadated = aString; }

    @Override
    public boolean isValid(){
        //Assume false until proven otherwise
        boolean results = false;

        if (_StringToBeValiadated != null) {

            //Check if string is not empty and consists of only numbers (If we want to exclude doubles)
            if (!_StringToBeValiadated.isEmpty() && _StringToBeValiadated.matches("^-?\\d+$")) {
                results = true;
            }
        }
        return results;
    }

    public boolean isInteger(){

        boolean isInteger = false;

        if(_StringToBeValiadated != null) {
            //Parse String to determine if the parsed integer is within the bounds to be a proper integer
            try{
                if((Integer.parseInt(_StringToBeValiadated) >= -2147483648) && (Integer.parseInt(_StringToBeValiadated) <= 2147483647)){
                    isInteger = true;
                }
            } catch (NumberFormatException e){
                //
            }

        }
        return isInteger;
    }

    public boolean isDouble(){

        boolean isDouble = false;

        if(_StringToBeValiadated != null) {
            try {
                Double parsedString = Double.parseDouble(_StringToBeValiadated);
                isDouble = true;
            } catch (NumberFormatException e) {
                //
            }
        }

        return isDouble;
    }
}
