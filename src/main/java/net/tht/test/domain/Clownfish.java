package net.tht.test.domain;

import net.tht.test.constant.AnimalConstant;

public class Clownfish extends Fish {
    @Override
    public String bodySize() {
        return "small";
    }

    @Override
    public String bodyColor() {
        return "orange";
    }

    public void makeJoke() {
        System.out.println(AnimalConstant.I_MAKE_JOKES);
    }
}
