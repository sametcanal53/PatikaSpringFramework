package com.sametcanal.aop.decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
abstract public class EvDecorator implements Ev {
    private @Inject @Delegate Ev ev;

    @Override
    public String boyama(String data) {
        System.out.println("Decorator Buradaydı");
        String dataInformation = ev.boyama(data);
        if (dataInformation.equals("kodluyoruz")) {
            dataInformation=dataInformation.toUpperCase();
        }

        return dataInformation;
    }
}
