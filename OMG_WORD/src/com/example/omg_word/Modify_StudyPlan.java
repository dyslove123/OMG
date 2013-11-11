package com.example.omg_word;

import java.util.Calendar;
import java.util.Locale;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Modify_StudyPlan extends Activity {

	private Button back = null;
	private int year;
	private int month;
	private int day;
	private LinearLayout button_FinishTime = null;
	private TextView time_setting = null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.modify_studyplan);
		button_FinishTime = (LinearLayout) findViewById(R.id.finish_time_btn);
		time_setting = (TextView) findViewById(R.id.finish_time);
		// 初始化Calendar日历对象
		Calendar myCalendar = Calendar.getInstance(Locale.CHINA);

		time_setting.setText(year + "年" + (month + 1) + "月" + day + "日");

		year = myCalendar.get(Calendar.YEAR);
		month = myCalendar.get(Calendar.MONTH);
		day = myCalendar.get(Calendar.DAY_OF_MONTH);

		// 修改完成时间
		button_FinishTime.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				DatePickerDialog dpd = new DatePickerDialog(
						Modify_StudyPlan.this, DateListener, year, month, day);
				dpd.show();
			}
		});

		back.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(Modify_StudyPlan.this, Setting.class);
				startActivity(intent);
				finish();
			}
		});

	}

	private DatePickerDialog.OnDateSetListener DateListener = new DatePickerDialog.OnDateSetListener() {

		@Override
		public void onDateSet(DatePicker view, int myyear, int monthOfYear,
				int dayOfMonth) {
			// TODO Auto-generated method stub
			year = myyear;
			month = monthOfYear;
			day = dayOfMonth;
			updateDate();

		}

		// 当DatePickerDialog关闭时，更新日期显示
		private void updateDate() {
			time_setting.setText(year + "年" + (month + 1) + "月" + day + "日");
		}
	};

}
