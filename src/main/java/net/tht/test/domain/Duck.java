package net.tht.test.domain;

import net.tht.test.builder.SingBuilder;
import net.tht.test.constant.AnimalConstant;
import net.tht.test.domain.behaviors.Flyable;
import net.tht.test.domain.behaviors.Swimmable;
import net.tht.test.enums.AnimalSoundEnum;

public class Duck extends Bird implements Swimmable, Flyable {
    public Duck() {
        super(new SingBuilder(AnimalSoundEnum.DUCK));
    }

    @Override
    public void canSwim() {
        System.out.println(AnimalConstant.I_AM_SWIMMING);
    }

    @Override
    public void canFly() {
        System.out.println(AnimalConstant.I_AM_FLYING);
    }

    @Override
    public void canWalk() {
        super.canWalk();
    }
}
