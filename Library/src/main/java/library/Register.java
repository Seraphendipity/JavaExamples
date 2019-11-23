package library;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class Register extends lList
{
    private static final long serialVersionUID = 6208281226687389841L;

    public Register(String iFilename) throws JsonParseException, JsonMappingException, IOException {
        super(iFilename);
    }

    public Register(String iFilename, String oFilename) throws JsonParseException, JsonMappingException, IOException  {
        super(iFilename, oFilename);
    }

    public Register(File iFile) throws JsonParseException, JsonMappingException, IOException {
        super(iFile);
    }

    public Register(File iFile, File oFile) throws JsonParseException, JsonMappingException, IOException  {
        super(iFile, oFile);
    }
}
