package hiber;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import hiber.config.AppConfig;
import hiber.model.User;
import hiber.service.UserService;

import javax.persistence.NonUniqueResultException;
import java.sql.SQLException;
import java.util.*;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);
/*        User user = new User("User3", "Lastname2", "user2@mail.ru");
        userService.add(user);
        userService.add(new User("User3", "Lastname3", "user3@mail.ru"));
        userService.add(new User("User4", "Lastname4", "user4@mail.ru"));
        userService.add(new User("User4", "Lastname4", "user4@mail.ru"));*/
        out(userService.listUsers());

        context.close();
    }
   public static void out(List<User>list){
       for (User check2 : list) {
           System.out.println("Id = " + check2.getId());
           System.out.println("First Name = " + check2.getFirstName());
           System.out.println("Last Name = " + check2.getLastName());
           System.out.println("Email = " + check2.getEmail());
           System.out.println();
       }
   }

}
