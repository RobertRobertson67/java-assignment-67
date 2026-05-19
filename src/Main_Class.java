/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andrewchow
 */
public class Main_Class {
    public static void main(String[] args){
        PrivacyCase P = new PrivacyCase("The always on microphone.", 
                "A smart speaker is recording household conversations even when device is off. ", 
                "Employess are then reviewing these audio files.");

        AlgorithmCase A = new AlgorithmCase("The Biased Hiring Bot. ", "AI ranks male applicant higher than female applicants. ", 
            "The AI algorithm is showing bias.");
    
        MisinformationCase M = new MisinformationCase("The Deepfake politician", 
            "A deepfake video of a famous politician sayings things is being spread onliine", "A deepfake video is being shared.");
    
        IntellectualPropertyCase I = new IntellectualPropertyCase("AI Trained On Artist Work. ", 
            "An AI image generator was trained on millions of artworks without compensation. ", "This is Ai generated art.");
    
        P.verdict = new Verdict("Data leak case ", "Unethical", "User data was shared without concent");
    
        System.out.println(P.getDataType());
        System.out.println(P.toString());
        System.out.println(A.toString());
        System.out.println(M.toString());
        System.out.println(I.toString());
    }
}
