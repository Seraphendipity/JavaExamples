package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        String iFilename = "input.txt";
        String[] errParams = new String[5];
        char[] oDelims = {'{','[','('};
        char[] cDelims = {'}',']',')'};
        Stack<Integer> brackets = new Stack<>();

        System.out.println("Hello Java");
        new BracketPair();

        File iFile = new File(iFilename);

        if (!iFile.exists()) {
            errParams[0] = iFile.getName();
            errParams[1] = iFile.getAbsolutePath();
            Error("FileNotFound", errParams);
        }
        int i = 0;
        int j = 0;
        BufferedReader reader = new BufferedReader(new FileReader(iFile));
        
        int c = reader.read();
        while (c != -1) {
            System.out.print((char) c);
            
            for(int d : oDelims) {
                if (c == d) {
                    brackets.push(d);
                }
            }

            for(int d : cDelims) {
                j++;
                if(c == d) {
                    //System.out.println(d);
                    //System.out.println(brackets.peek());
                    if(d == (brackets.peek() + 2)) {
                        brackets.pop();
                    } else {
                        errParams[0] = Integer.toString(i);
                        Error("IncorrectBrackets",errParams);
                    }
                }
            }
            j=0;


            c = reader.read();
            i++;
        }
        reader.close();

        if (brackets.empty()) {
            Report("SUCCESS! No bracket problems!");
        } else {
            Error("UnclosedBrackets",errParams);
        }


    }

    public static void Error(String errName, String[] errParams) {
        String msg = "";
        switch (errName) {
        case "FileNotFound":
            msg = "Input '" + errParams[0] + "' does not exit in '" + errParams[1] + "'.";
            break;
        case "IncorrectBrackets":
            msg = "Incorrect brackets at char " + errParams[0] + ".";
            break;
        case "UnclosedBrackets":
            msg = "Unclosed brackets by end of file.";
            break;
        default:
            msg = "Unexpected error type, something went unexpectedly wrong.";
            break;
        }

       Report("ERROR -" + errName + " : " + msg);
       System.exit(0);
    }

    public static void Report(String msg) {
        String msgFull = System.lineSeparator();
        msgFull = "----------------------------------------";
        msgFull += System.lineSeparator();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        msgFull += System.lineSeparator();
        Date date = new Date(System.currentTimeMillis());
        msgFull += System.lineSeparator();
        msgFull += dateFormat.format(date); //2016/11/16 12:08:43
        msgFull += System.lineSeparator();
        msgFull += msg;
        msgFull += System.lineSeparator();
        msgFull += "----------------------------------------";
        msgFull += System.lineSeparator();

        System.out.println(msgFull);

        String oFilename = "debug.txt";
        File oFile = new File(oFilename);
        try {
            FileWriter writer = new FileWriter(oFile);
            writer.append(msgFull);
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}