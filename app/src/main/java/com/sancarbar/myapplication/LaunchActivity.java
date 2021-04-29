package com.sancarbar.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


public class LaunchActivity
        extends AppCompatActivity
{


    @Override
    protected void onCreate( @Nullable Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        Storage storage = new Storage( this );
        if ( storage.containsToken() )
        {
            startActivity( new Intent( this, MainActivity.class ) );
        }
        else
        {
            startActivity( new Intent( this, LoginActivity.class ) );
        }
        finish();
    }
}
