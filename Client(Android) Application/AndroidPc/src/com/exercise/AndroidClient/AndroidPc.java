package com.exercise.AndroidClient;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AndroidPc extends Activity {
	
	EditText textOut, ip;
	TextView textIn;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        ip = (EditText)findViewById(R.id.ip);
        Button buttonSend = (Button)findViewById(R.id.connect);
       // textIn = (TextView)findViewById(R.id.textin);
        buttonSend.setOnClickListener(buttonSendOnClickListener);
        
    }
    
    Button.OnClickListener buttonSendOnClickListener = new Button.OnClickListener()
    {
    
		public void onClick(View arg0) 
		  {
			// TODO Auto-generated method stub
		
	    	 final String Ip=ip.getText().toString();
		     Intent i=new Intent("com.exercise.AndroidClient.TOU_BUTTON");
		     i.putExtra("Ip", Ip);
		     startActivity(i);
			
		 }
	 };
}
