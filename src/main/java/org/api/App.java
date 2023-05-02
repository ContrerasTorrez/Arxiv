package org.api;

import org.apache.abdera.model.Feed;
import org.controller.FeedController;
import org.model.FeedModel;
import org.requests.ArxivFeed;
import org.requests.ArxivQuery;
import org.requests.EnumOrAnd;

public class App
{
    public static void main( String[] args )
    {
        //CREACIÓN DE LA CONSULTA QUE SE LE HARÁ A LA API
        ArxivQuery aqQuery = new ArxivQuery();
        aqQuery.setCategory("cs.PL", EnumOrAnd.EMPTY.toString());
        String string_query = aqQuery.getQuery(aqQuery.getSearchQuery());
        System.out.println(string_query);

        //CREACCIÓN DEL OBJECTO QUE TRAERÁ TODA LA DATA DE FEED
        ArxivFeed arxiv_feed = new ArxivFeed();
        Feed feed = arxiv_feed.requestFeed(string_query);

        FeedModel model = new FeedModel();

        model.setFeed(feed);

//        FeedController controller = new FeedController(new FeedModel());
    }

}
