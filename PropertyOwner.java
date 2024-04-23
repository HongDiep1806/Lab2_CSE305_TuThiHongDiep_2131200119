
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
public class PropertyOwner {
    public static List<Property> listOfProperty = new ArrayList<>();
    private User user;
    
    public boolean addProperty(Property property) {
        for (Property property : listOfProperties) {
            if (property.ID.equals(property.ID)) {
                return false;
            }
        }
        listOfProperties.add(property);
        return true;
    }

    public boolean removeProperty(Property property) {
        for (Property property : listOfProperties) {
            if (property.ID.equals(property.ID)) {
                listOfProperties.remove(property);
                return true;
            }
        }
        return false;
    }
}
    
}
