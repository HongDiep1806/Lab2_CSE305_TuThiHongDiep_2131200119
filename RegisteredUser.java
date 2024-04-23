
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class RegisteredUser {
    public static List<User> listOfUser = new ArrayList<>();
    public static boolean AddUser(User user) {
        for (User currentUser : listOfUser) {
            if (currentUser.ID.equals(user.ID)) {
                return false;
            }
        }
        listOfUser.add(user);
        return true;
    }

    public static boolean RemoveUser(User user) {
        for (User currentUser : listOfUser) {
            if (currentUser.ID.equals(user.ID)) {

                listOfUser.remove(user);
                return true;
            }
        }
        return false;
    }
}
