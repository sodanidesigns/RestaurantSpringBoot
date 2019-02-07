package com.tts.Restaurants.repository;

import org.springframework.data.repository.CrudRepository;

import com.tts.Restaurants.models.Restaurant;

public interface RestaurantRepostiory extends CrudRepository<Restaurant, Long> {

}
