package com.mobile.shenkar.shani.listviewex2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.mobile.shenkar.shani.MESSAGE";
    private ITaskListController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controller =  new TaskListController();
        ListView lv = (ListView) findViewById(R.id.TaskListView);
        if(lv!=null)
        {
            TaskListBaseAdapter adapter = new TaskListBaseAdapter(this, controller.GetItem());
            lv.setAdapter(adapter);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {
                    Toast.makeText(MainActivity.this, "Item number " + (position + 1) + " was clicked", Toast.LENGTH_LONG).show();
                }
            });
        }
    }

    //go to AddTaskActivity
    public void addNewTask(View view){
//        Intent intent = new Intent(this,AddTaskActivity.class);
//        EditText editText = (EditText) findViewById(R.id.edit_message);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);
        startActivity(new Intent(getApplicationContext(), AddTaskActivity.class));
    }
}

