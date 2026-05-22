/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342877867
 */
public class Verdict {
    //Declare private variables
    private String caseName;
    private String studentVerdict;
    private String reason;
    
    /**
    Method to assign values to caseName, studentVerdict and reason
    */
    public Verdict(){
        this.caseName = "";
        this.studentVerdict = "";
        this.reason = "";
    }
    
    /**
    Method to assign values to caseName, verdict and reason
    @Param caseName This is the title for the case/situation
    @Param verdict This is the verdict of ethical or not
    @Param reason This is the reason for their choice
    */
    public Verdict(String caseName, String verdict, String reason){
        this.caseName = caseName;
        this.studentVerdict = verdict;
        this.reason = reason;
    }
    
    /**
    Method to assign values to caseName
    @Param caseName Use caseName value to set as caseName
    */
    public void setCaseName(String caseName){
        this.caseName = caseName;
    }
    
    /**
    Method to return caseName
    @Return caseName
    */
    public String getCaseName(){
        return caseName;
    }
    
    /**
    Method to assign values to reason
    @Param reason Use reason value to set as reason
    */
    public void setReason(String reason){
        this.reason = reason;
    }
    
    /**
    Method to return reason
    @Return reason
    */
    public String getReason(){
        return reason;
    }
    
    /**
    Method to assign values to studentVerdict
    @Param studentVerdict Use studentVerdict value to set as studentVerdict
    */
    public void setStudentVerdict(String studentVerdict){
        this.studentVerdict = studentVerdict;
    }
    
    /**
    Method to return studentVerdict
    @Return studentVerdict
    */
    public String getStudentVerdict(){
        return studentVerdict;
    }
    
    /**
    Method to return values in personal format
    @Return caseName
    @Return reason
    @Return studentVerdict
    */
    public String toString(){
        return caseName + reason + studentVerdict;
    }
}
