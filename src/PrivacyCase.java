/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342877867
 */
public class PrivacyCase extends EthicsCase {
    //Declare private variables
    private String dataType;
    
    /**
    Method to assign values to dataType and inherit values from Ethics Case
    @Param caseTitle This is the title for the case/situation
    @Param description This is the description of the situation
    @Param dataType This is the type of data being shown
    */
    public PrivacyCase(String caseTitle, String description, String dataType){
        super(caseTitle, description, "Privacy Case");
        this.dataType = dataType;
    }
    
    /**
    Method to return dataType value
    @Return dataType
    */
    public String getDataType(){
        return dataType;
    }
    
    /**
    Method to return values in personal format
    @Return dataType
    */
    public String toString(){
        String output = super.toString();
        return output + dataType;
    }
}
