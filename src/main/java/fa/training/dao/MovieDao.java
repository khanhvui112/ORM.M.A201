package fa.training.dao;

import fa.training.entity.Movie;

import java.util.List;

/**
 * @author san vui
 * @create 24/10/2021 - 9:47 PM
 * @sanvankhanh@gmail.com
 */
public interface MovieDao {
    List<Movie> findAll();
    boolean update(Movie movie);
    boolean delete(int id);
}
