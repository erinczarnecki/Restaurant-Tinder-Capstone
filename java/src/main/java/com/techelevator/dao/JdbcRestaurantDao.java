package com.techelevator.dao;


import com.techelevator.model.Restaurant;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class JdbcRestaurantDao implements RestaurantDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcRestaurantDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;}

    @Override
    public List<Restaurant> findAllRestaurants() {
        List<Restaurant> restaurants = new ArrayList<>();
        String sql = "SELECT * FROM restaurant_list" ;

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()) {
            Restaurant restaurant = mapRowToRestaurant(results);
            restaurants.add(restaurant);
        }
        return restaurants;
    }


    @Override
    public Restaurant findByRestaurantName (String restaurantName) throws Exception {
        String sql = "SELECT restaurant_name FROM restaurant_list WHERE restaurant_id ILIKE ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, restaurantName);
        if (results.next()) {
            return mapRowToRestaurant(results);
        }
        throw new Exception("Restaurant " + restaurantName + " was not found.");
    }

    @Override
    public String findByAddress(String address) {
        String sql = "SELECT address FROM restaurant_list WHERE restaurant_id ILIKE ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, address);

        return address;

    }

    @Override
    public List<Restaurant> findByZipCode (int zipCode) {
        List <Restaurant> byZipCode = new ArrayList<>();
        String sql = "SELECT zipcode FROM restaurant_list WHERE zip_code ILIKE ?";
        Integer id = jdbcTemplate.queryForRowSet(sql, Integer.class, zipCode).getRow();

        return byZipCode;
    }

    @Override
    public List<Restaurant> findByCity(String city) {
        List <Restaurant> byCity = new ArrayList<>();
        String sql = "SELECT city FROM restaurant_list WHERE city ILIKE ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, city);
        while(results.next()) {
            Restaurant restaurant = mapRowToRestaurant(results);
            byCity.add(restaurant);
        }
        return byCity;
    }

    @Override
    public boolean save(Restaurant restaurantToSave) {
        String sql = "INSERT INTO restaurant_list " +
                "(restaurant_id, restaurant_name, address, cuisine, zip_code, city, phone_number, delivery) VALUES (DEFAULT, ?, ?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql, restaurantToSave.getRestaurantName(), restaurantToSave.getAddress(), restaurantToSave.getCuisine(),
                restaurantToSave.getZipCode(), restaurantToSave.getCity(), restaurantToSave.getPhoneNumber(), restaurantToSave.getDelivery()) == 1;
    }


    private Restaurant mapRowToRestaurant(SqlRowSet rs) {
        Restaurant restaurant = new Restaurant();
        restaurant.setRestaurantId(rs.getLong("restaurant_id"));
        restaurant.setRestaurantName(rs.getString("restaurant_name"));
        restaurant.setAddress(rs.getString("address"));
        restaurant.setCuisine(rs.getString("cuisine"));
        restaurant.setZipCode(rs.getInt("zip_code"));
        restaurant.setCity(rs.getString("city"));
        restaurant.setPhoneNumber(rs.getString("phone_number"));
        restaurant.setDelivery(rs.getString("delivery"));
        return restaurant;
    }

}

