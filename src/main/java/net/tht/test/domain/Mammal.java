package net.tht.test.domain;

import net.tht.test.builder.SingBuilder;
import net.tht.test.constant.AnimalConstant;
import net.tht.test.domain.behaviors.Speakable;
import net.tht.test.domain.behaviors.Walkable;
import net.tht.test.enums.AnimalSoundEnum;

public class Mammal extends Animal implements Walkable, Speakable {
    private SingBuilder singBuilder;

    public Mammal() {
        this.singBuilder = new SingBuilder(AnimalSoundEnum.DEFAULT);
    }

    public Mammal(SingBuilder singBuilder) {
        this.singBuilder = singBuilder;
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
