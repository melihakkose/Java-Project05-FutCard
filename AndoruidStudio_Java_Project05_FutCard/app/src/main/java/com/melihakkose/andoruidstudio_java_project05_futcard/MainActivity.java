package com.melihakkose.andoruidstudio_java_project05_futcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=findViewById(R.id.listView);

        FootBallPlayer p1= new FootBallPlayer("Lionel Messi","Barcelona FC","Right Winger",R.drawable.mmessi,93,33);
        FootBallPlayer p2= new FootBallPlayer("Cristiano Ronaldo","Juventus FC","Left Winger",R.drawable.ronaldo,92,35);
        FootBallPlayer p3= new FootBallPlayer("Paulo Dybala","Juventus FC","Second Striker",R.drawable.ddybala,87,26);
        FootBallPlayer p4= new FootBallPlayer("Ricardo Quaresma","Altay FC","Right Winger",R.drawable.quaresma,79,36);
        FootBallPlayer p5= new FootBallPlayer("Muhammed Salah","Liverpool FC","Right Winger",R.drawable.salah,89,28);

        final ArrayList<FootBallPlayer> playerList =new ArrayList<>();
        playerList.add(p1);
        playerList.add(p2);
        playerList.add(p3);
        playerList.add(p4);
        playerList.add(p5);

        /*
        ArrayAdapter arrayAdapter=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,playerList);
        */

        //Custom ADapter
        CustomAdapter customAdapter=new CustomAdapter(playerList,MainActivity.this);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("selectedPlayer",playerList.get(i));
                startActivity(intent);
            }
        });



    }
}