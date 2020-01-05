package net.tht.test.domain;

import net.tht.test.constant.AnimalConstant;

public class Shark extends Fish {
    @Override
    public String bodySize() {
        return "large";
    }

    @Override
    public String bodyColor() {
        return "grey";
    }

    public void canEat() {
        System.out.println(AnimalConstant.I_EAT_FISH);
    }
}
