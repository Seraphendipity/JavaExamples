package library;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class Books extends lList
{
    private static final long serialVersionUID = 7049911465569337138L;

    public Books(String iFilename) throws JsonParseException, JsonMappingException, IOException {
        super(iFilename);
    }

    public Books(String iFilename, String oFilename) throws JsonParseException, JsonMappingException, IOException  {
        super(iFilename, oFilename);
    }

    public Books(File iFile) throws JsonParseException, JsonMappingException, IOException {
        super(iFile);
    }

    public Books(File iFile, File oFile) throws JsonParseException, JsonMappingException, IOException  {
        super(iFile, oFile);
    }
}
