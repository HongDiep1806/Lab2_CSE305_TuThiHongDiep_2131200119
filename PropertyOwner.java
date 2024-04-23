/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */

import java.io.*;
import java.util.*;

public class PropertyOwner {
    
    private List<Property> propertyList;

    public PropertyOwner() {
        propertyList = new ArrayList<>();
    }
    
    public void addProperty(Property property) {
        propertyList.add(property);
    }

    public void removeUser(Property property) {
        propertyList.remove(property);
    }
    
}
