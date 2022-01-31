package com.example.datadog.logging.models;

import java.io.Serializable;

public class Sdk implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 4375648784248728397L;

    private String name;
    private String version;

    public Sdk() {
    }

    public Sdk(String name, String version) {
        super();
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Sdk [name=" + name + ", version=" + version + "]";
    }

}
