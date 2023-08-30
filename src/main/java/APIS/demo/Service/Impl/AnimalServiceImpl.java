package APIS.demo.Service.Impl;

import APIS.demo.Model.Animal;
import APIS.demo.Model.Request.RequestAnimal;
import APIS.demo.Repository.AnimalRepository;
import APIS.demo.Service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class AnimalServiceImpl implements AnimalService {
    @Autowired
    AnimalRepository animalRepository;
@Autowired
Animal animal;

    @Override
    public Animal saveAnimal(RequestAnimal requestAnimal){
        animal.setName(requestAnimal.getName());
        animal.setAge(requestAnimal.getAge());
        animal.setCategory(requestAnimal.getCategory());
        animal.setId(requestAnimal.getId());
        animal.setLocation(requestAnimal.getLocation());
        return animalRepository.save(animal);
    }
    @Override
    public Animal updateAnimal(RequestAnimal requestAnimal){
        Animal animal=animalRepository.findById(requestAnimal.getId()).orElse(null);
        animal.setId(requestAnimal.getId());
        animal.setName(requestAnimal.getName());
        animal.setCategory(requestAnimal.getCategory());
        animal.setAge(requestAnimal.getAge());
        animal.setLocation(requestAnimal.getLocation());
        return animalRepository.save(animal);
    }
@Override
    public List<Animal> listAnimals(){
        return animalRepository.findAll();
    }

@Override
    public Animal getAnimal( String value){
        Animal animal=animalRepository.findByNonPrimaryKeyColumn(value);
        return animal;
    }
@Override
    public String deleteAnimal(int id){
        animalRepository.deleteById(id);
        return "Deleted Successfully";
    }
@Override
    public String response(){
       return "Access Denied";
    }
}
