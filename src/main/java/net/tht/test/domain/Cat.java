package net.tht.test.domain;

import net.tht.test.builder.SingBuilder;
import net.tht.test.enums.AnimalSoundEnum;

public class Cat extends Mammal {
    public Cat() {
        super(new SingBuilder(AnimalSoundEnum.CAT));
    }

    public Cat(SingBuilder singBuilder) {
        super(singBuilder);
    }
}
