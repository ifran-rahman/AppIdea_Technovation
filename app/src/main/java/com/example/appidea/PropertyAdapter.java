package com.example.appidea;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class PropertyAdapter extends ArrayAdapter<Property> {

    public PropertyAdapter(@NonNull Context context, @NonNull List<Property> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View listItemView = convertView;

        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Property currentProperty = getItem(position);

        TextView rent_text_view = (TextView)listItemView.findViewById(R.id.Rent);
        TextView location_text_view = (TextView)listItemView.findViewById(R.id.location);

        rent_text_view.setText(currentProperty.getRent());
        location_text_view.setText(currentProperty.getLocation());

        return listItemView;
    }
}
