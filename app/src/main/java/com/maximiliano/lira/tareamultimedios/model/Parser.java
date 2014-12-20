package com.maximiliano.lira.tareamultimedios.model;

/**Metodos para retornar los valores dentro del json
 * Created by max on 19-12-14.
 */


public class Parser {
    private String title, thumbnailUrl;
    private String points;

    public Parser() {
    }

    public Parser(String name, String thumbnailUrl, String points) {
        this.title = name;
        this.thumbnailUrl = thumbnailUrl;
        this.points = points;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }



    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }



}

