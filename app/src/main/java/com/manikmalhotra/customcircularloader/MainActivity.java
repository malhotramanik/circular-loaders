package com.manikmalhotra.customcircularloader;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.manikmalhotra.loaders.RotateImageLoader;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RotateImageLoader loader=new RotateImageLoader(this,getResources().getDrawable(R.drawable.load));
        loader.show();
        loader.setCancelable(false);
    }
}
