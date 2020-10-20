import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
public class PatternCheck {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            var fileReader = new FileReader("D:\\Java\\CodeFile.txt");
            var reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            String file = "";
            while(line != null){
                file += line + "\n";
                line = reader.readLine();
            }

            String variable = "([a-zA-Z_]\\w*|\\d)";
            String extension = "(.*\\n)*";
            String regex =
                    extension +
                    "while\\(" + variable + "(=>|==|=<)" + variable + "\\)\\n" +
                    "begin\\n" +
                    "\\s*[a-zA-Z_]\\w*=(" + variable + "(\\+|\\-|\\*|\\/)" + variable + "|" + variable + ")\\;\\n" +
                    "\\s*:\\n" +
                    "\\s*end\\n" +
                    extension;

            var isMatched = Pattern.compile(regex).matcher(file).matches();
            if(isMatched)
                System.out.println("The input file follows the pattern");
            else
                System.out.println("The input file doesn't follows the pattern");
        }
        catch (IOException e){
            System.out.println("Sorry! File not Found\n" + e);
        }
    }
}
