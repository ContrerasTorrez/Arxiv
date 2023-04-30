package org.api;

import org.requests.ArxivQuery;
import org.requests.EnumOrAnd;

public class App
{
    public static void main( String[] args )
    {
        ArxivQuery aqQuery = new ArxivQuery();
        aqQuery.setCategory("cs.PL", EnumOrAnd.EMPTY.toString());
        String string_query = aqQuery.getQuery(aqQuery.getSearchQuery());
        System.out.println(string_query);
    }


}
