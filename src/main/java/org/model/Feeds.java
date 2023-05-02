package org.model;

import java.util.Date;

public class Feeds {
    String id ;// "http://arxiv.org/api/dX19P1t8HmB4jnxNvsgKZB0uj9I"
    String type;//"application/atom+xml"
    Date update ;// 2023-04-28T00:00:00-04:00</updated>
    byte startIndex ;// 0
    short itemsPerPage ;// 10


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public Date getUpdate() {
        return update;
    }

    public void setUpdate(Date update) {
        this.update = update;
    }

    public byte getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(byte startIndex) {
        this.startIndex = startIndex;
    }

    public short getItemsPerPage() {
        return itemsPerPage;
    }

    public void setItemsPerPage(short itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Feeds{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", type='").append(this.getType()).append('\'');
        sb.append(", update=").append(this.getUpdate());
        sb.append(", startIndex=").append(this.getStartIndex());
        sb.append(", itemsPerPage=").append(this.getItemsPerPage());
        sb.append('}');
        return sb.toString();
    }
}
