package com.manan.movies;

import com.manan.movies.reviews.Review;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies") // movies => name of the collection/table in the database
@Data // Lombok annotation to generate getters and setters
@AllArgsConstructor // Lombok annotation to generate constructor with all the attributes
@NoArgsConstructor // Lombok annotation to generate constructor with no attributes
public class Movie { // Contains all the Columns of the Movies Table as attributes
    @Id // Primary Key
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference // Foreign Key => Only stores the ObjectId of the Review (Reviews will be in a separate collection/table)
    private List<Review> reviewIds; // Embedded Relationship
}
