package com.example.datadog.logging.models;

import java.io.Serializable;

public class LoggerRequest implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1582942873180946389L;

    private String logger;
    private String platform;
    private String level;
    private String exception;
    private Sdk sdk;
    private Tags tags;
    private Browser browser;

    public LoggerRequest() {
    }

    public LoggerRequest(String logger, String platform, String level, String exception, Sdk sdk, Tags tags,
                         Browser browser) {
        super();
        this.logger = logger;
        this.platform = platform;
        this.level = level;
        this.exception = exception;
        this.sdk = sdk;
        this.tags = tags;
        this.browser = browser;
    }

    public String getLogger() {
        return logger;
    }

    public void setLogger(String logger) {
        this.logger = logger;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public Sdk getSdk() {
        return sdk;
    }

    public void setSdk(Sdk sdk) {
        this.sdk = sdk;
    }

    public Tags getTags() {
        return tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    public Browser getBrowser() {
        return browser;
    }

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    @Override
    public String toString() {
        return "LoggerRequest [logger=" + logger + ", platform=" + platform + ", level=" + level + ", exception="
                + exception + ", sdk=" + sdk + ", tags=" + tags + ", browser=" + browser + "]";
    }

}
