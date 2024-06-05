package com.programacion.Tema7.Airbnbbien.services;

import com.programacion.Tema7.Airbnbbien.model.Propietario;

public class Alojamiento implements Comparable<Alojamiento>{

    private String id;
    private String name;
    private Propietario propietario;
    private double precio;

    public Alojamiento(String id, String name, Propietario p, double precio) {
        setId(id);
        setName(name);
        setPropietario(p);
        setPrecio(precio);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio >= 0) {
            this.precio = precio;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Alojamiento) {
            Alojamiento a = (Alojamiento) obj;
            return a.getId().equalsIgnoreCase(this.getId());
        }
        return false;
    }

    @Override
    public String toString() {
        return  "Alojamiento: "+id+"\n" +
                "precio: "+precio+"€\t- nombre: "+name+"\n" +
                "propietario: "+propietario;
    }

    @Override
    public int compareTo(Alojamiento o) {
        if(this.getPrecio() > o.getPrecio()) {
            return 1;
        } else if (this.getPrecio() < o.getPrecio()){
            return -1;
        } else {
            return 0;
        }
    }
}
