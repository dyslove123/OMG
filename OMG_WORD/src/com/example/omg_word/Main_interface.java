package com.example.omg_word;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main_interface extends Activity {

	public void OnCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main);

		Button set = (Button) findViewById(R.id.setting);
		Button word_study = (Button) findViewById(R.id.word_study);

		set.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent();
				intent.setClass(Main_interface.this, Setting.class);
				// TODO Auto-generated method stub

				startActivity(intent);
				Main_interface.this.finish();
			}
		});

		set.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent();
				intent.setClass(Main_interface.this, Word_Study.class);
				// TODO Auto-generated method stub

				startActivity(intent);
				Main_interface.this.finish();
			}
		});

	}

}
