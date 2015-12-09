package me.usov.geoloc.controller;

import me.usov.geoloc.model.Location;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mikhailusov on 12/8/15.
 */
@RestController
public class LocationController {

    @RequestMapping("/location")
    public Location location() {
        return new Location();
    }
}
