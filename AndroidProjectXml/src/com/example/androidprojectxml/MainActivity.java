package com.example.androidprojectxml;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

	Button c1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	

	Button c1=(Button)findViewById(R.id.connect);
	c1.setOnClickListener(new Button.OnClickListener() {
		
		public void onClick(View v) {
			
			
	        Intent 	i = new Intent(MainActivity.this,Touch.class);
			startActivity(i); 
			
		}
	});
	
	
	
	
	}
	
	
	
	}
