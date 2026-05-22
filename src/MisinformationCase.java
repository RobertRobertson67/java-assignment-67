/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342877867
 */
public class MisinformationCase extends EthicsCase {
    //Declare private variables
    private String mediaType;
    
    /**
    Method to assign values to mediaType and inherit values from Ethics Case
    @Param caseTitle This is the title for the case/situation
    @Param description This is the description of the situation
    @Param mediaType This is the type of media being shown
    */
    public MisinformationCase(String caseTitle, String description, String mediaType){
        super(caseTitle, description, "Misinformation Case");
        this.mediaType = mediaType;
    }
    
    /**
    Method to return mediaType value
    @Return mediaType
    */
    public String getMediaType(){
        return mediaType;
    }
    
    /**
    Method to return values in personal format
    @Return mediaType
    */
    public String toString(){
        String output = super.toString();
        return output + mediaType;
    }
}
