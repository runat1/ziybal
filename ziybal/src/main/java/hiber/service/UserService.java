package hiber.service;


import org.springframework.transaction.annotation.Transactional;

import hiber.model.User;
import java.util.List;

public interface UserService {
    @Transactional
    void add(User user);

    List<User> listUsers();



}
