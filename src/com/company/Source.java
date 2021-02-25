package com.company;

public class Source {

    private int capacity;
    private String name;
    SourceType sourceType;


    public Source() {
        this(0);
    }

    /**
     * Constructor wtih one parameter
     *
     * @param capacity is used to initialise the capacity member
     */
    public Source(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Constructor with three parameters
     *
     * @param capacity   is used to inialise the capacity member
     * @param sourceType is used to initialise the sourceType member
     * @param name       is used to initialise the name member
     */
    public Source(int capacity, SourceType sourceType, String name) {
        this.capacity = capacity;
        this.sourceType = sourceType;
        this.name = name;
    }

    /**
     * Constructor with two parameters
     *
     * @param sourceType is used to initialise the sourceType member
     * @param name       is used to initialise the name member
     */
    public Source(SourceType sourceType, String name) {
        this.sourceType = sourceType;
        this.name = name;
    }

    /**
     * Function for get the capacity member
     *
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity is used to modify the sourceType member
     */
    public void setCapacity(int capacity) {
        if(capacity>0)
        this.capacity = capacity;
    }

    /**
     * @return the sourceType
     */
    public SourceType getSourceType() {
        return sourceType;
    }

    /**
     * @param sourceType is used to modify the sourceType member
     */
    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * @return the name member
     */
    public String getName() {
        return name;
    }

    /**
     * @param name is used to modify the name member
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Source{" +
                "capacity=" + capacity +
                ", name='" + name + '\'' +
                ", sourceType=" + sourceType +
                '}';
    }
}
