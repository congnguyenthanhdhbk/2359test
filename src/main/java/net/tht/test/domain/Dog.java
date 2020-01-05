package net.tht.test.domain;

import net.tht.test.builder.SingBuilder;
import net.tht.test.enums.AnimalSoundEnum;

public class Dog extends Mammal {
    public Dog() {
        super(new SingBuilder(AnimalSoundEnum.DOG));
    }

    public Dog(SingBuilder singBuilder) {
        super(singBuilder);
    }
}
