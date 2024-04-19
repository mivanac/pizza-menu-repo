package com.neo4j.example.pizzamenuapp.controllers;

import com.neo4j.example.pizzamenuapp.util.CheckOrder;
import com.neo4j.example.pizzamenuapp.domainClasses.Pizza;
import com.neo4j.example.pizzamenuapp.repositories.PizzaRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class PizzaController {
    private final PizzaRepository pizzaRepository;

    public PizzaController(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    @GetMapping("/menu")
    public Iterable<Pizza> findAll() {
        return pizzaRepository.findAll();
    }

    @GetMapping("/menu/{id}")
    public Pizza getPizzaById(@PathVariable Long id) {
        return pizzaRepository.getPizzaById(id);
    }

    @PostMapping("/order")
    public String orderPizza(@RequestBody Pizza pizza) {
        if (pizza == null) {
            return "Order failed, no pizza defined.";
        }
        if (!CheckOrder.checkToppings(pizza.getToppings())) {
            return "Order failed, invalid topping ordered.";
        }
        if (!CheckOrder.checkCrust(pizza.getCrust())) {
            return "Order failed, invalid crust defined.";
        }
        if (!CheckOrder.checkSize(pizza.getSize())) {
            return "Order failed, invalid size defined.";
        }

        pizzaRepository.save(pizza);
        return "Order accepted";
    }
}
