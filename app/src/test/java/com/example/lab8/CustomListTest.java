package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest() {
        list = MockCityList();
        int initialSize = list.getCount();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertEquals(list.getCount(), initialSize + 1);
    }

//    @Test
//    public void testHasCity() {
//        list = MockCityList();
//        City city = new City("Estevan", "SK");
//        list.addCity(city);
//        assertTrue(list.hasCity(city));
//        City nonExistentCity = new City("Toronto", "ON");
//        assertFalse(list.hasCity(nonExistentCity));
//    }

//    @Test
//    public void testDeleteCity() {
//        list = MockCityList();
//        City city = new City("Estevan", "SK");
//
//        list.addCity(city);
//        list.deleteCity(city);
//        assertFalse(list.hasCity(city));
//    }

}
