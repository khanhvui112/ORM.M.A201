package fa.training.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

/**
 * @author san vui
 * @create 18/10/2021 - 3:25 AM
 * @sanvankhanh@gmail.com
 */
@Entity
@Table(name = "Movie")
public class Movie implements Serializable {
    public static final long serialVersionUID = 1L;
    @Id
    @Column(name = "movie_Id",length = 10)
    private String movieId;

    @Column(name = "actor", length = 255)
    private String actor;

    @Column(name = "content", length = 1000)
    private String content;

    @Column(name = "director", length = 255)
    private String director;

    @Column(name = "duration", length = 5, precision = 2)
    private double duration;

    @Column(name = "from_Date")
    private LocalDate fromDate;

    @Column(name = "to_Date")
    private LocalDate toDate;

    @Column(name = "movie_Production_Company")
    private String movieProductionCompany;

    @Column(name = "version")
    private String version;

    @Column(name = "movie_Name_Eng", unique = true)
    private String movieNameEng;

    @Column(name = "movie_Name_Vn", unique = true)
    private String movieNameVn;

    @Column(name = "large_Image")
    private String largeImage;

    @Column(name = "small_Image")
    private String smallImage;


    @OneToMany(mappedBy = "type",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TypeMovie> movieList;

    public Movie() {
    }

    public Movie(String movieId, String actor, String content, String director, double duration, LocalDate fromDate, LocalDate toDate, String movieProductionCompany, String version, String movieNameEng, String movieNameVn, String largeImage, String smallImage, List<TypeMovie> movieList) {
        this.movieId = movieId;
        this.actor = actor;
        this.content = content;
        this.director = director;
        this.duration = duration;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.movieProductionCompany = movieProductionCompany;
        this.version = version;
        this.movieNameEng = movieNameEng;
        this.movieNameVn = movieNameVn;
        this.largeImage = largeImage;
        this.smallImage = smallImage;
        this.movieList = movieList;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public String getMovieProductionCompany() {
        return movieProductionCompany;
    }

    public void setMovieProductionCompany(String movieProductionCompany) {
        this.movieProductionCompany = movieProductionCompany;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getMovieNameEng() {
        return movieNameEng;
    }

    public void setMovieNameEng(String movieNameEng) {
        this.movieNameEng = movieNameEng;
    }

    public String getMovieNameVn() {
        return movieNameVn;
    }

    public void setMovieNameVn(String movieNameVn) {
        this.movieNameVn = movieNameVn;
    }

    public String getLargeImage() {
        return largeImage;
    }

    public void setLargeImage(String largeImage) {
        this.largeImage = largeImage;
    }

    public String getSmallImage() {
        return smallImage;
    }

    public void setSmallImage(String smallImage) {
        this.smallImage = smallImage;
    }

    public List<TypeMovie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<TypeMovie> movieList) {
        this.movieList = movieList;
    }

    @Override
    public String toString() {
        return "movieId=" + movieId +"\t\t\t" +
                "actor=" + actor  +"\t\t\t" +
                "content=" + content  +"\t\t\t" +
                "director=" + director  +"\t\t\t" +
                "duration=" + duration  +"\t\t\t" +
                "fromDate=" + fromDate  +"\t\t\t" +
                "toDate=" + toDate  +"\t\t\t" +
                "movieProductionCompany=" + movieProductionCompany +"\t\t\t" +
                "version=" + version  +"\t\t\t" +
                "movieNameEng=" + movieNameEng  +"\t\t\t" +
                "movieNameVn=" + movieNameVn  +"\t\t\t" +
                "largeImage=" + largeImage  +"\t\t\t" +
                "smallImage=" + smallImage  +"\t\t\t";
    }
}
