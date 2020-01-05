package net.tht.test.builder;

import net.tht.test.enums.AnimalSoundEnum;

@FunctionalInterface
public interface ISound {
    void makeSound(AnimalSoundEnum soundEnum);
}
