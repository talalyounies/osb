package com.osb;

import com.osb.model.AddBehavioral;
import com.osb.model.Behavior;
import com.osb.model.Mapper;
import com.osb.model.SuperHero;
import com.osb.stackImp.Stack;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        while (!stack.isEmpty()) {
            long value = stack.pop();
            System.out.print(value);
            System.out.print(" ");
        }

        System.out.println("");

        //#################  Super Hero Demo ###############################
        Mapper mapper = new Mapper("Batman", Behavior.CRAWL, Behavior.FLY, Behavior.JUMP);
        Mapper mapper1 = new Mapper("SuperMan", Behavior.CRAWL, Behavior.GENERATEFIRE, Behavior.JUMP);

        mapper.mapSuperHeroToBehaviors();
        mapper1.mapSuperHeroToBehaviors();

        for (Map.Entry<SuperHero, AddBehavioral> entry : mapper.getMap().entrySet()) {
            System.out.print(entry.getKey().getName());
            System.out.print(entry.getValue().getBehaviors());
        }

        System.out.println("");

        for (Map.Entry<SuperHero, AddBehavioral> entry : mapper1.getMap().entrySet()) {
            System.out.print(entry.getKey().getName());
            System.out.print(entry.getValue().getBehaviors());
        }
    }
}
