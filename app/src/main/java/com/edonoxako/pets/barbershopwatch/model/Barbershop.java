package com.edonoxako.pets.barbershopwatch.model;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Eugeny.Martinenko on 17.06.2016.
 */
public class Barbershop {

    private long id;
    private String name;
    private String address;
    private String description;
    private Drawable logo;
    private List<BarberService> services;

    public Barbershop(long id, String name, String address, String description, Drawable logo, List<BarberService> services) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.description = description;
        this.logo = logo;
        this.services = services;
    }

    public Barbershop(long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;

        //Init other fields with default values
        this.description = "";
        this.logo = null; // TODO: 17.06.2016 init with dummy thumbnail if there is no logo
        this.services = Collections.emptyList();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Drawable getLogo() {
        return logo;
    }

    public void setLogo(Drawable logo) {
        this.logo = logo;
    }

    public List<BarberService> getServices() {
        return services;
    }

    public void setServices(List<BarberService> services) {
        this.services = services;
    }
}
