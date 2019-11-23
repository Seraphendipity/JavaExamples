package library;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class lList extends ArrayList<lElement>
{
    File iFile;
    File oFile;

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public lList(String iFilename) throws JsonParseException, JsonMappingException, IOException  {
        this(new File(iFilename));
    }

    public lList(String iFilename, String oFilename) throws JsonParseException, JsonMappingException, IOException  {
        this(new File(iFilename), new File(oFilename));
    }

    public lList(File iFile) throws JsonParseException, JsonMappingException, IOException {
        this.iFile = iFile;
        this.oFile = iFile;
        this.importData();
    }

    public lList(File iFile, File oFile) throws JsonParseException, JsonMappingException, IOException  {
        this(iFile);
        this.oFile = oFile;
    }
    
    private void importData() throws JsonParseException, JsonMappingException, IOException {
        if( iFile.createNewFile()) {
            System.out.println(iFile.getAbsolutePath());
        } else if (iFile.length() != 0) {
            this.addAll(new ObjectMapper().readValue(iFile, new TypeReference<lList>() {}));
        } else {
            // view.display("File '" + iFile + "' could not be found for " + list.getClass() + ", creating new file.");
        }
    }

}
    // public void importData(String iFilename) throws JsonParseException, JsonMappingException, IOException {
    //     this.importData(new File(iFilename));
    // }