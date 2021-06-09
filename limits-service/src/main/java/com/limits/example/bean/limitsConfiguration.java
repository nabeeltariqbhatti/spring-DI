package com.limits.example.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class limitsConfiguration {
    private int maximum;
    private int minimum;

    public limitsConfiguration() {

    }

    public limitsConfiguration(int i, int j) {
        super();
        this.maximum = i;
        this.minimum = j;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

}
