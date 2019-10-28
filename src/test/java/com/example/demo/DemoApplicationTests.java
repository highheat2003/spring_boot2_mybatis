package com.example.demo;

import com.example.demo.model.City;
import com.example.demo.service.CityService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    CityService service;

    @Test
    public void getAllCity(){
        List<City> cities = service.getAllCity();
        log.info("cities : {}", cities);
        //System.out.println(cities);
    }

    @Test
    public void getCityById() {
        City city = service.getCityById(1L);
        log.info("city : {}", city);
    }

    @Test
    public void addCities() {
        service.addCity(new City("뉴욕", "미국", 1_000_000L));
        service.addCity(new City("런던", "영국", 2_000_000L));
        service.addCity(new City("파리", "프랑스", 3_000_000L));
    }

    @Test
    void contextLoads() {
    }

}
