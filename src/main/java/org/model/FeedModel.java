package org.model;

import java.time.LocalDateTime;

public class FeedModel {
    String id ;// "http://arxiv.org/api/dX19P1t8HmB4jnxNvsgKZB0uj9I"
    String link_href ; //"http://arxiv.org/api/query?search_query%3Dcat%3Amath.%2A%26id_list%3D%26start%3D0%26max_results%3D10"
    String type;//"application/atom+xml"
    String type_html ;// "ArXiv Query: search_query=cat:math.*&amp;id_list=&amp;start=0&amp;max_results=10"
    LocalDateTime update ;// 2023-04-28T00:00:00-04:00</updated>
    int totalResults ;// 589780
    byte startIndex ;// 0
    short itemsPerPage ;// 10
}
