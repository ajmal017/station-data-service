package com.robinhoodanalytics.backtestservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BBandOptions {

    private double[] real;
    private int period;
    private double stddev;

    public BBandOptions() {
    }

    public BBandOptions(double[] real, int period, double stddev) {
        this.real = real;
        this.period = period;
        this.stddev = stddev;
    }

    public double[] getReal() {
        return this.real;
    }

    public int getPeriod() {
        return this.period;
    }

    public double getStddev() {
        return stddev;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public void setReals(double[] real) {
        this.real = real;
    }

    public void setStddev(double stddev) {
        this.stddev = stddev;
    }
}