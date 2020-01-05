package net.tht.test.domain;

import net.tht.test.builder.SingBuilder;
import net.tht.test.constant.AnimalConstant;
import net.tht.test.domain.behaviors.Flyable;
import net.tht.test.enums.AnimalSoundEnum;

public class Parrot extends Bird implements Flyable {
    public Parrot() {
        super(new SingBuilder(AnimalSoundEnum.DEFAULT));
    }

    public Parrot(SingBuilder singBuilder) {
        super(singBuilder);
    }

    @Override
    public void canFly() {
        System.out.println(AnimalConstant.I_AM_FLYING);
    }
}
