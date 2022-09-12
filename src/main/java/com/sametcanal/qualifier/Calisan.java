package com.sametcanal.qualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifierCdi")
@ApplicationScoped
public class Calisan {

    //Defaultta çalışacak kodlar
    //@Inject
    //private PatronInterface patronInterface;

    @Inject
    @QualifierMultiple
    private PatronInterface patronInterface;


    public Calisan(){
        // patronInterface = new Patron();
    }

    public String getData(String data){
        return patronInterface.surum(data);
    }
}
