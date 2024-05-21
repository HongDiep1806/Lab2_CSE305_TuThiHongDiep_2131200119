/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public interface ContractBuilder {

    public void BuildContractID();

    public void BuildPropertyID();

    public void BuildTenantID();

    public void BuildRentAmount();

    public Contract SignContract();
}
