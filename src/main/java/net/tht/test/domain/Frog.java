package net.tht.test.domain;

import net.tht.test.builder.SingBuilder;
import net.tht.test.constant.AnimalConstant;
import net.tht.test.domain.behaviors.Speakable;
import net.tht.test.domain.behaviors.Swimmable;
import net.tht.test.domain.behaviors.Walkable;
import net.tht.test.enums.AnimalSoundEnum;

public class Frog extends Animal implements Swimmable, Walkable, Speakable {
    SingBuilder singBuilder;

    public Frog() {
        singBuilder = new SingBuilder(AnimalSoundEnum.DEFAULT);
    }

    public Frog(SingBuilder singBuilder) {
        this.singBuilder = singBuilder;
    }

    @Override
    public void callSound() {
        singBuilder.makeSound();
    }

    @Override
    public void canSwim() {
        System.out.println(AnimalConstant.I_AM_SWIMMING);
    }

    @Override
    public void canWalk() {
        System.out.println(AnimalConstant.I_AM_WALKING);
    }
}
