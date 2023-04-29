package com.manan.movies.reviews;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository // Data Access Layer
public interface ReviewRepository extends MongoRepository<Review, ObjectId> { // <Type of Data, Type of Primary Key>

}
