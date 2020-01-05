package net.tht.test.domain;

import net.tht.test.constant.AnimalConstant;
import net.tht.test.domain.behaviors.Swimmable;

public class Dolphin extends Animal implements Swimmable {
    @Override
    public void canSwim() {
        System.out.println(AnimalConstant.I_AM_SWIMMING);
    }
}
