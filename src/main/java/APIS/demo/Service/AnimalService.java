package APIS.demo.Service;

import APIS.demo.Model.Animal;
import APIS.demo.Model.Request.RequestAnimal;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

public interface AnimalService {
    public Animal saveAnimal(RequestAnimal requestAnimal);

    public Animal updateAnimal(RequestAnimal requestAnimal);

    public List<Animal> listAnimals();

    public String deleteAnimal(int id);

    public String response();

    public Animal getAnimal( String value);
}
