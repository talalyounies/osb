package com.osb.model;

import java.util.HashMap;
import java.util.Map;

public class Mapper {
    private SuperHero superHero;
    private AddBehavioral addBehavioral;
    private Map<SuperHero, AddBehavioral> map = new HashMap<>();

    public Mapper(String name, Behavior... behaviors) {
        superHero = new SuperHero(name);
        addBehavioral = new AddBehavioral(behaviors);
    }

    public void mapSuperHeroToBehaviors() {
         map.put(this.superHero, this.addBehavioral);
    }

    public Map<SuperHero, AddBehavioral> getMap() {
        return map;
    }
}
