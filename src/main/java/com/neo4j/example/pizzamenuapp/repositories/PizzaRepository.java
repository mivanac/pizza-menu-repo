package com.neo4j.example.pizzamenuapp.repositories;

import com.neo4j.example.pizzamenuapp.domainClasses.Pizza;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PizzaRepository extends Neo4jRepository<Pizza, Long> {

    Pizza getPizzaById(Long id);

}
