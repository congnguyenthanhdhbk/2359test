package net.tht.test.domain;

import net.tht.test.builder.SingBuilder;
import net.tht.test.constant.AnimalConstant;
import net.tht.test.domain.behaviors.Flyable;
import net.tht.test.domain.behaviors.Speakable;
import net.tht.test.domain.behaviors.Walkable;

public class Insect extends Animal implements Flyable, Walkable, Speakable {
    private SingBuilder singBuilder;

    public Insect(SingBuilder singBuilder) {
        this.singBuilder = singBuilder;
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
