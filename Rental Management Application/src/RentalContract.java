/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class RentalContract {

    public RentalContract(String ContractID, String Property, String TenantID, int RentAmount) {
        this.ContractID = ContractID;
        this.Property = Property;
        this.TenantID = TenantID;
        this.RentAmount = RentAmount;
    }

    public String getContractID() {
        return ContractID;
    }

    public void setContractID(String ContractID) {
        this.ContractID = ContractID;
    }

    public String getProperty() {
        return Property;
    }

    public void setProperty(String Property) {
        this.Property = Property;
    }

    public String getTenantID() {
        return TenantID;
    }

    public void setTenantID(String TenantID) {
        this.TenantID = TenantID;
    }

    public int getRentAmount() {
        return RentAmount;
    }

    public void setRentAmount(int RentAmount) {
        this.RentAmount = RentAmount;
    }
    private String ContractID;
    private String Property;
    private String TenantID;
    private int RentAmount;

    public static RentalContract CreateContract(String ContractID, String Property, String TenantID, int RentAmount) {
        for (RentalContract currentContract : Database.contractList) {
            if (currentContract.getContractID().equals(ContractID)) {
                return null;
            }
        }
        RentalContract newContract = new RentalContract(ContractID, Property, TenantID, RentAmount);
        return newContract;
    }

    public boolean TerminateContract(RentalContract contract) {
        for (RentalContract currentContract : Database.contractList) {
            if (currentContract.getContractID().equals(ContractID)) {
                Database.contractList.remove(contract);
                return true;
            }
        }
        return false;
    }
}
