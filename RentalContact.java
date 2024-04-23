/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class RentalContact {

    public RentalContact(String ID, String PropertyID, String TenantID, String RentAmount) {
        this.ID = ID;
        this.PropertyID = PropertyID;
        this.TenantID = TenantID;
        this.RentAmount = RentAmount;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPropertyID() {
        return PropertyID;
    }

    public void setPropertyID(String PropertyID) {
        this.PropertyID = PropertyID;
    }

    public String getTenantID() {
        return TenantID;
    }

    public void setTenantID(String TenantID) {
        this.TenantID = TenantID;
    }

    public String getRentAmount() {
        return RentAmount;
    }

    public void setRentAmount(String RentAmount) {
        this.RentAmount = RentAmount;
    }
    String ID;
    String PropertyID;
    String TenantID;
    String RentAmount;
    
    public static RentalContract CreateContract(String ContractID, String Property, String TenantID, int RentAmount) {
        for (RentalContract contract : ListOfContract) {
            if (contract.ID.equals(ContractID)) {
                return null;
            }
        }
        RentalContract newContract = new RentalContract(ContractID, Property, TenantID, RentAmount);
        return newContract;
    }

    public boolean TerminateContract(RentalContract contract, String ContractID) {
        for (RentalContract contract : ListOfContact) {
            if (contract.ID.equals(ContractID)) {
                contractList.remove(contract);
                return true;
            }
        }
        return false;
    }
    
}
