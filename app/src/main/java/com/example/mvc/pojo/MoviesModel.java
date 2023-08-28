package com.example.mvc.pojo;

public class MoviesModel {

    private String tile;
    private int releaseYear;

    public MoviesModel(String tile, int releaseYear) {
        this.tile = tile;
        this.releaseYear = releaseYear;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

}
