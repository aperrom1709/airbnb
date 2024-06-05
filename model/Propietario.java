package com.programacion.Tema7.Airbnbbien.model;

public class Propietario {
    private String host_id;
    private String host_name;

    public Propietario(String host_id, String host_name) {
        setHost_id(host_id);
        setHost_name(host_name);
    }

    public String getHost_id() {
        return host_id;
    }

    public void setHost_id(String host_id) {
        this.host_id = host_id;
    }

    public String getHost_name() {
        return host_name;
    }

    public void setHost_name(String host_name) {
        this.host_name = host_name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Propietario) {
            Propietario p = (Propietario) obj;
            return p.getHost_id().equalsIgnoreCase(this.getHost_id());
        }
        return false;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "host_id='" + host_id + '\'' +
                ", host_name='" + host_name + '\'' +
                '}';
    }
}
