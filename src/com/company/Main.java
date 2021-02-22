package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // create the instances for Source class
        Source s1 = new Source(SourceType.FACTORY, "Source1");
        s1.setCapacity(10);
        Source s2 = new Source(35, SourceType.WAREHOUSE, "Source2");
        Source s3 = new Source(25, SourceType.WAREHOUSE, "Source3");
        ArrayList<Source> sources = new ArrayList<Source>();
        sources.add(s1);
        sources.add(s2);
        sources.add(s3);

        // create the instances for Destination class
        Destination d1 = new Destination();
        d1.setDemand(20);
        d1.setName("Destination1");
        Destination d2 = new Destination(25, "Destination2");
        Destination d3 = new Destination(25);
        d3.setName("Destination3");
        ArrayList<Destination> dest = new ArrayList<Destination>();
        dest.add(d1);
        dest.add(d2);
        dest.add(d3);

        Problem app = new Problem();

        app.fillMatrix();  // fill de matrix of cost

        System.out.println(app.toString());  // print the matrix of cost

        for (Source s : sources) {
            System.out.print(s.getCapacity() + " ");
        }
        System.out.println();
        for (Destination d : dest) {
            System.out.print(d.getDemand() + " ");
        }
        //app.printSupply(s1, s2, s3); //print the capacity/ supply  for every source

        //  app.printDemand(d1, d2, d3);   // print the demand for every destination

    }
}
