/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342877867
 */
public class MisinformationCase extends EthicsCase {
    private String mediaType;
    
    public MisinformationCase(String caseTitle, String description, String mediaType){
        super(caseTitle, description, "Misinformation Case");
        this.mediaType = mediaType;
    }
    
    public String getMediaType(){
        return mediaType;
    }
    
    public String toString(){
        String output = super.toString();
        return output + mediaType;
    }
}
