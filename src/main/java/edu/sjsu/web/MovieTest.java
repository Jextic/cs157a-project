package edu.sjsu.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MovieTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/")
    public String checkMovie(@RequestParam(name = "movieId", required = false) Integer movieId, Model model) {
        // Query database if a movie_id was entered
        if (movieId != null) {
            model.addAttribute("searched", true);
            String sql = "SELECT title FROM movies WHERE movie_id = ?";

            // Executes query and returns matching strings (empty if none are found)
            List<String> results = jdbcTemplate.queryForList(sql, String.class, movieId);

            if (!results.isEmpty()) {
                // Movie found, movie title is passed to the HTML page (exists = true)
                model.addAttribute("exists", true);
                model.addAttribute("message", "Movie " + movieId + ": " + results.get(0));
            }
            else {
                // Movie not found, say it doesn't exist (exists = false)
                model.addAttribute("exists", false);
                model.addAttribute("message", "Movie " + movieId + " does not exist in the database.");
            }
        }
        else {
            // Default HTML page
            model.addAttribute("searched", false);
        }

        return "index"; // Looks for src/main/resources/templates/index.html
    }
}
