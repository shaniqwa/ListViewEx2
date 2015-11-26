package com.mobile.shenkar.shani.listviewex2;

/**
 * Created by Shani on 11/26/15.
 */
public class TaskItem {
    private String title;
    private String 	description;

    public TaskItem( String title, String description) {
        super();
        this.description = description;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String description) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

}
