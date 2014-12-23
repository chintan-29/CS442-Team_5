package com.exercise.AndroidClient;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;

public class ColorChange {
	
	private final static String COLOR_PREFERENCES = "colorprefs";
	private final static String SETTING_CURRENT_COLOR = "currentcolor";
	private final static int NUM_COLORS = 6;
	
	private static int color;
	private static int[] colorlist = {
		0xfff00000,0xffffff00,0x800fff00,0x80000fff,0xffffffff,0x00000000
	};
	
	public static void loadColor(Context context,View v){
		SharedPreferences preferences = context.getSharedPreferences(COLOR_PREFERENCES,Context.MODE_PRIVATE);
		color=preferences.getInt(SETTING_CURRENT_COLOR, 0);
		if(color>= NUM_COLORS)
			color=0;
		v.setBackgroundColor(colorlist[color]);
	}
	
	public static void switchColor(Context context,View v){
		SharedPreferences preferences = context.getSharedPreferences(COLOR_PREFERENCES,Context.MODE_PRIVATE);
		color=preferences.getInt(SETTING_CURRENT_COLOR, 0);
		if((color += 1) >= NUM_COLORS)
			color=0;
		Editor edit = preferences.edit();
		edit.putInt(SETTING_CURRENT_COLOR, color);
		edit.commit();
		v.setBackgroundColor(colorlist[color]);	
	}
	
}
