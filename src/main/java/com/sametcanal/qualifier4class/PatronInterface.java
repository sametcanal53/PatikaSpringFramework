package com.sametcanal.qualifier4class;

public interface PatronInterface {
    // @Alternative: Aynı anda sadece 1 tane proje çalışıyor diğerleri kapalı
    // @Qualifier: Aynı anda birden fazla proje aktif ancak default olarak çalışacak projeyi seçebilirsiniz
    public String surum(String data);
}
