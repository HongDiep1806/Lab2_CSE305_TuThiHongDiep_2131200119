/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class UserService {
    public static boolean  createUser(String userID, String password, String email, String userType){
        for (User user : Database.userList) {
            if(user.getUserID().equals(userID)){
                return false;
            }
        }
        User newUser = new User(userID, password, email, userType);
        return true;
    }
    
    public static String resetPassword (String userID){
        for (User user : Database.userList) {
            if(user.getUserID().equals(userID)){
                return user.getPassword();
            }
        }
        return "Can not find user's ID";
    }
}
