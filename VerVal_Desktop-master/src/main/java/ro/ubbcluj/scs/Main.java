package ro.ubbcluj.scs;

public class Main {
	
    public static void main(String[] args) {
        LogAnalyzer logAnalyser = new LogAnalyzer();
        
        System.out.println(logAnalyser.isValidLogFileName("test.filename"));
    
    }
    
}