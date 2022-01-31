package com.example.datadog.logging.models;

import java.io.Serializable;

public class Tags implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 579359312755046660L;

    private String client;
    private String component;
    private String components_release;


    public Tags() {
        // TODO Auto-generated constructor stub
    }


    public Tags(String client, String component, String components_release) {
        super();
        this.client = client;
        this.component = component;
        this.components_release = components_release;
    }


    public String getClient() {
        return client;
    }


    public void setClient(String client) {
        this.client = client;
    }


    public String getComponent() {
        return component;
    }


    public void setComponent(String component) {
        this.component = component;
    }


    public String getComponents_release() {
        return components_release;
    }


    public void setComponents_release(String components_release) {
        this.components_release = components_release;
    }


    @Override
    public String toString() {
        return "Tags [client=" + client + ", component=" + component + ", components_release=" + components_release
                + "]";
    }

}
