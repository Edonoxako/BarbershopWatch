package com.edonoxako.pets.barbershopwatch.model;

/**
 * Created by Eugeny.Martinenko on 17.06.2016.
 */
public class BarberService {

    private long id;
    private String name;
    private String description;
    private int price;

    public BarberService(long id, String name, int price) {
        this.price = price;
        this.name = name;
        this.description = "";
        this.id = id;
    }

    public BarberService(long id, String name, String description, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }
}
