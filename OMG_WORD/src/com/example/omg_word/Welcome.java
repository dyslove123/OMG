package com.example.omg_word;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class Welcome extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        Thread thread = new Thread() {
        	@Override
        	public void run() {
        	try {
        	sleep(3000);
        	} catch (InterruptedException e) {

        	e.printStackTrace();
        	}
        	finish();
        	Intent intent = new Intent(Welcome.this, Main_interface.class);
        	startActivity(intent);
        	}
        	};

        	thread.start();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.welcome, menu);
        return true;
    }
    
}
