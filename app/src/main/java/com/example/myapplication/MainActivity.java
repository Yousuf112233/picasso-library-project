package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {


  ImageView image1;
   Button button;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        image1=findViewById(R.id.image1);
        button=findViewById(R.id.button);



     Picasso.get()
             .load("https://scontent.fdac4-1.fna.fbcdn.net/v/t39.30808-6/342340725_1206213126765568_3503531080032844726_n.jpg?stp=c563.0.923.923a_dst-jpg_s851x315&_nc_cat=103&ccb=1-7&_nc_sid=0df3a7&_nc_eui2=AeH8kdEV9COG1NziTt0VAEe-gWgfZvNesbqBaB9m816xuqQm1-rpq-N8vT9GDiHLJzAwAjPjD1o--wKD-z77bi9D&_nc_ohc=pju5FCi1qLkAX_Ow09j&_nc_zt=23&_nc_ht=scontent.fdac4-1.fna&oh=00_AfD2D9kUbtRAl1ErzvtGBmCCgjzt_ES0yWkqUqwM7BILlQ&oe=6510CCD8")
             .into(image1);




    }
}