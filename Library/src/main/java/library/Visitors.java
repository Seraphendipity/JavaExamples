package library;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class Visitors extends lList
{
    private static final long serialVersionUID = 3800296297672227442L;

    public Visitors(String iFilename) throws JsonParseException, JsonMappingException, IOException {
        super(iFilename);
    }

    public Visitors(String iFilename, String oFilename) throws JsonParseException, JsonMappingException, IOException  {
        super(iFilename, oFilename);
    }

    public Visitors(File iFile) throws JsonParseException, JsonMappingException, IOException {
        super(iFile);
    }

    public Visitors(File iFile, File oFile) throws JsonParseException, JsonMappingException, IOException  {
        super(iFile, oFile);
    }
}
