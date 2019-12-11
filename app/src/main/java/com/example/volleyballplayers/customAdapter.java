package com.example.volleyballplayers;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class customAdapter extends ArrayAdapter<Players> {
    private ArrayList<Players> players;
    private Activity context;


    public customAdapter(ArrayList<Players> players, Activity context) {
        super(context,R.layout.customview,players);
        this.players=players;
        this.context=context;

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater=context.getLayoutInflater();
        View customView=layoutInflater.inflate(R.layout.customview,null,true);


        TextView textView=customView.findViewById(R.id.customTextView);
        textView.setText(players.get(position).getName());
        return  customView;
    }
}