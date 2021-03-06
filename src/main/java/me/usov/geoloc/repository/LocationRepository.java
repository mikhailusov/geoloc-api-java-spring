package me.usov.geoloc.repository;

import me.usov.geoloc.domain.Location;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by mikhailusov on 12/10/15.
 */
public interface LocationRepository extends MongoRepository<Location, String> {

    public List<Location> findByLocationName(String locationName);

    public List<Location> findByUid(String uid);
}
