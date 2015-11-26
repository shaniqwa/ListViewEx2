package com.mobile.shenkar.shani.listviewex2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shani on 11/26/15.
 */
public class MoockDAO implements IDataAccess {

    private List<String> descriptionList;
    private String[] titles = new String[] { "Buy Gift", "Important Call", "Buy Food",
            "Buy Concert Tickets", "Finish Homework", "Set a Meeting"};
    private String[] description = new String[] { "Buy birthday gift to my sister", "Call my boss", "tomatoes, cucumbers, carrots",
            "Ott 10.12 50$", "Mobile Ex2", "Meet Sam"};

    private static MoockDAO instance;

    private MoockDAO() {
//        descriptionList = new ArrayList<String>();

    }

    /*
     * Single tone implement.
     */
    public static MoockDAO getInstance()
    {
        if(instance ==  null)
            instance = new MoockDAO();
        return instance;
    }

    public List<TaskItem> GetItem() {
        List<TaskItem> TaskList = new ArrayList<TaskItem>();
        for (int i = 0; i < 6; i++) {
            TaskItem item = new TaskItem(titles[i], description[i]);
            TaskList.add(item);
        }
        return TaskList;
    }


}
