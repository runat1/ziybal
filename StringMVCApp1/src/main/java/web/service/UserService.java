
package web.service;

import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import java.util.List;

public interface UserService {
    @Transactional
    void addUser(User user);
    List<User> getListOfUsers();
}
