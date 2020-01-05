package net.tht.test.api;


import net.tht.test.domain.Animal;
import net.tht.test.service.AnimalCountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AnimalApi {
    @GetMapping(value = "/animal/flying/count")
    public int getFlyingAnimalCount(@RequestBody Animal ...animals) {
        AnimalCountService animalCountService = new AnimalCountService(animals);
        int flyingAnimal = animalCountService.getFlyingAnimal();
        return flyingAnimal;
    }
}
