package com.example.laptop.class26picassoexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        imageView = findViewById( R.id.idImg );

        Picasso.with( this )
                .load( "https://assetsds.cdnedge.bluemix.net/sites/default/files/styles/very_big_1/public/feature/images/dhaka_35.jpg?itok=C7wQNvDH.jpg" )
                .placeholder( R.drawable.placeholder )
                .error( R.drawable.error )
                .resize( 400,400 )
                .into( imageView );


    }
}
