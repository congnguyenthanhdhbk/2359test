package net.tht.test.enums;

public enum  AnimalSoundEnum {
    DUCK("Quack, quack"),
    CHICKEN("Cluck, cluck"),
    ROOSTER("Cock-a-doodle-doo"),
    DOG("Woof, woof"),
    CATERPILLAR("caterpillar"),
    CAT("Meow"),
    DEFAULT("I am singing"),
    NO_SOUND("");

    private String sound;

    AnimalSoundEnum(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
