package net.tht.test.domain;

import net.tht.test.builder.SingBuilder;
import net.tht.test.constant.AnimalConstant;
import net.tht.test.domain.behaviors.NotFlyable;
import net.tht.test.enums.AnimalSoundEnum;

public class Chicken extends Bird implements NotFlyable {
    public Chicken() {
        super(new SingBuilder(AnimalSoundEnum.CHICKEN));
    }

    public Chicken(SingBuilder singBuilder) {
        super(singBuilder);
    }

    @Override
    public void canWalk() {
        super.canWalk();
    }

    @Override
    public void canFly() {
        System.out.println(AnimalConstant.I_CANT_FLY);
    }
}
