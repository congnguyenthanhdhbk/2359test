package net.tht.test.domain;

import net.tht.test.builder.SingBuilder;
import net.tht.test.constant.AnimalConstant;
import net.tht.test.domain.behaviors.Flyable;
import net.tht.test.domain.behaviors.Speakable;
import net.tht.test.domain.behaviors.Walkable;
import net.tht.test.enums.AnimalSoundEnum;

public class Bird extends Animal implements Walkable, Speakable, Flyable {
    private SingBuilder singBuilder;

    public Bird(SingBuilder singBuilder) {
        this.singBuilder = singBuilder;
    }

    public Bird() {
        this.singBuilder = new SingBuilder(AnimalSoundEnum.DEFAULT);
    }

    @Override
    public void canFly() {
        System.out.println(AnimalConstant.I_AM_FLYING);
    }

    @Override
    public void callSound() {
        singBuilder.makeSound();
    }

    @Override
    public void canWalk() {
        System.out.println(AnimalConstant.I_AM_WALKING);

    }
}
