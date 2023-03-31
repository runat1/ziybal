
package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class UserDaoImp implements UserDao {

   @PersistenceContext
   private EntityManager entityManager;

   @Override
   public void addUser(User user) {
      entityManager.getTransaction();
      entityManager.persist(user);
   }
   @Override
   public List<User> getListOfUsers() {
      return entityManager.createQuery("select user from User user", User.class).getResultList();
   }
}
