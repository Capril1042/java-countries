package com.cjs.countries;

public class Country
{
    private String name;
    private int population;
    private int landMassSize;
    private int medianAge;

    public Country(String name, int population, int landMassSize, int medianAge)
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

    public int getPopulation()
    {
        return population;
    }

    public int getLandMassSize()
    {
        return landMassSize;
    }

    public int getMedianAge()
    {
        return medianAge;
    }
}
