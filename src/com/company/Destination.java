package com.company;

public class Destination {
    private int demand;
    private String name;

    public Destination() {
        this(0, "");

    }


    public Destination(int demand) {
        this.demand = demand;
    }


    public Destination(String name) {
        this.name = name;
    }


    public Destination(int demand, String name) {
        this.name = name;
        this.demand = demand;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }


    public void setDemand(int demand) {
        if (demand > 0)
            this.demand = demand;
    }


    public int getDemand() {
        return this.demand;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Destination: name=");
        sb.append(name);
        sb.append(", demand=");
        sb.append(demand);
        return sb.toString();
        /*
        return "Destination{" +
                "demand=" + demand +
                ", name='" + name + '\'' +
                '}';

         */
    }
}
