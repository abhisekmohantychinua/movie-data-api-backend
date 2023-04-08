package dev.abhisek.moviesapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return this.movieRepository.findAll();
    }

    public Optional<Movie> singleMovies(String imdbId) {
        return this.movieRepository.findMovieByImdbId(imdbId);
    }
}
