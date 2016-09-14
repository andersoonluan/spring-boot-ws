package webservice.asonline.playground;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
 
import webservice.asonline.model.Movie;
 
public interface IMovieRepository extends CrudRepository<Movie, Long> {
 
    List<Movie> findByYearLessThan(int year);
 
}