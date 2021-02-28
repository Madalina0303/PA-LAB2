package com.company;

public class Main {
    public static void main(String[] args) {

        // create the instances for Source class
        Source s1 = new Source(SourceType.FACTORY, "Source1");
        s1.setCapacity(10);
        Source s2 = new Source(35, SourceType.WAREHOUSE, "Source2");
        Source s3 = new Source(25, SourceType.WAREHOUSE, "Source3");
        System.out.println(s1.toString());
        // create the instances for Destination class
        Destination d1 = new Destination();
        d1.setDemand(20);
        d1.setName("Destination1");
        Destination d2 = new Destination(25, "Destination2");
        Destination d3 = new Destination(25, "Destination3");
        // add sources and destinations
        Problem app = new Problem(3, 3);
        app.addSource(s1);
        app.addSource(s2);
        app.addSource(s3);

        app.addDestination(d1);
        app.addDestination(d2);
        app.addDestination(d3);

        int[][] cost1 = {{2, 3, 1}, {5, 4, 8}, {5, 6, 8}};

        app.setCost(cost1, 3, 3);
        System.out.println(app.toString());  // print the matrix of cost

        for (Source s : app.getSource()) {
            System.out.print(s.getCapacity() + " ");
        }
        System.out.println();
        for (Destination d : app.getDestination()) {
            System.out.print(d.getDemand() + " ");
        }

    }
}
