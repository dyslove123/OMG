package com.example.omg_word;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;

public class Welcome extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
		new CountDownTimer(2000,1000) {
			@Override
			public void onTick(long millisUntilFinished) { }
			
			@Override
			public void onFinish() {
				Intent intent = new Intent();
				intent.setClass(Welcome.this, Main_interface.class);
				Welcome.this.overridePendingTransition(R.layout.alpha_in, R.layout.alpha_out);  
                finish();
				startActivity(intent);
                    
			} 
                
			
		}.start();
		
	}
}
