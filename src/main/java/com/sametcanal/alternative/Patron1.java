package com.sametcanal.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Patron1 implements PatronInterface {

    // @Alternative: Aynı anda sadece 1 tane proje çalışıyor diğerleri kapalı
    @Override
    public String surum(String data) {
        return "Patron 1 "+data;
    }
}
