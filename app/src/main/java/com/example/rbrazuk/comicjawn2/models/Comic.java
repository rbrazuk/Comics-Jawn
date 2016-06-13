package com.example.rbrazuk.comicjawn2.models;

public abstract class Comic {

    private String mSeries;
    private String mPublisher;
    private String mWriter;
    private String mArtist;

    public boolean isOwned() {
        return mOwned;
    }

    public void setOwned(boolean owned) {
        mOwned = owned;
    }

    private boolean mOwned;

    public String getSeries() {
        return mSeries;
    }

    public void setSeries(String series) {
        mSeries = series;
    }

    public String getPublisher() {
        return mPublisher;
    }

    public void setPublisher(String publisher) {
        mPublisher = publisher;
    }

    public String getWriter() {
        return mWriter;
    }

    public void setWriter(String writer) {
        mWriter = writer;
    }

    public String getArtist() {
        return mArtist;
    }

    public void setArtist(String artist) {
        mArtist = artist;
    }
}
