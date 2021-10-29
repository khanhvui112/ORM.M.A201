package fa.training.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author san vui
 * @create 18/10/2021 - 3:17 AM
 * @sanvankhanh@gmail.com
 */
@Entity
@Table(name = "Type")
public class Type implements Serializable {
    public static final long serialVersionUID = 2L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "type_Id")
    private int typeId;

    @Column(name = "type_Name",length = 255)
    private String typeName;

    @Column(name = "type_Description",length = 255)
    private String typeDescription;

    @OneToMany(mappedBy = "movie",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TypeMovie> movieList;

    public Type() {
    }

    public Type(String typeName, String typeDescription) {
        this.typeName = typeName;
        this.typeDescription = typeDescription;
    }

    public Type(int typeId, String typeName, String typeDescription) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.typeDescription = typeDescription;
    }

    public Type(int typeId, String typeName, String typeDescription, List<TypeMovie> movieList) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.typeDescription = typeDescription;
        this.movieList = movieList;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeDescription() {
        return typeDescription;
    }

    public void setTypeDescription(String typeDescription) {
        this.typeDescription = typeDescription;
    }

    public List<TypeMovie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<TypeMovie> movieList) {
        this.movieList = movieList;
    }

    @Override
    public String toString() {
        return "typeId=" + typeId +"\t\t\t"+
                "typeName=" + typeName +"\t\t\t"+
                "typeDescription=" + typeDescription +"\t\t\t"+"\n";
    }
}
