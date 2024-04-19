package com.neo4j.example.pizzamenuapp.domainClasses;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import java.util.ArrayList;
import java.util.List;

@Node
public class Pizza {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private List<String> toppings = new ArrayList<>();

    private String crust;

    private String size;

    public Pizza(String name, List<String> toppings, String crust, String size) {
        this.name = name;
        this.toppings = toppings;
        this.crust = crust;
        this.size = size;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getToppings() { return toppings; }

    public void setToppings(List<String> toppings) { this.toppings = toppings; }

    public String getCrust() { return crust; }

    public void setCrust(String crust) { this.crust = crust; }

    public String getSize() { return size; }

    public void setSize(String size) { this.size = size; }
}
