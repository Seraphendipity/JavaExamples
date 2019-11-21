package library;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;;

public class lController 
{

    public lController() {
        //Visitors vList = new Visitors(); // Visitors
        /*Books bList = new Books(); // Books
        Register rList = new Register(); // Registrations
        //ArrayList<lList> lol = new ArrayList<>(); // Lists of Lists (LoL)
        //lol.add(bList);
        vList.importData("visitors.json");*/

        ArrayList<Visitor> vList = new ArrayList<>(); // Visitors
        ArrayList<Book> bList = new ArrayList<>(); // Visitors
        ArrayList<Registration> rList = new ArrayList<>(); // Visitors

        importData(vList, "Visistors.json");
        importData(bList, "Books.json");
        //importData(rList, "Register.json");


    }

    private void importData(ArrayList<lElement> list, String iFilename) {
        System.out.println("hello");
        // JSON PARSER - FROM https://www.geeksforgeeks.org/parse-json-java/
        
        //try {
            File iFile = new File(iFilename);
			//FileReader iFile = new FileReader(iFilename);
            //BufferedReader reader = new BufferedReader(iFile);
            //ObjectMapper m = new ObjectMapper();
            //while((line = reader.readLine()) != null) {
                //list = m.readValue(new File(iFilename),TypeReference<ArrayList<lElement>>(){});
            //}
            //reader.close();


		// } catch (FileNotFoundException e2) {
		// 	e2.printStackTrace();
        // } catch (IOException e1) {
		// 	// TODO Auto-generated catch block
		// 	e1.printStackTrace();
		// } 

    }
}
