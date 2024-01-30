package com.example.routeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Field;

public class contentactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contentactivity);
        String img=getIntent().getStringExtra("imgsrc");
        String txt=getIntent().getStringExtra("textimg");
        ImageView imageView = (ImageView) findViewById(R.id.img);
        TextView textview = (TextView) findViewById(R.id.txtview);
        int resId = getResources().getIdentifier(img,"drawable",this.getPackageName());
        imageView.setImageResource(resId);
        textview.setText(txt);

    }
}