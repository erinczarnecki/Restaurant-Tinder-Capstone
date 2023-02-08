package com.techelevator.controller;

import com.techelevator.dao.RequestDao;
import com.techelevator.dao.RestaurantDao;
import com.techelevator.dao.UserDao;
import com.techelevator.model.Restaurant;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping ("/tinder")

public class RestaurantController {

    private RestaurantDao restaurantDao;

    public RestaurantController(RestaurantDao restaurantDao) {
        this.restaurantDao = restaurantDao;
    }

    @GetMapping (path = "/restaurants")
    public List<Restaurant> list() {
        return restaurantDao.findAllRestaurants();
    }



    @PostMapping (path = "/restaurants")
    public Restaurant save (@Valid @RequestBody Restaurant restaurant) {
        restaurantDao.save(restaurant);
//        restaurantId++;
        return restaurant;
    }

    @GetMapping (path = "/restaurants/city")
    public List<Restaurant> byCity(@RequestParam(name = "city", defaultValue = "") String city) {
        return restaurantDao.findByCity(city);
    }

    @GetMapping (path = "/restaurants/zipcode")
    public List<Restaurant> byZipCode(@RequestParam(name = "zip_code", defaultValue = "") int zipCode) {
        return restaurantDao.findByZipCode(zipCode);
    }

}
