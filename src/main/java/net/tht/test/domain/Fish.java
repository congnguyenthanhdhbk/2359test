package net.tht.test.domain;

import net.tht.test.constant.AnimalConstant;
import net.tht.test.domain.behaviors.BodyType;
import net.tht.test.domain.behaviors.Swimmable;

public class Fish extends Animal implements Swimmable, BodyType {
    @Override
    public String bodySize() {
        return null;
    }

    @Override
    public String bodyColor() {
        return null;
    }

    @Override
    public void canSwim() {
        System.out.println(AnimalConstant.I_AM_SWIMMING);
    }
}
