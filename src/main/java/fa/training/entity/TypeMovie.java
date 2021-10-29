package fa.training.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author san vui
 * @create 18/10/2021 - 3:20 AM
 * @sanvankhanh@gmail.com
 */
@Entity
@Table(name = "TypeMovie")
public class TypeMovie implements Serializable {
    public static final long serialVersionUID = 3L;
    @EmbeddedId
    private TypeMovieId typeMovieId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "movie_Id", referencedColumnName = "movie_Id", insertable = false, updatable = false)
    private Movie movie;

    @ManyToOne(optional = false)
    @JoinColumn(name = "type_Id", referencedColumnName = "type_Id", insertable = false, updatable = false)
    private Type type;

    @Column(name = "mt_Description", length = 255)
    private String mtDescription;

    public TypeMovie() {
    }

    public TypeMovie(TypeMovieId typeMovieId, Movie movie, Type type, String mtDescription) {
        this.typeMovieId = typeMovieId;
        this.movie = movie;
        this.type = type;
        this.mtDescription = mtDescription;
    }

    public TypeMovie(TypeMovieId typeMovieId, String mtDescription) {
        this.typeMovieId = typeMovieId;
        this.mtDescription = mtDescription;
    }
}
