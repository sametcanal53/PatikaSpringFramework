package com.sametcanal.qualifier4class;

@QualifierMultiple2(FazlaSecenekler.BIRINCI)
public class Patron2 implements PatronInterface {
    @Override
    public String surum(String data) {
        return "QualifierMultiple ENUM BIRINCI :"+data;
    }
}
