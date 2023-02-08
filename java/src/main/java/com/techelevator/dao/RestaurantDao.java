package com.techelevator.dao;

import com.techelevator.model.Restaurant;

import java.util.List;

public interface RestaurantDao {

    List<Restaurant> findAllRestaurants ();

    Restaurant findByRestaurantName (String restaurantName) throws Exception;

    String findByAddress (String address);

    List<Restaurant> findByZipCode (int zipCode);

    List <Restaurant> findByCity (String city);

    boolean save (Restaurant restaurantToSave);
}
