package com.manan.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository // Spring annotation to indicate that this is a repository => way to interact with the database
public interface MovieRepository extends MongoRepository<Movie, ObjectId> { // <Type of Data, Type of Primary Key>
    Optional<Movie> findByImdbId(String imdbId);
    // Spring Data JPA will automatically generate the implementation of this method based on the name of the method
}
