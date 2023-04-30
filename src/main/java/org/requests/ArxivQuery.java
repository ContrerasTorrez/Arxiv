package org.requests;

/*
ti  Title
au	Author
cat	Subject Category
all	All of the above
 */
public class ArxivQuery {


    // CATEGORY
    public String getCategory() {
        return category;
    }

    public void setCategory(String category, String e) {

        if(e.toString().equals(EnumOrAnd.AND.toString())) {
            this.category += "+AND+cat:" + category;
        }else if(e.toString().equals(EnumOrAnd.OR.toString())) {
            this.category += "+OR+cat:" + category;
        }else {
            this.category += "cat:" + category;
        }
    }

    // AUTHOR
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author, String e) {
        if(e.toString().equals(EnumOrAnd.AND.toString())) {
            this.author += "+AND+au:" + author;
        }else if(e.toString().equals(EnumOrAnd.OR.toString())) {
            this.author += "+OR+au:" + author;
        }else {
            this.author += "au:" + author;
        }
    }

    //ALL
    public String getAll() {
        return all;
    }
    public void setAll(String all,String e) {
        if(e.toString().equals(EnumOrAnd.AND.toString())) {
            this.all += "+AND+all:" + all;
        }else if(e.toString().equals(EnumOrAnd.OR.toString())) {
            this.all += "+OR+all:" + all;
        }else {
            this.all += "all:" + all;
        }
    }

    public String getSearchQuery() {
        String search = "?search_query=" +
                this.getCategory() +
                this.getAuthor() +
                this.getAll();
        return search;
    }
    public String getQuery(String SearchQuery) {
        return this.URL + SearchQuery + this.SORTBY + this.SORTBY + this.start + this.max_results;
    }

    private String category = "";
    private String author = "";
    private String all = "";

    private final static String URL = "http://export.arxiv.org/api/query";
    private final static String SORTBY = "&sortBy=lastUpdatedDate";
    private final static String SORTORDER = "&sortOrder=ascending";
    private final static String start = "&start=" + 0;
    private String max_results = "&max_results=" + 4181; // si adivinas por que este numero tienes un premio xD

}

