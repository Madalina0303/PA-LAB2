package com.company;

public class Problem {

    private int[][] cost; // matricea de costuri
    private int nrSource; // number of sources and number of lines from cost matrix
    private int nrDestination; // number of destination and nr of columns from cost matrix
    private Source[] source; // array of source
    private Destination[] destination; // array of destination
    private int nrCurrentSource; // how many sources are at a time in array
    private int nrCurrentDestination; // how many destinations are at a time in array

    // constructors
    public Problem() {
        this(0, 0);
    }

    public Problem(int nrSource, int nrDestination) {
        this.nrSource = nrSource;
        this.nrDestination = nrDestination;
        cost = new int[nrSource][nrSource];
        source = new Source[nrSource];
        destination = new Destination[nrDestination];

    }

    // method used to modify/fill the cost matrix
    public void setCost(int[][] cost1, int nrSorce1, int nrDestination1) {
        if (checkConstraint() == 1) {
            nrSource = nrSorce1;
            nrDestination = nrDestination1;
            for (int i = 0; i < cost1.length; i++)
                System.arraycopy(cost1[i], 0, cost[i], 0, cost1[i].length);
        }
    }


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

    // method used to add a source to the array of the source
    public void addSource(Source s) {
        if (nrCurrentSource <= nrSource) {
            source[nrCurrentSource] = s;
            nrCurrentSource++;
        }
    }

    public Source[] getSource() {
        return source;
    }

    //remove a source from array
    public void removeSource(Source s) {
        int index = -1;
        for (int i = 0; i < source.length; i++) {
            if (s.getName().equals(source[i].getName()))
                index = i;
        }
        if (index != -1) {
            if (source.length - (index + 1) >= 0)
                System.arraycopy(source, index + 1, source, index, source.length - (index + 1));
            nrCurrentSource--;
        }
    }

    // add destination to array
    public void addDestination(Destination d) {
        if (nrCurrentDestination < nrDestination) {
            destination[nrCurrentDestination] = d;
            nrCurrentDestination++;
        }
    }

    // remove destination from array
    public void removeDestination(Destination d) {
        int index = -1;
        for (int i = 0; i < destination.length; i++) {
            if (d.getName().equals(destination[i].getName()))
                index = i;
        }
        if (index != -1) {
            if (destination.length - (index + 1) >= 0)
                System.arraycopy(destination, index + 1, destination, index, destination.length - (index + 1));
            nrCurrentDestination--;
        }

    }

    public Destination[] getDestination() {
        return destination;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nrSource; i++) {
            for (int j = 0; j < cost[i].length; j++) {

                sb.append(cost[i][j]);
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    // verify if the sum of supplies/capacities is greater than sum of demands
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
