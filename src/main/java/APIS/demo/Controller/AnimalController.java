package APIS.demo.Controller;

import APIS.demo.Model.Animal;
import APIS.demo.Model.Request.RequestAnimal;
import APIS.demo.Repository.AnimalRepository;
import APIS.demo.Service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class AnimalController {
    @Autowired
    AnimalRepository animalRepository;
    @Autowired
    AnimalService animalService;

    @PostMapping("/saveAnimal")
    public Animal saveAnimal(@RequestBody RequestAnimal requestAnimal){
        return animalService.saveAnimal(requestAnimal);
    }

    @PutMapping ("/updateAnimal")
    public Animal updateAnimal(@RequestBody RequestAnimal requestAnimal){
        return animalService.updateAnimal(requestAnimal);
    }

    @DeleteMapping("/deleteAnimal/{id}")
    public String deleteAnimal(@PathVariable int id){
        return animalService.deleteAnimal(id);
    }

    @GetMapping("/listAnimals")
    public List<Animal> listAnimals(){
        return animalService.listAnimals();
    }

    @GetMapping("/access")
    @ResponseBody
    public String response(){
        return animalService.response();
    }

 @GetMapping("/getAnimal")
      public Animal getAnimal( @RequestParam("name") String value){
     return animalService.getAnimal(value);
  }
}
