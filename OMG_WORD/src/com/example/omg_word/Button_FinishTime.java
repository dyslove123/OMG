package com.example.omg_word;

import javax.security.auth.PrivateCredentialPermission;

import android.R.anim;
import android.R.integer;
import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Button_FinishTime extends LinearLayout {

	private ImageView mButtonImage = null;
	private TextView mButtonText = null;
	public Button_FinishTime(Context context,int imageResId,int textResId) {
		super(context);
		
		mButtonImage = new ImageView(context);
		mButtonText = new TextView(context);
		
		mButtonImage.setImageResource(R.drawable.down_list);
		mButtonImage.setPadding(0,0,0,0);
		
		mButtonText.setText("hi");
		mButtonText.setPadding(0, 0, 0, 0);
		
		setClickable(true); //¿Éµã»÷
		setFocusable(true); //¿É¾Û½¹
		setBackgroundResource(R.drawable.background);
		setOrientation(LinearLayout.HORIZONTAL);
		
		addView(mButtonImage);
		addView(mButtonText);
	}
	

}
