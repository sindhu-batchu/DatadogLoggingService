package com.example.datadog.logging.models;

import java.io.Serializable;

public class Browser implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1093092197613317094L;

    private String name;
    private String version;

    public Browser() {

    }

    public Browser(String name, String version) {
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
        return "Browser [name=" + name + ", version=" + version + "]";
    }

}
