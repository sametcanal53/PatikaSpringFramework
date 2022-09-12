package com.sametcanal.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Patron1 implements PatronInterface {

    // @Alternative:
    @Override
    public String surum(String data) {
        return "Patron 1 "+data;
    }
}
