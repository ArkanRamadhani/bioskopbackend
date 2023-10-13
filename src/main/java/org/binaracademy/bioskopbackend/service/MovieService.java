package org.binaracademy.bioskopbackend.service;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface MovieService {

    List<Movie> getMovieCurrentlyShowing(Date date);

    void addNewMovie(Movie movie);
    MovieResponse getMovieDetail(String selectedMovieName);
    Page<Movie> getMoviePaged(int page);

}