package com.manan.movies.reviews;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews") // if reviews collection/table does not exist then it will create one
@Data // Lombok annotation to generate getters and setters
@AllArgsConstructor // Lombok annotation to generate constructor with all the attributes
@NoArgsConstructor // Lombok annotation to generate constructor with no attributes
public class Review {
    @Id // Primary Key
    private ObjectId id;
    private String body;
    public Review(String body) {
        this.body = body;
    }
}
