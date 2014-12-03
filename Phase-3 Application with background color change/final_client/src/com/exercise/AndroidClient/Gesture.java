package com.exercise.AndroidClient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.widget.TextView;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

//import android.app.Activity;
import android.content.Intent;
//import android.os.Bundle;
//import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

public class Gesture extends Activity {
	public GestureDetector gestureDetector;
TextView gestureEvent;
public static String Ip;
public static Socket socket = null;
public static DataOutputStream dataOutputStream = null;
public static DataInputStream dataInputStream = null;

   /** Called when the activity is first created. */
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.gesture);
       gestureEvent = (TextView)findViewById(R.id.gesture);
       gestureDetector= new GestureDetector(this ,new simpleOnGestureListener());
   }
  
   @Override
  
public boolean onTouchEvent(MotionEvent event) {
 // TODO Auto-generated method stub
	 
		
    return gestureDetector.onTouchEvent(event);
}

   class simpleOnGestureListener extends GestureDetector.SimpleOnGestureListener{
	
 @Override
 
 public boolean onDoubleTap(MotionEvent e) {
  // TODO Auto-generated method stub
	 try {
		    Intent i = getIntent();
	       
	        final String Ip = i.getStringExtra("Ip");
	      	
		    socket = new Socket(Ip,8888);
			dataOutputStream = new DataOutputStream(socket.getOutputStream());
			dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream.writeInt(5);		
	     	//dataOutputStream.writeUTF(textOut.getText().toString());
		    } 
		  catch (UnknownHostException e1)
		    {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		    }
		  catch (IOException e2) 
		    {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		    } finally {
			}
  gestureEvent.setText("onDoubleTap: \n" + e.toString());
  return super.onDoubleTap(e);
 }

 @Override
 public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
   float velocityY) {
	
	 // TODO Auto-generated method stub
  float x1=e1.getX();
  float y1=e1.getY();
  float x2=e2.getX();
  float y2=e2.getY();

	try {
		
		Intent i = getIntent();
	       
        final String Ip = i.getStringExtra("Ip");
      	
	    socket = new Socket(Ip,8888);
		dataOutputStream = new DataOutputStream(socket.getOutputStream());
		dataInputStream = new DataInputStream(socket.getInputStream());
        dataOutputStream.writeInt(1);		
		dataOutputStream.writeFloat(x2-x1);
		dataOutputStream.writeFloat(y2-y1);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 gestureEvent.setText("onfling: \n" + e1.toString()+"\n"+e2.toString());
  return super.onFling(e1, e2, velocityX, velocityY);
 }

 @Override
 public void onLongPress(MotionEvent e) {
  // TODO Auto-generated method stub
	 try {
		    Intent i = getIntent();
	       
	        final String Ip = i.getStringExtra("Ip");
	      	
		    socket = new Socket(Ip,8888);
			dataOutputStream = new DataOutputStream(socket.getOutputStream());
			dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream.writeInt(3);		
	     	//dataOutputStream.writeUTF(textOut.getText().toString());
		    } 
		  catch (UnknownHostException e1)
		    {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		    }
		  catch (IOException e2) 
		    {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		    } finally {
			}

  gestureEvent.setText("onLongPress: \n" + e.toString());
  super.onLongPress(e);
 }

 @Override
 public boolean onSingleTapConfirmed(MotionEvent e) {
  // TODO Auto-generated method stub
	 try {
		    Intent i = getIntent();
	       
	        final String Ip = i.getStringExtra("Ip");
	      	
		    socket = new Socket(Ip,8888);
			dataOutputStream = new DataOutputStream(socket.getOutputStream());
			dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream.writeInt(4);		
	     	//dataOutputStream.writeUTF(textOut.getText().toString());
		    } 
		  catch (UnknownHostException e1)
		    {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		    }
		  catch (IOException e2) 
		    {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		    } finally {
			}
  return super.onSingleTapConfirmed(e);
 }

   };
  
   
}