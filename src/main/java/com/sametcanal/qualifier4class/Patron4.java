package com.sametcanal.qualifier4class;

@QualifierMultiple2(FazlaSecenekler.UCUNCU)
public class Patron4 implements PatronInterface {
    @Override
    public String surum(String data) {
        return "QualifierMultiple ENUM UCUNCU :"+data;
    }
}
