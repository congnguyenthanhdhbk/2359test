package net.tht.test.domain;

import net.tht.test.builder.SingBuilder;
import net.tht.test.constant.AnimalConstant;
import net.tht.test.domain.behaviors.Flyable;
import net.tht.test.domain.behaviors.NotFlyable;
import net.tht.test.domain.behaviors.NotSpeakable;
import net.tht.test.domain.behaviors.Speakable;
import net.tht.test.enums.AnimalSoundEnum;

public class Butterfly extends Insect {
    private Insect state = new CaterpillarState(new SingBuilder(AnimalSoundEnum.CATERPILLAR));

    public Butterfly() {
        super(new SingBuilder(AnimalSoundEnum.CATERPILLAR));
    }

    public void transform() {
        state = new ButterflyState(new SingBuilder(AnimalSoundEnum.NO_SOUND));
    }

    @Override
    public void callSound() {
        state.callSound();
    }

    @Override
    public void canWalk() {
        state.canWalk();
    }

    @Override
    public void canFly() {
        state.canFly();
    }

    private class ButterflyState extends Insect implements Flyable, NotSpeakable {
        public ButterflyState(SingBuilder singBuilder) {
            super(singBuilder);
        }

        @Override
        public void callSound() {
            super.callSound();
        }

        @Override
        public void canFly() {
            super.canFly();
        }
    }

    private class CaterpillarState extends Insect implements Speakable, NotFlyable {
        public CaterpillarState(SingBuilder singBuilder) {
            super(singBuilder);
        }
        @Override
        public void callSound() {
            super.callSound();
        }

        @Override
        public void canFly() {
            System.out.println(AnimalConstant.I_CANT_FLY);
        }
    }
}
