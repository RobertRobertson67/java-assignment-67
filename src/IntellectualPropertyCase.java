/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342877867
 */
public class IntellectualPropertyCase extends EthicsCase {
    //Declare private variables
    private String iptype;
    
    /**
    Method to assign values to iptype and inherit values from Ethics Case
    @Param caseTitle This is the title for the case/situation
    @Param description This is the description of the situation
    @Param iptype This is the type of bias being shown
    */
    public IntellectualPropertyCase(String caseTitle, String description, String iptype){
        super(caseTitle, description, "IntellectualProperty Case");
        this.iptype = iptype;
    }
    
    /**
    Method to return iptype value
    @Return iptype
    */
    public String getIpType(){
        return iptype;
    }
    
    /**
    Method to return values in personal format
    @Return iptype
    */
    public String toString(){
        String output = super.toString();
        return output + iptype;
    }
}
