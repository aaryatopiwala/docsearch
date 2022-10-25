import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class TestDocSearch {

    @Test
    public void testIncrement() throws URISyntaxException, IOException {
        Handler h = new Handler("./technical/");
        URI search = new URI("http://localhost/search?s=pasta");
        URI rootPath = new URI("http://localhost/");
        assertEquals(h.handleRequest(search),
                "Search Results: \n.\\technical\\biomed\\1475-2891-2-1.txt\n.\\technical\\biomed\\1476-4598-2-25.txt\n.\\technical\\biomed\\ar93.txt\n");
        assertEquals(h.handleRequest(rootPath), "There are 1391 files to search");
    }
}