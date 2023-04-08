package dev.abhisek.moviesapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true", allowedHeaders = "*")
@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> allMovies() {
        return ResponseEntity.ok(this.movieService.allMovies());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Movie>> singleMovie(@PathVariable("id") String imdbId) {
        return ResponseEntity.ok(this.movieService.singleMovies(imdbId));
    }
}
