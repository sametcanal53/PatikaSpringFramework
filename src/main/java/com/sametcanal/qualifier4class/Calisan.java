package com.sametcanal.qualifier4class;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifier4classCdi")
@ApplicationScoped
public class Calisan {

    //Defaultta çalışacak kodlar
    //@Inject
    //private PatronInterface patronInterface;

    // istediğim seçeneği seçiyorum.
    @Inject
    @QualifierMultiple2(FazlaSecenekler.BIRINCI)
    private PatronInterface patronInterface;


    public Calisan(){
        // patronInterface = new Patron();
    }

    public String getData(String data){
        return patronInterface.surum(data);
    }
}
