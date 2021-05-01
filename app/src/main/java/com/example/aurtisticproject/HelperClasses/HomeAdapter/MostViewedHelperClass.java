package com.example.aurtisticproject.HelperClasses.HomeAdapter;

public class MostViewedHelperClass {

    int image;
    String title,description,designation;

    public MostViewedHelperClass(int image, String title, String designation, String description) {
        this.image = image;
        this.title = title;
        this.designation = designation;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDesignation() { return designation;}

    public void setImage(int image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

        public String getDescription() {
        return description;
    }
}
