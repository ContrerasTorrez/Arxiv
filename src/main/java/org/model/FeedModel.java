package org.model;


import org.apache.abdera.model.Feed;
import org.requests.ArxivQuery;

import java.util.Date;

import static java.lang.Byte.parseByte;

public class FeedModel {
    Feeds feed;
    public FeedModel(){
        this.feed = new Feeds();
    }

    public void setFeed(
//        String id,
//        short itemPerPage,
//        String type,
//        byte start,
//        LocalDateTime update,
//        int totalResults
            Feed f
    ){
        this.feed.setId(f.getId().toString());
        this.feed.setType(f.getTitleType().toString());
        this.feed.setStartIndex((byte) 0);
        this.feed.setItemsPerPage((short)f.getEntries().size());
        this.feed.setUpdate(f.getUpdated());
        System.out.println(feed);
        String totalResults = f.getSimpleExtension("totalResults", "http://a9.com/-/spec/opensearch/1.1/","0");
        System.out.println(f.getAttributeValue("totalResults"));
    }
    public Feeds getFeed(){
        return this.feed;
    }
}
