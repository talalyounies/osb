package com.osb.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddBehavioral {
    private List<Behavior> behaviors = new ArrayList<>();

    public AddBehavioral(Behavior... behaviors){
        this.behaviors = Arrays.asList(behaviors);
    }

    public List<Behavior> getBehaviors() {
        if (behaviors != null) {
            return this.behaviors;
        }
        return new ArrayList<>();
    }
}
