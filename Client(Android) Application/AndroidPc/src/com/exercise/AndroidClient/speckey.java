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

public class speckey extends Activity {

	Button up, down, left, right, f1, f2, f3, f4, f5,f6, f7, f8, f9, f10, f11,
			f12, esc, insert, prntscr, delete, tab, home, pgup, pgdn, end;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.speckey);
		Button up = (Button) findViewById(R.id.up);
		Button left = (Button) findViewById(R.id.left);
		Button down = (Button) findViewById(R.id.down);
		Button right = (Button) findViewById(R.id.right);
		Button f1 = (Button) findViewById(R.id.f1);
		Button f2 = (Button) findViewById(R.id.f2);
		Button f3 = (Button) findViewById(R.id.f3);
		Button f4 = (Button) findViewById(R.id.f4);
		Button f5 = (Button) findViewById(R.id.f5);
		Button f6 = (Button) findViewById(R.id.f6);
		Button f7 = (Button) findViewById(R.id.f7);
		Button f8 = (Button) findViewById(R.id.f8);
		Button f9 = (Button) findViewById(R.id.f9);
		Button f10 = (Button) findViewById(R.id.f10);
		Button f11 = (Button) findViewById(R.id.f11);
		Button f12 = (Button) findViewById(R.id.f12);
		Button esc = (Button) findViewById(R.id.esc);
		Button insert = (Button) findViewById(R.id.insert);
		Button prntscr = (Button) findViewById(R.id.prntscr);
		Button delete = (Button) findViewById(R.id.delete);
		Button tab = (Button) findViewById(R.id.tab);
		Button home = (Button) findViewById(R.id.home);
		Button pgup = (Button) findViewById(R.id.pgup);
		Button pgdn = (Button) findViewById(R.id.pgdn);		
		Button end = (Button) findViewById(R.id.end);
		
		up.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Tou_Button.socket = new Socket(Tou_Button.Ip, 8888);
					Tou_Button.dataOutputStream = new DataOutputStream(
							Tou_Button.socket.getOutputStream());
					Tou_Button.dataInputStream = new DataInputStream(
							Tou_Button.socket.getInputStream());

					Tou_Button.dataOutputStream.writeInt(20);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

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

		down.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Tou_Button.socket = new Socket(Tou_Button.Ip, 8888);
					Tou_Button.dataOutputStream = new DataOutputStream(
							Tou_Button.socket.getOutputStream());
					Tou_Button.dataInputStream = new DataInputStream(
							Tou_Button.socket.getInputStream());

					Tou_Button.dataOutputStream.writeInt(22);

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
		
		f1.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Tou_Button.socket = new Socket(Tou_Button.Ip, 8888);
					Tou_Button.dataOutputStream = new DataOutputStream(
							Tou_Button.socket.getOutputStream());
					Tou_Button.dataInputStream = new DataInputStream(
							Tou_Button.socket.getInputStream());

					Tou_Button.dataOutputStream.writeInt(31);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		
		f2.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Tou_Button.socket = new Socket(Tou_Button.Ip, 8888);
					Tou_Button.dataOutputStream = new DataOutputStream(
							Tou_Button.socket.getOutputStream());
					Tou_Button.dataInputStream = new DataInputStream(
							Tou_Button.socket.getInputStream());

					Tou_Button.dataOutputStream.writeInt(32);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		
		f3.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Tou_Button.socket = new Socket(Tou_Button.Ip, 8888);
					Tou_Button.dataOutputStream = new DataOutputStream(
							Tou_Button.socket.getOutputStream());
					Tou_Button.dataInputStream = new DataInputStream(
							Tou_Button.socket.getInputStream());

					Tou_Button.dataOutputStream.writeInt(33);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		
		f4.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Tou_Button.socket = new Socket(Tou_Button.Ip, 8888);
					Tou_Button.dataOutputStream = new DataOutputStream(
							Tou_Button.socket.getOutputStream());
					Tou_Button.dataInputStream = new DataInputStream(
							Tou_Button.socket.getInputStream());

					Tou_Button.dataOutputStream.writeInt(34);

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
		
		f6.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Tou_Button.socket = new Socket(Tou_Button.Ip, 8888);
					Tou_Button.dataOutputStream = new DataOutputStream(
							Tou_Button.socket.getOutputStream());
					Tou_Button.dataInputStream = new DataInputStream(
							Tou_Button.socket.getInputStream());

					Tou_Button.dataOutputStream.writeInt(36);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		
		f7.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Tou_Button.socket = new Socket(Tou_Button.Ip, 8888);
					Tou_Button.dataOutputStream = new DataOutputStream(
							Tou_Button.socket.getOutputStream());
					Tou_Button.dataInputStream = new DataInputStream(
							Tou_Button.socket.getInputStream());

					Tou_Button.dataOutputStream.writeInt(37);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		
		f8.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Tou_Button.socket = new Socket(Tou_Button.Ip, 8888);
					Tou_Button.dataOutputStream = new DataOutputStream(
							Tou_Button.socket.getOutputStream());
					Tou_Button.dataInputStream = new DataInputStream(
							Tou_Button.socket.getInputStream());

					Tou_Button.dataOutputStream.writeInt(38);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		
		f9.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Tou_Button.socket = new Socket(Tou_Button.Ip, 8888);
					Tou_Button.dataOutputStream = new DataOutputStream(
							Tou_Button.socket.getOutputStream());
					Tou_Button.dataInputStream = new DataInputStream(
							Tou_Button.socket.getInputStream());

					Tou_Button.dataOutputStream.writeInt(39);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		f10.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Tou_Button.socket = new Socket(Tou_Button.Ip, 8888);
					Tou_Button.dataOutputStream = new DataOutputStream(
							Tou_Button.socket.getOutputStream());
					Tou_Button.dataInputStream = new DataInputStream(
							Tou_Button.socket.getInputStream());

					Tou_Button.dataOutputStream.writeInt(40);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		f11.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Tou_Button.socket = new Socket(Tou_Button.Ip, 8888);
					Tou_Button.dataOutputStream = new DataOutputStream(
							Tou_Button.socket.getOutputStream());
					Tou_Button.dataInputStream = new DataInputStream(
							Tou_Button.socket.getInputStream());

					Tou_Button.dataOutputStream.writeInt(41);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		f12.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Tou_Button.socket = new Socket(Tou_Button.Ip, 8888);
					Tou_Button.dataOutputStream = new DataOutputStream(
							Tou_Button.socket.getOutputStream());
					Tou_Button.dataInputStream = new DataInputStream(
							Tou_Button.socket.getInputStream());

					Tou_Button.dataOutputStream.writeInt(42);

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
		
		insert.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Tou_Button.socket = new Socket(Tou_Button.Ip, 8888);
					Tou_Button.dataOutputStream = new DataOutputStream(
							Tou_Button.socket.getOutputStream());
					Tou_Button.dataInputStream = new DataInputStream(
							Tou_Button.socket.getInputStream());

					Tou_Button.dataOutputStream.writeInt(17);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		
		prntscr.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Tou_Button.socket = new Socket(Tou_Button.Ip, 8888);
					Tou_Button.dataOutputStream = new DataOutputStream(
							Tou_Button.socket.getOutputStream());
					Tou_Button.dataInputStream = new DataInputStream(
							Tou_Button.socket.getInputStream());

					Tou_Button.dataOutputStream.writeInt(18);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		
		delete.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Tou_Button.socket = new Socket(Tou_Button.Ip, 8888);
					Tou_Button.dataOutputStream = new DataOutputStream(
							Tou_Button.socket.getOutputStream());
					Tou_Button.dataInputStream = new DataInputStream(
							Tou_Button.socket.getInputStream());

					Tou_Button.dataOutputStream.writeInt(19);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		tab.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Tou_Button.socket = new Socket(Tou_Button.Ip, 8888);
					Tou_Button.dataOutputStream = new DataOutputStream(
							Tou_Button.socket.getOutputStream());
					Tou_Button.dataInputStream = new DataInputStream(
							Tou_Button.socket.getInputStream());

					Tou_Button.dataOutputStream.writeInt(43);

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
		
		pgup.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Tou_Button.socket = new Socket(Tou_Button.Ip, 8888);
					Tou_Button.dataOutputStream = new DataOutputStream(
							Tou_Button.socket.getOutputStream());
					Tou_Button.dataInputStream = new DataInputStream(
							Tou_Button.socket.getInputStream());

					Tou_Button.dataOutputStream.writeInt(45);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		
		pgdn.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					Tou_Button.socket = new Socket(Tou_Button.Ip, 8888);
					Tou_Button.dataOutputStream = new DataOutputStream(
							Tou_Button.socket.getOutputStream());
					Tou_Button.dataInputStream = new DataInputStream(
							Tou_Button.socket.getInputStream());

					Tou_Button.dataOutputStream.writeInt(46);

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
