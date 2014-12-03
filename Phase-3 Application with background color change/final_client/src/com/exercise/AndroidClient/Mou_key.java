package com.exercise.AndroidClient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Mou_key extends Activity 
{


	
	EditText textOut, ip;
	TextView textIn;
	Intent recreat;
	Button buttonSend,Up,Down,Left,Right,leftclick,rightclick;
	public static String Ip;
	public static Socket socket = null;
	public static DataOutputStream dataOutputStream = null;
	public static DataInputStream dataInputStream = null;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.mouse);
    
    	 Intent i = getIntent();
      
         final String Ip = i.getStringExtra("Ip");
         System.out.println(""+Ip);
       
         textOut = (EditText)findViewById(R.id.textout);
		 Up=(Button)findViewById(R.id.up);
		 Down=(Button)findViewById(R.id.down);
		 Left=(Button)findViewById(R.id.left);
		 Right=(Button)findViewById(R.id.right);
		 leftclick=(Button)findViewById(R.id.leftclick);
		 rightclick=(Button)findViewById(R.id.rightclick);
		
		 textOut.addTextChangedListener(new TextWatcher()
		    {
		        public void afterTextChanged(Editable s) {
		        	
		              }
		    
		        public void beforeTextChanged(CharSequence s, int start, int count, int after){}
		        public void onTextChanged(CharSequence s, int start, int before, int count)
		        {
		        
		        	
		    
					try {
						socket = new Socket(Ip,8888);
						dataOutputStream = new DataOutputStream(socket.getOutputStream());
						dataInputStream = new DataInputStream(socket.getInputStream());
                        dataOutputStream.writeBoolean(true);		
				     	dataOutputStream.writeUTF(textOut.getText().toString());
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
		        }		
		    });  
			
				  Up.setOnClickListener(new OnClickListener() {  
					  
		             public void onClick(View v) {  
		             	 try {
		             		socket = new Socket(Ip,8888);
							dataOutputStream = new DataOutputStream(socket.getOutputStream());
							dataInputStream = new DataInputStream(socket.getInputStream()); 
		             	    dataOutputStream.writeBoolean(false);
		      				dataOutputStream.writeInt(0);
		      			
		      			    finish();
		      			    startActivity(getIntent());

		      			} catch (IOException e1) {
		      				// TODO Auto-generated catch block
		      				e1.printStackTrace();
		      			}
		             }  
		             //starActivity(r);
		         });
		      // dataOutputStream.writeUTF("a");
		        
		         Down.setOnClickListener(new OnClickListener() {  
		             public void onClick(View v) {  
		             	 try {
		             		 socket = new Socket(Ip,8888);
							 dataOutputStream = new DataOutputStream(socket.getOutputStream());
							 dataInputStream = new DataInputStream(socket.getInputStream());
		             		 dataOutputStream.writeBoolean(false);
		      				 dataOutputStream.writeInt(1);
		      			     finish();
		      			     startActivity(getIntent());

		      			} catch (IOException e1) {
		      				// TODO Auto-generated catch block
		      				e1.printStackTrace();
		      			}
		             }  
		         });  
		       
		         Left.setOnClickListener(new OnClickListener() {  
		             public void onClick(View v) {  
		             	 try {
		             		 socket = new Socket(Ip,8888);
			       			 dataOutputStream = new DataOutputStream(socket.getOutputStream());
							 dataInputStream = new DataInputStream(socket.getInputStream());
		             		 dataOutputStream.writeBoolean(false);
		             		 dataOutputStream.writeInt(2);
		      				//Intent intent = getIntent();
		      			    finish();
		      			    startActivity(getIntent());

		      			} catch (IOException e1) {
		      				// TODO Auto-generated catch block
		      				e1.printStackTrace();
		      			}
		             }  
		         });  
		        
		         Right.setOnClickListener(new OnClickListener() {  
		             public void onClick(View v) {  
		             	 try {
		             		 socket = new Socket(Ip,8888);
						     dataOutputStream = new DataOutputStream(socket.getOutputStream());
							 dataInputStream = new DataInputStream(socket.getInputStream());
		             		 dataOutputStream.writeBoolean(false); 
		      				 dataOutputStream.writeInt(3);
		      				//Intent intent = getIntent();
		      			    finish();
		      			    startActivity(getIntent());

		      			} catch (IOException e1) {
		      				// TODO Auto-generated catch block
		      				e1.printStackTrace();
		      			}
		             }  
		         });  
		        
		         leftclick.setOnClickListener(new OnClickListener() {  
		             public void onClick(View v) {  
		             	 try {
		             		  socket = new Socket(Ip,8888);
							  dataOutputStream = new DataOutputStream(socket.getOutputStream());
							  dataInputStream = new DataInputStream(socket.getInputStream());
		             		  dataOutputStream.writeBoolean(false);
		             		  dataOutputStream.writeInt(4);
		      				//Intent intent = getIntent();
		      			    finish();
		      			    startActivity(getIntent());

		      			} catch (IOException e1) {
		      				// TODO Auto-generated catch block
		      				e1.printStackTrace();
		      			}
		             }  
		         });  
		      
		         rightclick.setOnClickListener(new OnClickListener() {  
		             public void onClick(View v) 
		             {  
		             	 try {
		             		  socket = new Socket(Ip,8888);
							  dataOutputStream = new DataOutputStream(socket.getOutputStream());
							  dataInputStream = new DataInputStream(socket.getInputStream());
		             		  dataOutputStream.writeBoolean(false);
		             		  dataOutputStream.writeInt(5);
		             		
		             	      finish();
		             	      startActivity(getIntent());

		      			     } 
		             	 catch (IOException e1) 
		             	 {
		      				// TODO Auto-generated catch block
		      				e1.printStackTrace();
		      			 }
		             }  
		         });
	
 

    }
}
 



	
		
