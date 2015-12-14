package me.usov.geoloc.web;

import me.usov.geoloc.exception.UserNotFoundException;
import me.usov.geoloc.domain.Location;
import me.usov.geoloc.repository.LocationRepository;
import me.usov.geoloc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by mikhailusov on 12/8/15.
 */
@RestController
public class LocationController {

    @Autowired
    LocationRepository locationRepository;

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/locations")
    public List<Location> locations() {
        return locationRepository.findAll();
    }


    @RequestMapping(value = "/location", method = RequestMethod.POST)
    public Location addLocation(@RequestBody Location location) throws UserNotFoundException {
        if (null == userRepository.findOne(location.getUid())) {
            throw new UserNotFoundException("User not found");
        }
        location.setDateTime(new Date());
        return locationRepository.insert(location);
    }

    @RequestMapping("/user/{uid}/locations")
    public List<Location> getLocationsByUser(@PathVariable String uid) {
        return locationRepository.findByUid(uid);
    }
}
