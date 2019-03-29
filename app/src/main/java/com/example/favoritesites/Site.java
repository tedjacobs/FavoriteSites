package com.example.favoritesites;

public class Site {
    private int id;
    private String website;
    private String url;

    public Site() {
    }

    public Site(int id, String name, String address) {
        this.id = id;
        this.website = name;
        this.url = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getWebsite() {
        return website;
    }
}
