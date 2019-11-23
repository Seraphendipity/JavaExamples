package library;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

public class lController {

    public lController() {

        try {
            String path = "resources/";
            Visitors vList = new Visitors(path+"Visitors.json"); // Visitors
            Books bList = new Books(path+"Books.json"); // Books
            Register rList = new Register(path+"Register.json"); // Registration
        } catch (IOException e) {
            // TODO: Auto-generated catch block
            e.printStackTrace();
        }
    }


}
