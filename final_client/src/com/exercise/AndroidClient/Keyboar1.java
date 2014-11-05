package com.exercise.AndroidClient;


	//package com.exercise.AndroidClient;

	import java.io.DataInputStream;
	import java.io.DataOutputStream;
	import java.io.IOException;
	import java.net.Socket;
	import java.net.UnknownHostException;
	import android.content.Intent;
	import android.os.Bundle;
	import android.app.Activity;
	
    //import android.text.Editable;
    import android.text.*;
	import android.view.View;
	import android.widget.Button;
	import android.widget.EditText;
import android.widget.TextView;


	public class Keyboar1  extends Activity 
	{


		//int i=0;
		EditText textOut, ip;
		TextView textIn;
		Button buttonSend;
	    /** Called when the activity is first created. */
	    @Override
	
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.keyboard);
	        Intent i=getIntent();
	        final  String Ip=i.getStringExtra("Ip");
	        System.out.println(""+Ip);
	        textOut = (EditText)findViewById(R.id.textout);
	       // ip = (EditText)findViewById(R.id.ip);
	        //buttonSend = (Button)findViewById(R.id.send);
	        //textOut = (TextView)findViewById(R.id.textin);
	        textOut.addTextChangedListener(new TextWatcher()
	        {
	            public void afterTextChanged(Editable s) {
	              
	              //  tv.setText(String.valueOf(i) + " / " + String.valueOf(charCounts));
	            }
	        
	            public void beforeTextChanged(CharSequence s, int start, int count, int after){}
	            public void onTextChanged(CharSequence s, int start, int before, int count)
	            {
	            //	int textCount = textIn.getText().length();
	            	
	            	//System.out.println("len:"+textCount);

					Socket socket = null;
					DataOutputStream dataOutputStream = null;
					DataInputStream dataInputStream = null;
				    System.out.println(""+Ip);
					try {
						socket = new Socket(Ip,8888);
						dataOutputStream = new DataOutputStream(socket.getOutputStream());
						dataInputStream = new DataInputStream(socket.getInputStream());
                        dataOutputStream.writeBoolean(true);		
				     	dataOutputStream.writeUTF(textOut.getText().toString());
					    				     	
//				     	textIn.setText(dataInputStream.readUTF());
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
					    }
					finally
					{
						if (socket != null)
						{
							try {
								socket.close();
							    } 
						    catch (IOException e)
						        {
								// TODO Auto-generated catch block
								e.printStackTrace();
							    }
						}
						
						if (dataOutputStream != null)
						 {
							try {
								dataOutputStream.close();
							    } 
							catch (IOException e) 
							    {
								// TODO Auto-generated catch block
								e.printStackTrace();
							    }
						}
						
						if (dataInputStream != null)
						{
							try {
								dataInputStream.close();
							    } 
						    catch (IOException e)
						        {
								// TODO Auto-generated catch block
								e.printStackTrace();
							    }
						}
					}
	            }
	        
	        
	        
	        
	        }); 

	  
				
			
	    }
	}
		
