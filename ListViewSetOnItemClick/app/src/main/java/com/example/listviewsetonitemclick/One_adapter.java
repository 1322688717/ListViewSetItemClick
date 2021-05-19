package com.example.listviewsetonitemclick;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class One_adapter extends BaseAdapter {
    private Context context;
    private List<One_msg> list;

    public One_adapter(Context context, List<One_msg> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.item_one,null);
        One_msg m = list.get(position);
        TextView shebei = convertView.findViewById(R.id.tv_name);
        shebei.setText(m.getShebei());

        return convertView;
    }
}
