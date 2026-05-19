/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342877867
 */
public class IntellectualPropertyCase extends EthicsCase {
    private String iptype;
    
    public IntellectualPropertyCase(String caseTitle, String description, String iptype){
        super(caseTitle, description, "IntellectualProperty Case");
        this.iptype = iptype;
    }
    
    public String getIpType(){
        return iptype;
    }
    
    public String toString(){
        String output = super.toString();
        return output + iptype;
    }
}
