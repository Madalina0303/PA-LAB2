package com.company;

public class Source {

    private int capacity; // supply
    private String name;
    private SourceType sourceType;

    // constructors
    public Source() {
        this(0);
    }


    public Source(int capacity) {
        this.capacity = capacity;
    }


    public Source(int capacity, SourceType sourceType, String name) {
        this.capacity = capacity;
        this.sourceType = sourceType;
        this.name = name;
    }


    public Source(SourceType sourceType, String name) {
        this.sourceType = sourceType;
        this.name = name;
    }

   // getters and setters for  variables of class
    public int getCapacity() {
        return capacity;
    }


    public void setCapacity(int capacity) {
        if (capacity > 0)
            this.capacity = capacity;
    }


    public SourceType getSourceType() {
        return sourceType;
    }


    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Source: name=");
        sb.append(name);
        sb.append(", sourceType=");
        sb.append(sourceType);
        sb.append(", capacity=");
        sb.append(capacity);
        return sb.toString();

       /* return "Source{" +
                "capacity=" + capacity +
                ", name='" + name + '\'' +
                ", sourceType=" + sourceType +
                '}';

        */
    }
}
