package com.neo4j.example.pizzamenuapp.util;

import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class CheckOrder {


    // ALL ACCEPTABLE TOPPINGS
    private static final String CHEESE = "CHEESE";
    private static final String MOZZARELLA = "MOZZARELLA";
    private static final String MUSHROOM = "MUSHROOM";
    private static final String PEPPERONI = "PEPPERONI";
    private static final String BACON = "BACON";
    private static final String HAM = "HAM";
    private static final String SAUSAGE = "SAUSAGE";
    private static final String TOMATOES = "TOMATOES";
    private static final String OLIVES = "OLIVES";
    private static final String ANCHOVIES = "ANCHOVIES";
    private static final String PINEAPPLE = "PINEAPPLE";
    private static final String BASIL = "BASIL";
    private static final String ONIONS = "ONIONS";
    private static final String CHICKEN = "CHICKEN";
    private static final String ARTICHOKES = "ARTICHOKES";
    private static final String BEEF = "BEEF";
    private static final String PROSCIUTTO = "PROSCIUTTO";

    private static final Set<String> acceptedToppings = new HashSet();

    static {
        acceptedToppings.add(CHEESE);
        acceptedToppings.add(MOZZARELLA);
        acceptedToppings.add(MUSHROOM);
        acceptedToppings.add(PEPPERONI);
        acceptedToppings.add(BACON);
        acceptedToppings.add(HAM);
        acceptedToppings.add(SAUSAGE);
        acceptedToppings.add(TOMATOES);
        acceptedToppings.add(OLIVES);
        acceptedToppings.add(ANCHOVIES);
        acceptedToppings.add(PINEAPPLE);
        acceptedToppings.add(BASIL);
        acceptedToppings.add(ONIONS);
        acceptedToppings.add(CHICKEN);
        acceptedToppings.add(ARTICHOKES);
        acceptedToppings.add(BEEF);
        acceptedToppings.add(PROSCIUTTO);
    }

    // ALL ACCEPTABLE CRUST OPTIONS
    private static final String THIN = "THIN";
    private static final String THICK = "THICK";

    private static final Set<String> acceptedCrust = new HashSet();

    static {
        acceptedCrust.add(THIN);
        acceptedCrust.add(THICK);
    }

    // ALL ACCEPTABLE PIZZA SIZES
    private static final String SMALL = "SMALL";
    private static final String MEDIUM = "MEDIUM";
    private static final String LARGE = "LARGE";

    private static final Set<String> acceptedSizes = new HashSet();

    static {
        acceptedSizes.add(SMALL);
        acceptedSizes.add(MEDIUM);
        acceptedSizes.add(LARGE);
    }

    public static boolean checkToppings(List<String> toppings) {
        if (toppings == null || toppings.isEmpty()) {
            return false;
        }
        for (String topping : toppings) {
            if (!acceptedToppings.contains(topping.toUpperCase())) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkCrust(String crust) {
        if (crust == null || crust.isEmpty()) {
            return false;
        }
        return acceptedCrust.contains(crust.toUpperCase());
    }

    public static boolean checkSize(String size) {
        if (size == null || size.isEmpty()) {
            return false;
        }
        return acceptedSizes.contains(size.toUpperCase());
    }
}

