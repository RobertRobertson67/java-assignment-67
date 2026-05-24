/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342877867
 */
public class EthicsCase {
    //Declare private variables
    private String caseTitle;
    private String description;
    private String category;
    public Verdict verdict;
    
    /**
    Method to assign values to caseTitle, description, category and set verdict
    @Param caseTitle This is the title for the case/situation
    @Param description This is the description of the situation
    @Param category This is the category of the situation
    */
    public EthicsCase(String caseTitle, String description, String category){
        this.caseTitle = caseTitle;
        this.description = description;
        this.category = category;   
        this.verdict = new Verdict();
    }
    
    /**
    Method to return caseTitle
    @Return caseTitle
    */
    public String getCaseTitle(){
        return caseTitle;
    }
    
    /**
    Method to return description
    @Return description
    */
    public String getCaseDescription(){
        return description;
    }
    
    /**
    Method to return category
    @Return category
    */
    public String getCategory(){
        return category;
    }
    
    /**
    Method to return a recommendation/help text based on the case/class
    @Param ethicsCase This is the EthicsCase object being passed in
    @Return recommendation/help text
    */
    public static String getHelp(EthicsCase ethicsCase){
        if (ethicsCase instanceof PrivacyCase){
            return "Think about who has access to your personal data and whether you consented to it.";
        } else if (ethicsCase instanceof AlgorithmCase){
            return "Consider whether the algorithm is treating all groups of people fairly.";
        } else if (ethicsCase instanceof MisinformationCase){
            return "Ask yourself: is this information verified and from a credible source?";
        } else if (ethicsCase instanceof IntellectualPropertyCase){
            return "Consider whether the creator is being credited and compensated fairly.";
        } else {
            return "";
        }
    }
    
    /**
    Method to return values in personal format
    @Return caseTitle
    @Return description
    @Return category
    */
    public String toString(){
        return caseTitle + description + category;
    }
}
