package com.neosoft.microservices.limitsservice.beans;

public class Limitsconfiguration {
    private int minimum;
    private int maximum;

    protected Limitsconfiguration() {
    }

    public Limitsconfiguration(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
