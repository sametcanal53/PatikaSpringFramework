package com.sametcanal.qualifier4class;

@QualifierMultiple2(FazlaSecenekler.IKINCI)
public class Patron3 implements PatronInterface {
    @Override
    public String surum(String data) {
        return "QualifierMultiple ENUM IKINCI :"+data;
    }
}
