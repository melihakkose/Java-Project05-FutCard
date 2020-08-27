package com.melihakkose.andoruidstudio_java_project05_futcard;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<FootBallPlayer> {

    /* ADAPTER CONSTRUCTOR
    public CustomAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }
     */

    // CUSTOM ADAPTER

    private ArrayList<FootBallPlayer> players;
    private Activity context;

    public CustomAdapter(ArrayList<FootBallPlayer> players,Activity context){
        super(context,R.layout.custom_view,players);
        this.context=context;
        this.players=players;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater=context.getLayoutInflater();
        View customView=layoutInflater.inflate(R.layout.custom_view,null,true);

        TextView nameView=customView.findViewById(R.id.customTextView);
        nameView.setText(players.get(position).getName());

        return customView;
    }
}
