package net.tht.test.domain;

import net.tht.test.builder.LanguageBuilder;
import net.tht.test.builder.SingBuilder;
import net.tht.test.enums.AnimalSoundEnum;
import net.tht.test.enums.LanguageEnum;

public class Rooster extends Chicken {
    LanguageBuilder languageBuilder;
    SingBuilder singBuilder;
    LanguageEnum languageEnum;

    public Rooster() {
        this.singBuilder = new SingBuilder(AnimalSoundEnum.ROOSTER);
    }
    public Rooster(LanguageEnum languageEnum) {
        this.singBuilder = new SingBuilder(AnimalSoundEnum.ROOSTER);
        this.languageEnum = languageEnum;
    }
    @Override
    public void callSound() {
        String translate = LanguageBuilder.translate(AnimalSoundEnum.ROOSTER.getSound(), languageEnum);
        System.out.println(translate);
    }

    @Override
    public void canFly() {
        super.canFly();
    }
}
