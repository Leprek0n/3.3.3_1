import com.qoobico.remindme.server.dao.UserDaoImpl;
import com.qoobico.remindme.server.dao.UserDaoInterface;
import com.qoobico.remindme.server.entity.User;

import java.util.List;

public class Main {
    static UserDaoInterface udi = new UserDaoImpl();
    public static void main(String[] args) {
        User user = udi.getUserById(1);
        System.out.println(user);
//        List<User> list = udi.getUserList();
//        System.out.println(list);
    }
}
