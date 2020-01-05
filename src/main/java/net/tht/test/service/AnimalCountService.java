package net.tht.test.service;

import net.tht.test.domain.Animal;
import net.tht.test.domain.behaviors.Flyable;
import net.tht.test.domain.behaviors.Speakable;
import net.tht.test.domain.behaviors.Swimmable;
import net.tht.test.domain.behaviors.Walkable;

public class AnimalCountService {
    Animal[] animals;
    int flyingAnimal = 0;
    int walkingAnimal = 0;
    int spearkingAnimal = 0;
    int swimmingAnimal = 0;

    public AnimalCountService(Animal[] animals) {
        this.animals = animals;
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                flyingAnimal += 1;
            }

            if (animal instanceof Walkable) {
                walkingAnimal += 1;
            }

            if (animal instanceof Speakable) {
                spearkingAnimal += 1;
            }

            if (animal instanceof Swimmable) {
                swimmingAnimal += 1;
            }
        }
    }

    public int getFlyingAnimal() {
        return flyingAnimal;
    }

    public void setFlyingAnimal(int flyingAnimal) {
        this.flyingAnimal = flyingAnimal;
    }

    public int getWalkingAnimal() {
        return walkingAnimal;
    }

    public void setWalkingAnimal(int walkingAnimal) {
        this.walkingAnimal = walkingAnimal;
    }

    public int getSpearkingAnimal() {
        return spearkingAnimal;
    }

    public void setSpearkingAnimal(int spearkingAnimal) {
        this.spearkingAnimal = spearkingAnimal;
    }

    public int getSwimmingAnimal() {
        return swimmingAnimal;
    }

    public void setSwimmingAnimal(int swimmingAnimal) {
        this.swimmingAnimal = swimmingAnimal;
    }
}
