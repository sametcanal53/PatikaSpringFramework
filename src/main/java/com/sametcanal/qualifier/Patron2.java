package com.sametcanal.qualifier;

@QualifierMultiple
public class Patron2 implements PatronInterface {
    @Override
    public String surum(String data) {
        return "QualifierMultiple 1 :"+data;
    }
}
