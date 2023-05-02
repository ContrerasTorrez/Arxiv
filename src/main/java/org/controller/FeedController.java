package org.controller;

import org.model.FeedModel;
import org.model.Feeds;

public class FeedController {
    private FeedModel model;
    public FeedController(FeedModel model){
        this.model = model;
    }
    public void saveFeed(){
        // TODO : implementar, debe guardar los registros en la base de datos. Tabla Feeds
        Feeds a = model.getFeed();
        System.out.println(a);
//        a.getId();
//        a.getLink_href();
//        a.getItemsPerPage();
//        a.getTotalResults();
//        a.getUpdate();
//        a.getType_html();
//        a.getStartIndex();
//        a.getType();

    }
}
