import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Ritu {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\Java\\CodeFile.txt");
        Scanner scanner = new Scanner(file);
        String program = "";
        while(scanner.hasNextLine()){
            program = program + scanner.nextLine() + "\n";
        }
        String regex = "while\\(\\w+(==|!=|>|<|<=|>=)\\w+\\)\\nbegin\\n\\s\\w+=\\w+(\\+|\\-|\\*|\\/)\\d+;\\n\\s:\\nend\\n";

        var isMatched = Pattern.compile(regex).matcher(program).matches();
        if(isMatched)
            System.out.println("The input file follows the pattern");
        else
            System.out.println("The input file doesn't follows the pattern");
    }
}
