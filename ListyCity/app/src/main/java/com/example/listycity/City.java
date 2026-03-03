package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City> {

    /**
     * The name of the city
     */
    private String city;

    /**
     * The province the city belongs to
     */
    private String province;

    /**
     * Constructs a City object with a given city name and province.
     *
     * @param city     the name of the city
     * @param province the name of the province
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the name of the city.
     *
     * @return city name
     */
    String getCityName() {
        return this.city;
    }

    /**
     * Returns the name of the province.
     *
     * @return province name
     */
    String getProvinceName() {
        return this.province;
    }

    /**
     * Compares this city with another city by name.
     *
     * @param other the other {@link City} to compare with
     * @return a negative integer, zero, or a positive integer as this city
     * is less than, equal to, or greater than the other city
     */
    @Override
    public int compareTo(City other) {
        return this.city.compareTo(other.getCityName());
    }

    /**
     * Checks if this city is equal to another object.
     * Two cities are equal if both their city and province names match.
     *
     * @param o the object to compare with
     * @return {@code true} if equal, {@code false} otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;

        City city1 = (City) o;

        return city.equals(city1.city) &&
                province.equals(city1.province);
    }
}