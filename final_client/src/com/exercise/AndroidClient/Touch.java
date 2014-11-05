package com.exercise.AndroidClient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Touch extends Activity {
 
TextView textEvent, textX, textY,touchpad;
public static String Ip;
public static Socket socket = null;
public static DataOutputStream dataOutputStream = null;
public static DataInputStream dataInputStream = null;

   /** Called when the activity is first created. */
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.touch);
    //   LinearLayout MainLayout = (LinearLayout)findViewById(R.id.mainlayout);
      
       touchpad= (TextView)findViewById(R.id.t);
       touchpad.setOnTouchListener(OnTouchListener);
   }
   
   private View.OnTouchListener OnTouchListener= new View.OnTouchListener(){
	   float x,y;
 public boolean onTouch(View view, MotionEvent motionEvent) {
  // TODO Auto-generated method stub

	 Intent i = getIntent();
  
     final String Ip = i.getStringExtra("Ip");
		try {
			socket = new Socket(Ip,8888);
			dataOutputStream = new DataOutputStream(socket.getOutputStream());
			dataInputStream = new DataInputStream(socket.getInputStream());
         //   dataOutputStream.writeBoolean(true);		
	     	//dataOutputStream.writeUTF(textOut.getText().toString());
		    } 
		  catch (UnknownHostException e)
		    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
		  catch (IOException e) 
		    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    } finally {
			}
  
  textX.setText("x: " + String.valueOf(motionEvent.getX()));
  textY.setText("y: " + String.valueOf(motionEvent.getY()));
  
  int action = motionEvent.getAction();
 
  switch (action){
  case MotionEvent.ACTION_DOWN:
   textEvent.setText("ACTION_DOWN");
	try {
		 dataOutputStream.writeInt(0);
		 x= motionEvent.getX();
		 y= motionEvent.getY();
	  // dataOutputStream.writeFloat(x);
	  // dataOutputStream.writeFloat(y);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   
   //break;
  case MotionEvent.ACTION_MOVE:
   textEvent.setText("ACTION_MOVE");
  try {
       final float tempx= motionEvent.getX();
	   final   float tempy= motionEvent.getY(); 
	    dataOutputStream.writeInt(1);
		dataOutputStream.writeFloat(tempx-x);
		dataOutputStream.writeFloat(tempy-y);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   break;
  case MotionEvent.ACTION_UP:
   textEvent.setText("ACTION_UP");
 try {
	   dataOutputStream.writeInt(2);
	   //dataOutputStream.writeFloat(motionEvent.getX());
	   //dataOutputStream.writeFloat(motionEvent.getY());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   break;
  case MotionEvent.ACTION_CANCEL:
   textEvent.setText("ACTION_CANCEL");
   break;
  default:
   textEvent.setText("Unknown!");
  }
 
  return true; //means event have been processed
 }
    
   };
}