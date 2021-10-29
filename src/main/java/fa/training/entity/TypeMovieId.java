package fa.training.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author san vui
 * @create 18/10/2021 - 3:21 AM
 * @sanvankhanh@gmail.com
 */
@Embeddable
public class TypeMovieId implements Serializable {
    public static final long serialVersionUID = 4L;

    @Column(name = "type_Id",unique = true)
    private int typeId;

    @Column(name = "movie_Id",length = 10,unique = true)
    private String movieId;

    public TypeMovieId() {
    }

    public TypeMovieId(int typeId, String movieId) {
        this.typeId = typeId;
        this.movieId = movieId;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TypeMovieId)) return false;
        TypeMovieId that = (TypeMovieId) o;
        return getTypeId() == that.getTypeId() && getMovieId().equals(that.getMovieId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTypeId(), getMovieId());
    }
}
