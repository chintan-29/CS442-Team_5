package com.exercise.AndroidClient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import com.exercise.AndroidClient.Gesture.simpleOnGestureListener;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;

@SuppressLint("NewApi") public class Tou_Button extends Activity {

	TextView textOut, textX, textY, touchpad;
	Button Leftclick, Rigthclick, spec;
	ImageButton colorChange, keyBoardHide, pptControl;
	public static String Ip;
	public static Socket socket = null;
	public static DataOutputStream dataOutputStream = null;
	public static DataInputStream dataInputStream = null;
	public GestureDetector gestureDetector;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.touch);
		Intent i = getIntent();
		Ip = i.getStringExtra("Ip");
		textOut = (EditText) findViewById(R.id.textout);
		Button Rightclick = (Button) findViewById(R.id.rightclick);
		Button Leftclick = (Button) findViewById(R.id.leftclick);
		Button spec = (Button) findViewById(R.id.spec);
		final ToggleButton shift = (ToggleButton) findViewById(R.id.shift);
		final ToggleButton ctrl = (ToggleButton) findViewById(R.id.ctrl);
		final ToggleButton alt = (ToggleButton) findViewById(R.id.alt);
		colorChange = (ImageButton)findViewById(R.id.colorbutton);
		keyBoardHide = (ImageButton)findViewById(R.id.keyboardbutton);
		pptControl = (ImageButton)findViewById(R.id.pptbutton);
		touchpad = (TextView) findViewById(R.id.t);
		ColorChange.loadColor(getApplicationContext(),touchpad);
		touchpad.setOnTouchListener(OnTouchListener);

		spec.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent("com.exercise.AndroidClient.SPECKEY");
				startActivity(i);
			}
		});

		shift.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (shift.isChecked()) {
					try {
						socket = new Socket(Ip, 8888);
						dataOutputStream = new DataOutputStream(socket
								.getOutputStream());
						dataInputStream = new DataInputStream(socket
								.getInputStream());

						dataOutputStream.writeInt(9);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else {

					try {
						socket = new Socket(Ip, 8888);
						dataOutputStream = new DataOutputStream(socket
								.getOutputStream());
						dataInputStream = new DataInputStream(socket
								.getInputStream());

						dataOutputStream.writeInt(10);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			}
		});

		ctrl.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (ctrl.isChecked()) {
					try {
						socket = new Socket(Ip, 8888);
						dataOutputStream = new DataOutputStream(socket
								.getOutputStream());
						dataInputStream = new DataInputStream(socket
								.getInputStream());

						dataOutputStream.writeInt(11);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else {

					try {
						socket = new Socket(Ip, 8888);
						dataOutputStream = new DataOutputStream(socket
								.getOutputStream());
						dataInputStream = new DataInputStream(socket
								.getInputStream());

						dataOutputStream.writeInt(12);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			}
		});
		alt.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (alt.isChecked()) {
					try {
						socket = new Socket(Ip, 8888);
						dataOutputStream = new DataOutputStream(socket
								.getOutputStream());
						dataInputStream = new DataInputStream(socket
								.getInputStream());

						dataOutputStream.writeInt(13);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else {

					try {
						socket = new Socket(Ip, 8888);
						dataOutputStream = new DataOutputStream(socket
								.getOutputStream());
						dataInputStream = new DataInputStream(socket
								.getInputStream());

						dataOutputStream.writeInt(14);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			}
		});

		gestureDetector = new GestureDetector(this,
				new simpleOnGestureListener());
		textOut.addTextChangedListener(new TextWatcher() {
			public void afterTextChanged(Editable s) {
			}

			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
			}

			public void onTextChanged(CharSequence s, int start, int before,
					int count) {
				System.out.println("" + Ip);
				try {
					socket = new Socket(Ip, 8888);
					dataOutputStream = new DataOutputStream(socket
							.getOutputStream());
					dataInputStream = new DataInputStream(socket
							.getInputStream());
					dataOutputStream.writeInt(6);
					dataOutputStream.writeUTF(textOut.getText().toString());
				} catch (UnknownHostException e1) {
					e1.printStackTrace();
				} catch (IOException e2) {
					e2.printStackTrace();
				} finally {
					if (socket != null) {
						try {
							socket.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}

					if (dataOutputStream != null) {
						try {
							dataOutputStream.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}

					if (dataInputStream != null) {
						try {
							dataInputStream.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				}
			}

		});
		Leftclick.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				try {
					socket = new Socket(Ip, 8888);
					dataOutputStream = new DataOutputStream(socket
							.getOutputStream());
					dataInputStream = new DataInputStream(socket
							.getInputStream());

					dataOutputStream.writeInt(5);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});

		Rightclick.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				try {
					socket = new Socket(Ip, 8888);
					dataOutputStream = new DataOutputStream(socket
							.getOutputStream());
					dataInputStream = new DataInputStream(socket
							.getInputStream());

					dataOutputStream.writeInt(3);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});
		
		colorChange.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				ColorChange.switchColor(Tou_Button.this, touchpad);
			}
			
		});
		
		keyBoardHide.setOnClickListener(new OnClickListener(){

			@SuppressLint("NewApi") public void onClick(View v) {
				EditText myEditText = (EditText) findViewById(R.id.textout);  
				InputMethodManager imm = (InputMethodManager)getSystemService(
				      Context.INPUT_METHOD_SERVICE);
				imm.hideSoftInputFromWindow(myEditText.getWindowToken(), 0);
				
			}
			
		});
		
		pptControl.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent("com.exercise.AndroidClient.PPTCONTROL");
				startActivity(i);
			}
		});
	}

	float x, y, mlastx, mlasty;

	public boolean onTouchEvent(MotionEvent event) {
		if (gestureDetector.onTouchEvent(event) == true) {
			return true;
		} else {
			Intent i = getIntent();
			final String Ip = i.getStringExtra("Ip");

			int action = event.getAction();

			switch (action & MotionEvent.ACTION_MASK) {
			case MotionEvent.ACTION_DOWN:

			{

				try {
					socket = new Socket(Ip, 8888);
					dataOutputStream = new DataOutputStream(
							socket.getOutputStream());
					final float x = event.getX();
					final float y = event.getY();

					dataOutputStream.writeInt(0);

					mlastx = x;
					mlasty = y;

				} catch (UnknownHostException e1) {
					e1.printStackTrace();
				} catch (IOException e2) {
					e2.printStackTrace();
				} finally {

				}
			}
				break;
			case MotionEvent.ACTION_MOVE:

				try {
					socket = new Socket(Ip, 8888);
					dataOutputStream = new DataOutputStream(
							socket.getOutputStream());

					final float x = event.getX();
					final float y = event.getY();

					final float dx = x - mlastx;
					final float dy = y - mlasty;

					dataOutputStream.writeInt(1);
					dataOutputStream.writeFloat(2*dx);
					dataOutputStream.writeFloat(2*dy);

					mlastx = x;
					mlasty = y;

				} catch (IOException e1) {

					e1.printStackTrace();
				} finally {

				}

				break;
			case MotionEvent.ACTION_UP:

				try {
					socket = new Socket(Ip, 8888);
					dataOutputStream = new DataOutputStream(
							socket.getOutputStream());
					dataOutputStream.writeInt(2);

				} catch (IOException e1) {

					e1.printStackTrace();
				} finally {

				}

				break;

			case MotionEvent.ACTION_CANCEL:

				break;
			default: {
			}

			}

			return true;

		}
	}

	class simpleOnGestureListener extends
			GestureDetector.SimpleOnGestureListener {

		@Override
		public void onLongPress(MotionEvent e) {
			// TODO Auto-generated method stub
			try {
				Intent i = getIntent();

				final String Ip = i.getStringExtra("Ip");

				socket = new Socket(Ip, 8888);
				dataOutputStream = new DataOutputStream(
						socket.getOutputStream());
				dataInputStream = new DataInputStream(socket.getInputStream());
				dataOutputStream.writeInt(5);
				// dataOutputStream.writeUTF(textOut.getText().toString());
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} finally {
			}

			super.onLongPress(e);
		}

		@SuppressLint("NewApi") public boolean onDoubleTap(MotionEvent e) {
			// TODO Auto-generated method stub
			try {
				Intent i = getIntent();

				final String Ip = i.getStringExtra("Ip");

				socket = new Socket(Ip, 8888);
				dataOutputStream = new DataOutputStream(
						socket.getOutputStream());
				dataInputStream = new DataInputStream(socket.getInputStream());
				dataOutputStream.writeInt(5);

			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} finally {

			}
			return super.onDoubleTap(e);
		}

		@SuppressLint("NewApi") @Override
		public boolean onSingleTapConfirmed(MotionEvent e) {
			// TODO Auto-generated method stub
			try {
				Intent i = getIntent();

				final String Ip = i.getStringExtra("Ip");

				socket = new Socket(Ip, 8888);
				dataOutputStream = new DataOutputStream(
						socket.getOutputStream());
				dataInputStream = new DataInputStream(socket.getInputStream());
				dataOutputStream.writeInt(4);

			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} finally {

			}

			return super.onSingleTapConfirmed(e);
		}

	};

	public View.OnTouchListener OnTouchListener = new View.OnTouchListener() {

		public boolean onTouch(View view, MotionEvent motionEvent) {
			return gestureDetector.onTouchEvent(motionEvent);
		}
	};
}