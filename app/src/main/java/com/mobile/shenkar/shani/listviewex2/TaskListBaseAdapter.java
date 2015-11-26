package com.mobile.shenkar.shani.listviewex2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Shani on 11/26/15.
 */
public class TaskListBaseAdapter  extends BaseAdapter {
    public TaskListBaseAdapter(Context context, List<TaskItem> items) {
        this.items = items;
        this.context = context;
    }

    static class ViewHolder {
        TextView tv_title;
        TextView tv_description;
    }

    private Context context;
    private List<TaskItem> items;

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        if (this.items != null && items.size() > position)
            return this.items.get(position);
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(
                    R.layout.list_view_item, null);
            holder = new ViewHolder();
            holder.tv_title = (TextView) convertView
                    .findViewById(R.id.textView_title);
            holder.tv_description = (TextView) convertView
                    .findViewById(R.id.textView_description);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tv_title.setText(items.get(position).getTitle());
        holder.tv_description.setText(items.get(position).getDescription());
        return convertView;
    }

}
