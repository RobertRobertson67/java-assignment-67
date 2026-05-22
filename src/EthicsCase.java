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
    Method to return values in personal format
    @Return caseTitle
    @Return description
    @Return category
    */
    public String toString(){
        return caseTitle + description + category;
    }
}
