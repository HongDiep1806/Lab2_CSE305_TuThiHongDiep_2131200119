
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Asus
 */
public class PropertyOwner {

    private User user;
    private List<Property> listOfProperties = new ArrayList<>();

    public boolean addProperty(Property property) {
        for (Property currentProperty : listOfProperties) {
            if (currentProperty.getPropertyID().equals(property.getPropertyID())) {
                return false;
            }
        }
        listOfProperties.add(property);
        return true;
    }

    public boolean removeProperty(Property property) {
        for (Property currentProperty : listOfProperties) {
            if (currentProperty.getPropertyID().equals(property.getPropertyID())) {
                listOfProperties.remove(property);
                return true;
            }
        }
        return false;
    }
}
