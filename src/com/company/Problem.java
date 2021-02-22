package com.company;

public class Problem {

    static int[][] cost = new int[4][4];

    public void fillMatrix() {
        Problem app = new Problem();
        app.setValue(1, 1, 2);
        app.setValue(1, 2, 3);
        app.setValue(1, 3, 1);
        app.setValue(2, 1, 5);
        app.setValue(2, 2, 4);
        app.setValue(2, 3, 8);
        app.setValue(3, 1, 5);
        app.setValue(3, 2, 6);
        app.setValue(3, 3, 8);


    }

    public void printSupply(Source s1, Source s2, Source s3) {
        System.out.println("Source's supply: ");
        System.out.println("S1 " + s1.getCapacity());
        System.out.println("S2 " + s2.getCapacity());
        System.out.println("S3 " + s3.getCapacity());


    }

    public void printDemand(Destination d1, Destination d2, Destination d3) {
        //print the demand for every Destination
        System.out.println("Destination's demand: ");
        System.out.println("D1 " + d1.getDemand());
        System.out.println("D2 " + d2.getDemand());
        System.out.println("D3 " + d3.getDemand());

    }

    public void setValue(int i, int j, int value) {
        cost[i][j] = value;

    }

    public int getValue(int i, int j) {
        return cost[i][j];
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < cost.length; i++) {
            for (int j = 1; j < cost[i].length; j++) {

                sb.append(cost[i][j]);
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
