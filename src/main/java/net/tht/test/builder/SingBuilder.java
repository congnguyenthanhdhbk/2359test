package net.tht.test.builder;

import net.tht.test.enums.AnimalSoundEnum;

public class SingBuilder {
    private AnimalSoundEnum soundEnums;

    public SingBuilder(AnimalSoundEnum soundEnums) {
        this.soundEnums = soundEnums;
    }

    public void makeSound() {
        System.out.println(soundEnums.getSound());
    }

}
