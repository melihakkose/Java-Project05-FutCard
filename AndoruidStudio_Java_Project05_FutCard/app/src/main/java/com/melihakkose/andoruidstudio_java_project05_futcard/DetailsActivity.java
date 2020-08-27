package com.melihakkose.andoruidstudio_java_project05_futcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //ELEMENTLERI TANITIYORUZ
        ImageView imageView =findViewById(R.id.imageView);
        TextView nameTextView =findViewById(R.id.nameTextView);
        TextView ageTextView =findViewById(R.id.ageTextView);
        TextView teamTextView =findViewById(R.id.teamTextView);
        TextView positionTextView =findViewById(R.id.positionTextView);
        TextView overallTextView =findViewById(R.id.overallTextView);

        Intent intent=getIntent();
        FootBallPlayer selectedPlayer=(FootBallPlayer) intent.getSerializableExtra("selectedPlayer");

        //ESKI YONTEM ILE RESIM SAKLAMA
        Bitmap bitmap = BitmapFactory.decodeResource(getApplication().getResources(),selectedPlayer.getPicInteger());
        imageView.setImageBitmap(bitmap);

        nameTextView.setText("Name: "+selectedPlayer.getName());
        ageTextView.setText("Overall: "+Integer.toString(selectedPlayer.getAge()));
        teamTextView.setText("Team: "+selectedPlayer.getTeam());
        positionTextView.setText("Position: "+selectedPlayer.getPosition());
        overallTextView.setText("Overall: "+Integer.toString(selectedPlayer.getOverall()));





    }
}