/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342877867
 */
public class Verdict {
    private String caseName;
    private String studentVerdict;
    private String reason;
    
    public Verdict(){
        this.caseName = "";
        this.studentVerdict = "";
        this.reason = "";
    }
    
    public Verdict(String caseName, String verdict, String reason){
        this.caseName = caseName;
        this.studentVerdict = verdict;
        this.reason = reason;
    }
    
    public void setCaseName(){
        this.caseName = caseName;
    }
    
    public String getCaseName(){
        return caseName;
    }
    
    public void setReason(String text){
        this.reason = reason;
    }
    
    public String getReason(){
        return reason;
    }
    
    public void setStudentVerdict(boolean selected){
        this.studentVerdict = studentVerdict;
    }
    
    public String getStudentVerdict(){
        return studentVerdict;
    }
    
    public String toString(){
        return caseName + reason + studentVerdict;
    }
}
