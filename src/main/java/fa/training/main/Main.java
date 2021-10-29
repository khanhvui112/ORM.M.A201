package fa.training.main;

import fa.training.entity.Type;
import fa.training.entity.TypeMovie;
import fa.training.entity.TypeMovieId;
import fa.training.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author san vui
 * @create 17/10/2021 - 10:28 PM
 * @sanvankhanh@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtils.getSession();

        TypeMovieId type = new TypeMovieId(1,"M001");
        Transaction transaction = session.beginTransaction();
        TypeMovie typeMovie = new TypeMovie(type, "ViewCao");
        session.save(typeMovie);
        transaction.commit();
     //   TypeMovie typeMovie = new TypeMovie();
    }
}
