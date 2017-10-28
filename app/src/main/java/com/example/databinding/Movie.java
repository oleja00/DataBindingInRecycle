package com.example.databinding;


public class Movie {

    public boolean isWatched;
    public String image;
    public String description;
    public String title;

    public Movie(boolean isWatched, String image, String description, String title) {
        this.isWatched = isWatched;
        this.image = image;
        this.description = description;
        this.title = title;
    }

    public boolean isWatched() {
        return isWatched;
    }

    public void setWatched(boolean watched) {
        isWatched = watched;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
