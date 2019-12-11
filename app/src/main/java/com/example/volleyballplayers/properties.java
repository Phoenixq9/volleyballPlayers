package com.example.volleyballplayers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class properties extends AppCompatActivity {
ImageView imagePicture;
TextView textName;
TextView textAge;
TextView textLength;
TextView textPosition;
TextView textCountry;
ImageView imageFlag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_properties);

        imagePicture=findViewById(R.id.imageView);
        textName=findViewById(R.id.textName);
        textAge=findViewById(R.id.textAge);
        textLength=findViewById(R.id.textLength);
        textPosition=findViewById(R.id.textPosition);
        textCountry=findViewById(R.id.textCountry);
        imageFlag=findViewById(R.id.imageFlag);


        Intent intent=getIntent();
       Players select=(Players) intent.getSerializableExtra("key");

        Bitmap bitmap= BitmapFactory.decodeResource(getApplicationContext().getResources(),select.getPictureInteger());
        imagePicture.setImageBitmap(bitmap);
        Bitmap bitmapl= BitmapFactory.decodeResource(getApplicationContext().getResources(),select.getPictureFlag());
        imageFlag.setImageBitmap(bitmapl);



       textName.setText(select.getName());
       textAge.setText(select.getAge());
        textLength.setText(select.getLength());
       textPosition.setText(select.getPosition());
       textCountry.setText(select.getCountry());

   }
}
