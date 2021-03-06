package com.example.administrator.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/11/13.
 */

public class ItemAdapter extends ArrayAdapter<Item>{

    private int resourceId;

    public ItemAdapter(Context context, int textViewResourceId, List<Item> objects){
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Item item = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent,false);
        ImageView itemImage = (ImageView) view.findViewById(R.id.list_image);
        TextView itemName = (TextView) view.findViewById(R.id.list_name);
        itemImage.setImageResource(item.getImageId());
        itemName.setText(item.getName());
        return view;
    }
}
