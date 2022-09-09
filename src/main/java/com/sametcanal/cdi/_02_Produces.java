package com.sametcanal.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named(value = "producestuto")
@ApplicationScoped
public class _02_Produces {

    @Produces
    public List<String> getList(){
        List<String> list = new ArrayList<>();
        list.add("HTML 5");
        list.add("CSS 3");
        list.add("Javascript");
        list.add("React");
        list.add("Angular");

        return list;
    }
}
