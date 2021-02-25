package com.company;

import sun.security.krb5.internal.crypto.Des;

import java.util.ArrayList;

public class Problem {

    private int[][] cost;
    private int nrSource; // numar de linii+nr de surse
    private int nrDestination; // numar de coloane + nr de destinatii
    private ArrayList<Source> source;
    private ArrayList<Destination> destination;

    public Problem() {
        this(0, 0);
    }

    public Problem(int nrSource, int nrDestination) {
        this.nrSource = nrSource;
        this.nrDestination = nrDestination;
        cost = new int[nrSource][nrSource];
        source = new ArrayList<>(nrSource);
        destination = new ArrayList<>(nrDestination);

    }

    /*public void setCostValue(int i, int j, int value) {
        cost[i][j] = value;

    }*/
    public void setCost(int[][] cost1, int nrSorce1, int nrDestination1) {
        if (checkConstraint() == 1) {
            nrSource = nrSorce1;
            nrDestination = nrDestination1;
            for (int i = 0; i < cost1.length; i++)
                System.arraycopy(cost1[i], 0, cost[i], 0, cost1[i].length);
        }
    }
    /* public int getCostValue(int i, int j) {
         return cost[i][j];
     }*/
    public int[][] getCost() {
        return cost;
    }

    public int getNrDestination() {
        return nrDestination;
    }

    public int getNrSource() {
        return nrSource;
    }

    public void setNrSource(int nrSource) {
        this.nrSource = nrSource;
    }

    public void setNrDestination(int nrDestination) {
        this.nrDestination = nrDestination;
    }

    public void addSource(Source s) {
        source.add(s);
    }

    public ArrayList<Source> getSource() {
        return source;
    }

    public void removeSource(Source s) {

        source.remove(s);
    }

    public void addDestination(Destination d) {
        destination.add(d);
    }

    public void removeDestination(Destination d) {
        destination.remove(d);
    }

    public ArrayList<Destination> getDestination() {
        return destination;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < cost.length; i++) {
            for (int j = 0; j < cost[i].length; j++) {

                sb.append(cost[i][j]);
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public int checkConstraint() {
        int s1 = 0, s2 = 0;
        for (Source s : source)
            s1 = s1 + s.getCapacity();
        for (Destination d : destination)
            s2 = s2 + d.getDemand();
        if (s1 >= s2)
            return 1;
        return 0;
    }
}
