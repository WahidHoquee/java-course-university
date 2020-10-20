import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fileFetch {

	public static void main(String[] args) {
		 try{
	            FileReader fileReader = new FileReader("Wahid.txt");
	            BufferedReader reader = new BufferedReader(fileReader);
	            
	            Pattern header = Pattern.compile("#include<stdio.h>|#include<math.h>");	            
	            Pattern keyword = Pattern.compile("int|main|printf|return");
	            Pattern parenthesis = Pattern.compile("\\(|\\)");
	            Pattern identifier = Pattern.compile("[A-Za-z]+");
	            Pattern number = Pattern.compile("[0-9]+");
	            Pattern operator = Pattern.compile("[0-9]+");
	            Pattern special = Pattern.compile("[0-9]+");
	            
	            String line = reader.readLine();
	                while(line != null){
	                	String[] word = line.split(" ");
	                	System.out.println(Arrays.toString(word));
	                	for (int i = 0; i < word.length; i++) {
		    	            Matcher mKeyword = keyword.matcher(word[i]);
		    	            Matcher mHeader = header.matcher(word[i]);
		    	            Matcher mParenthesis = parenthesis.matcher(word[i]);
		    	            Matcher mIdentifier = parenthesis.matcher(word[i]);
		    	            Matcher mNumber = parenthesis.matcher(word[i]);
		    	            Matcher mOperator = parenthesis.matcher(word[i]);
//							System.out.println(word[i]);
		                	if(mKeyword.find()) {
			                	System.out.println("Keyword");
		                	}
		                	if(mHeader.find()) {
			                	System.out.println("Header");	                		
		                	}
		                	if(mParenthesis.matches()) {
			                	System.out.println("parenthesis");	                		
		                	}
						}
	                    line = reader.readLine();
	                }
	            reader.close();
	            
	        }
	        catch(IOException e){
	            e.printStackTrace();
	        }
	}

}
