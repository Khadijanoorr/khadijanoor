package com.example.khadijanoor;

public class Model {
    String headerTitle;
    String description;
    int imagreName;

    public Model() {
    }

    public Model(String headerTitle, String description, int imagreName) {
        this.headerTitle = headerTitle;
        this.description = description;
        this.imagreName = imagreName;

    }

    public String getHeaderTitle() {
        return headerTitle;
    }

    public void setHeaderTitle(String headerTitle) {
        this.headerTitle = headerTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImagreName() {
        return imagreName;
    }

    public void setImagreName(int imagreName) {
        this.imagreName = imagreName;
    }
}