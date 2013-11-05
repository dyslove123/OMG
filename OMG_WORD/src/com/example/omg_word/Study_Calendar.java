package com.example.omg_word;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.CalendarView.OnDateChangeListener;

public class Study_Calendar extends Activity {

	
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
	}
}
