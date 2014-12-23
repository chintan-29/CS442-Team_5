package com.exercise.AndroidClient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PptControl extends Activity {

	Button  left, right, f5,
			 esc, home, end;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pptcontrol);
		Button left = (Button) findViewById(R.id.left);
		Button right = (Button) findViewById(R.id.right);
		Button f5 = (Button) findViewById(R.id.f5);
		Button esc = (Button) findViewById(R.id.esc);
		Button home = (Button) findViewById(R.id.home);	
		Button end = (Button) findViewById(R.id.end);
		
		

		left.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Tou_Button.socket = new Socket(Tou_Button.Ip, 8888);
					Tou_Button.dataOutputStream = new DataOutputStream(
							Tou_Button.socket.getOutputStream());
					Tou_Button.dataInputStream = new DataInputStream(
							Tou_Button.socket.getInputStream());

					Tou_Button.dataOutputStream.writeInt(21);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		

		right.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Tou_Button.socket = new Socket(Tou_Button.Ip, 8888);
					Tou_Button.dataOutputStream = new DataOutputStream(
							Tou_Button.socket.getOutputStream());
					Tou_Button.dataInputStream = new DataInputStream(
							Tou_Button.socket.getInputStream());

					Tou_Button.dataOutputStream.writeInt(23);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		
		
	
		f5.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Tou_Button.socket = new Socket(Tou_Button.Ip, 8888);
					Tou_Button.dataOutputStream = new DataOutputStream(
							Tou_Button.socket.getOutputStream());
					Tou_Button.dataInputStream = new DataInputStream(
							Tou_Button.socket.getInputStream());

					Tou_Button.dataOutputStream.writeInt(35);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		
		

		esc.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Tou_Button.socket = new Socket(Tou_Button.Ip, 8888);
					Tou_Button.dataOutputStream = new DataOutputStream(
							Tou_Button.socket.getOutputStream());
					Tou_Button.dataInputStream = new DataInputStream(
							Tou_Button.socket.getInputStream());

					Tou_Button.dataOutputStream.writeInt(16);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		
		
		home.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Tou_Button.socket = new Socket(Tou_Button.Ip, 8888);
					Tou_Button.dataOutputStream = new DataOutputStream(
							Tou_Button.socket.getOutputStream());
					Tou_Button.dataInputStream = new DataInputStream(
							Tou_Button.socket.getInputStream());

					Tou_Button.dataOutputStream.writeInt(44);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		
		
		
		end.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Tou_Button.socket = new Socket(Tou_Button.Ip, 8888);
					Tou_Button.dataOutputStream = new DataOutputStream(
							Tou_Button.socket.getOutputStream());
					Tou_Button.dataInputStream = new DataInputStream(
							Tou_Button.socket.getInputStream());

					Tou_Button.dataOutputStream.writeInt(47);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		
		
	}

}
