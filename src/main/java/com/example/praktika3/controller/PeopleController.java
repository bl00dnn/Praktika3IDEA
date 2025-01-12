package com.example.praktika3.controller;

import com.example.praktika3.entity.PeopleEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class PeopleController {
    @GetMapping("/v1/getPeople")
    public PeopleEntity getPeople(){
        PeopleEntity people = new PeopleEntity();
        people.setName("Кирилл");
        people.setId(25);
        people.setAge(19);
        people.setGander("male");
        people.setPhone("2532-235-24");
        return people;
    }

    @PostMapping("/v1/newPeople")
    public String newPeople(@RequestBody PeopleEntity people){
        System.out.println(people.getAge());
      return "Успешно Добавлен";
    }
}
