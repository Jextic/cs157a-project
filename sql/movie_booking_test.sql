USE movie_booking_db;

DROP TABLE IF EXISTS movies;

CREATE TABLE movies (
                        movie_id INT PRIMARY KEY,
                        title VARCHAR(100) NOT NULL
);

INSERT INTO movies VALUES (1, 'Movie A'), (2, 'Movie B');