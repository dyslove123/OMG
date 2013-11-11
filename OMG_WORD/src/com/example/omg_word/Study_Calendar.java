package com.example.omg_word;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.CalendarView.OnDateChangeListener;

public class Study_Calendar extends Activity {

	Button back = null;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.study_calendar);
		
		TextView date_of_today = (TextView)findViewById(R.id.calendar_date);
		CalendarView calendarView = (CalendarView) findViewById(R.id.study_calendar);
		calendarView.setOnDateChangeListener(new OnDateChangeListener() {
			
			@Override
			public void onSelectedDayChange(CalendarView view, int year, int month,
					int dayOfMonth) {
				// TODO Auto-generated method stub
				String date = year + "-" + month + "-" + dayOfMonth;
				
			}
		});
		
		back = (Button)findViewById(R.id.calendar_back);
		back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(Study_Calendar.this,Main_interface.class);
				startActivity(intent);
				Study_Calendar.this.finish();
				
			}
		});
		
	}
}
