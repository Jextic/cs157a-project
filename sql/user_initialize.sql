CREATE DATABASE IF NOT EXISTS movie_booking_db;
CREATE USER IF NOT EXISTS 'movie_user'@'localhost' IDENTIFIED BY 'movie_pass';
GRANT ALL PRIVILEGES ON movie_booking_db.* TO 'movie_user'@'localhost';