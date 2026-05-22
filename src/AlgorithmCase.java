/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342877867
 */
public class AlgorithmCase extends EthicsCase {
    //Declare private variables
    private String biasType;
    
    /**
    Method to assign values to bias type and inherit values from Ethics Case
    @Param caseTitle This is the title for the case/situation
    @Param description This is the description of the situation
    @Param biasType This is the type of bias being shown
    */
    public AlgorithmCase(String caseTitle, String description, String biasType){
        super(caseTitle, description, "Algorithm Case");
        this.biasType = biasType;
    }
    
    /**
    Method to return biasType value
    @Return biasType
    */
    public String getBiasType(){
        return biasType;
    }
    
    /**
    Method to return values in personal format
    @Return biasType
    */
    public String toString(){
        String output = super.toString();
        return output + biasType;
    }
    
}
