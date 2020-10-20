import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
public class Ritu {
    public static void main(String[] args){
        try{
            FileReader file = new FileReader("D:\\Java\\CodeFile.txt");
            BufferedReader buffer = new BufferedReader(file);
            String pattern = "while\\(\\w+(==|!=|>|<|<=|>=)\\w+\\)\\nbegin\\n\\s\\w+=\\w+(\\+|\\-|\\*|\\/)\\d+;\\n\\s:\\nend\\n";
            String line = buffer.readLine();
            String code = "";
            while(line != null){
                code = code + line + "\n";
                line = buffer.readLine();
            }

            boolean flag = Pattern.compile(pattern).matcher(code).matches();
            if(flag) {
                System.out.println("Matched");
            }
            else {
                System.out.println("Didn't matched");
            }
        }
        catch (IOException e){
            System.out.println("File Error");
        }
    }
}
