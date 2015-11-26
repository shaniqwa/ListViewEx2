package com.mobile.shenkar.shani.listviewex2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shani on 11/26/15.
 */
public class TaskListController implements ITaskListController{

    private IDataAccess dao;
    TaskListController() {
        descriptionList = new ArrayList<String>();
        descriptionList.add("Hard snow");
        descriptionList.add("Rainy day");
        descriptionList.add("Cloudy day");
        descriptionList.add("Sunny day");
        dao = MoockDAO.getInstance();
    }
    private List<String> descriptionList;

    public List<TaskItem> GetItem() {
        return dao.GetItem();
    }
}
