//package recursion;

import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {
    String[] contexts = {"X->Xd|abc|de", "R->Rf|Rxhff|adk"};
    String[] terminals = new String[10];
    String[] nonTerminals = new String[10];
    
    for(int i=0; i<contexts.length; i++){
        String[] context = contexts[i].split("->");
        nonTerminals[i] = context[0];
        terminals[i] = context[1];
    }
     
    for (int i = 0; i < nonTerminals.length; i++) {
    	String[] el = terminals[i].split("\\|");
        boolean direct = false;
        for(int j=0; j<el.length; j++){
            if(el[j].startsWith(nonTerminals[i])){
                direct = true;
            }      
        }
        
        if (direct) {
            String[] alpha = new String[10];
            String[] beta = new String[10];
            int alphaIterator=0, betaIterator=0;
            for(int k=0; k<el.length; k++){
            	
                if (el[k].startsWith(nonTerminals[i])) {
                    String[] sp = el[k].split(nonTerminals[i]);
                    alpha[alphaIterator] = sp[1];
                    alphaIterator++;
                        
                } else {
                    beta[betaIterator] = el[k];
                    betaIterator++;
                }
            }
            String d1 = (nonTerminals[i] + " ->").concat(String.join((nonTerminals[i]+"' | "), beta)).split(" \\| null")[0] ;
            String d2 = (nonTerminals[i] + "' ->").concat(String.join((nonTerminals[i]+"' | "), alpha)).split(" \\| null")[0].concat("| E") ;
            System.out.println(d1);
            System.out.println(d2);
        }
        else {
        	
        }
    } 
    
    
  }
}

