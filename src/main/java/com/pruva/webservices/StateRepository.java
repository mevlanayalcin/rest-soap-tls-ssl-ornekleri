package com.pruva.webservices;

import org.springframework.stereotype.Component;
import com.pruva.spring.soapws.State;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class StateRepository {
    private static final Map<String,State> states = new HashMap<>();

    @PostConstruct
    public void initData() {
        State ap = new State();
        ap.setId("TR");
        ap.setCapital("Ankara");
        ap.setName("Turkey");
        ap.setLanguage("Turkish");
        ap.setPopulation(80000000);
        states.put(ap.getId(),ap);

        State tl = new State();
        tl.setId("EN");
        tl.setCapital("London");
        tl.setName("England");
        tl.setLanguage("English");
        tl.setPopulation(53000000);
        states.put(tl.getId(),tl);

       
    }

    public State findState(String id) {
        Assert.notNull(id, "State id must not be null");
        return states.get(id);
    }
}
