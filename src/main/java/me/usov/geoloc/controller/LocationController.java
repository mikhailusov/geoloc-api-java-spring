package me.usov.geoloc.controller;

import me.usov.geoloc.model.Location;
import me.usov.geoloc.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by mikhailusov on 12/8/15.
 */
@RestController
public class LocationController {

    @Autowired
    LocationRepository locationRepository;

    @RequestMapping("/locations")
    public List<Location> locations() {
        return locationRepository.findAll();
    }
}
