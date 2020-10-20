
package sumona.akter.bristy_.pkg171.pkg007.pkg042;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;


public class SumonaAkterBristy_171007042 {

    public static void main(String[] args) {
      try{
            FileReader fileReader = new FileReader("C:\\Users\\Windows\\Desktop\\SumonaBristy\\Bristy.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            String file = "";
            while(line != null){
                file += line + "\n";
                line = reader.readLine();
            }
            System.out.println(file);
            String regex = "while\\(\\w+(==|!=|>|<|<=|>=)\\w+\\)\\nbegin\\n\\w+=\\w+(\\+|\\-|\\*|\\/)\\d+;\\n:\\nend\\n";
           
            boolean isMatched = Pattern.compile(regex).matcher(file).matches();
            if(isMatched)
                System.out.println("The input file follows the pattern");
            else
                System.out.println("The input file doesn't follows the pattern");
        }
        catch (IOException e){
            System.out.println("File not Found");
        }
    }
    
}

    }
    
}
