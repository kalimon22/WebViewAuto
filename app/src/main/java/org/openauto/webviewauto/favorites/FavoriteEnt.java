package org.openauto.webviewauto.favorites;

public class FavoriteEnt {
    private String id;
    private String url;
    private String title;

    public FavoriteEnt(String id, String url, String title) {
        this.id = id;
        this.url = url;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
