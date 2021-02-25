package com.company;

public class Destination {
    private int demand;
    private String name;

    public Destination() {
        this(0, "");

    }

    /**
     * @param demand it is used to initialise the demand member
     */
    public Destination(int demand) {
        this.demand = demand;
    }

    /**
     * @param name it is used to intialise the name member
     */
    public Destination(String name) {
        this.name = name;
    }

    /**
     * @param demand it is used to intialise the demand  member
     * @param name   it is used to intialise the name member
     */
    public Destination(int demand, String name) {
        this.name = name;
        this.demand = demand;
    }

    /**
     * @param name it is used to modify the name member
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the name member
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param demand it is used to modify the demand member
     */
    public void setDemand(int demand) {
        if(demand>0)
        this.demand = demand;
    }

    /**
     * @return the demand member
     */
    public int getDemand() {
        return this.demand;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "demand=" + demand +
                ", name='" + name + '\'' +
                '}';
    }
}
