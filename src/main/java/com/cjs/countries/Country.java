package com.cjs.countries;

public class Country
{
    private String name;
    private long population;
    private long landMassSize;
    private int medianAge;

    public Country(String name, long population, long landMassSize, int medianAge)
    {
        this.name = name;
        this.population = population;
        this.landMassSize = landMassSize;
        this.medianAge = medianAge;
    }

    public String getName()
    {
        return name;
    }

    public long getPopulation()
    {
        return population;
    }

    public long getLandMassSize()
    {
        return landMassSize;
    }

    public int getMedianAge()
    {
        return medianAge;
    }
}
