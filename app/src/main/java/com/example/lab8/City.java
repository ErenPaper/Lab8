package com.example.lab8;

/*
This is a class that defines a City.
*/
public class City implements Comparable {
    private final String city;
    private final String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }
    String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return this.city.equals(city.getCityName()) && this.province.equals(city.getProvinceName());
    }

    @Override
    public int hashCode() {
        return city.hashCode() + province.hashCode();
    }
}
