package org.requests;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.abdera.Abdera;
import org.apache.abdera.model.Document;
import org.apache.abdera.model.Feed;
import org.apache.abdera.parser.ParseException;
import org.apache.abdera.parser.Parser;
public class ArxivFeed {
    public Feed getFeed(String uRL) {
        Feed feed = null;
        try {
            Abdera abdera = new Abdera();
            Parser parser = abdera.getParser();
            URL url = new URL(uRL);
            Document<Feed> doc = parser.parse(url.openStream(),url.toString());
            feed = doc.getRoot();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return feed;
    }
}
