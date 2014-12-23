package mouse;

import java.io.DataInputStream;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;

public class Touchmouse {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		DataInputStream dataInputStream = null;
		DataOutputStream dataOutputStream = null;
		float x = 0;
		float y = 0;
		int cnt = 0;
		int cnt1 = 0;
		Robot robot = null;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		float width = (float) screenSize.getWidth();
		float height = (float) screenSize.getHeight();
		int flag = 0;
		try {
			serverSocket = new ServerSocket(8888);
			System.out.println("Listening :8888");

			try {
				InetAddress thisIp = InetAddress.getLocalHost();
				System.out.println("LAPTOP IP:" + thisIp.getHostAddress());
				robot = new Robot();
				Point lo = MouseInfo.getPointerInfo().getLocation();
				x = (float) lo.getX();
				y = (float) lo.getY();
				System.out.println("X is" + x);
				System.out.println("Y is" + y);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (true) {

			try {
				socket = serverSocket.accept();
				dataInputStream = new DataInputStream(socket.getInputStream());
				dataOutputStream = new DataOutputStream(
						socket.getOutputStream());
				System.out.println("sender ip: " + socket.getInetAddress());
				// System.out.println("message: " + dataInputStream.readUTF());
				// String str = new String();
				int j = dataInputStream.readInt();
				System.out.println(j);
				if (j == 0) {

					System.out.println(x);
					System.out.println(y);
					robot.delay(100);
					if (x < 0 || y < 0) {
						if (x < 0) {
							x = 0;
						} else {
							y = 0;
						}
						robot.mouseMove((int) x, (int) y);
					} else if (x > width || y > height) {
						if (x > width) {
							x = width;
						} else {
							y = height;
						}
						robot.mouseMove((int) x, (int) y);
					} else {
						robot.mouseMove((int) x, (int) y);
					}

				} else if (j == 1) {
					System.out.println(" hi ");
					float x1 = dataInputStream.readFloat();
					float y1 = dataInputStream.readFloat();
					System.out.println("diff X :" + x1);
					System.out.println("diff Y :" + y1);
					// robot.delay(100);
					// if (flag == 0) {

					x = x + x1;
					y = y + y1;
					// flag=0;
					// }
					System.out.println("new X :" + x);
					System.out.println("new Y :" + y);
					// robot.mouseMove((int)(x),(int)(y));
					if (x < 0 || y < 0) {
						if (x < 0) {
							x = 0;
						} else {
							y = 0;
						}
						robot.mouseMove((int) x, (int) y);
					} else if (x > width || y > height) {
						if (x > width) {
							x = width;
						} else {
							y = height;
						}
						robot.mouseMove((int) x, (int) y);
					} else {
						robot.mouseMove((int) x, (int) y);
						cnt1 = 0;
					}
				} else if (j == 2) {
					System.out.println(" hello ");
					// float x1=dataInputStream.readFloat();
					// float y1=dataInputStream.readFloat();
					// System.out.println(x1);
					// System.out.println(y1);
					// robot.delay(100);
					// robot.mouseMove((int)x,(int)y);
					if (x < 0 || y < 0) {
						if (x < 0) {
							x = 0;
						} else {
							y = 0;
						}
						robot.mouseMove((int) x, (int) y);
					} else if (x > width || y > height) {
						if (x > width) {
							x = width;
						} else {
							y = height;
						}
						robot.mouseMove((int) x, (int) y);
					} else {
						robot.mouseMove((int) x, (int) y);
						// cnt1++;
					}
				} else if (j == 3) {

					System.out.println("new X :" + x);
					System.out.println("new Y :" + y);
					robot.mouseMove((int) x, (int) y);
					robot.delay(300);
					robot.mousePress(InputEvent.BUTTON3_MASK);
					robot.mouseRelease(InputEvent.BUTTON3_MASK);
					cnt1 = 0;
				} else if (j == 4) {
					System.out.println("new X :" + x);
					System.out.println("new Y :" + y);
					robot.mouseMove((int) x, (int) y);

					robot.delay(300);
					System.out.println("cnt is:" + cnt1);

					robot.mousePress(InputEvent.BUTTON1_MASK);
					robot.mouseRelease(InputEvent.BUTTON1_MASK);
					cnt1 = 0;

				} else if (j == 5) {
					robot.mouseMove((int) x, (int) y);
					robot.delay(300);
					robot.mousePress(InputEvent.BUTTON1_MASK);
					robot.mouseRelease(InputEvent.BUTTON1_MASK);
					robot.delay(100);
					robot.mousePress(InputEvent.BUTTON1_MASK);
					robot.mouseRelease(InputEvent.BUTTON1_MASK);
				} else if (j == 9) {
					robot.keyPress(KeyEvent.VK_SHIFT);
				} else if (j == 10) {
					robot.keyRelease(KeyEvent.VK_SHIFT);
				} else if (j == 11) {
					robot.keyPress(KeyEvent.VK_CONTROL);
				} else if (j == 12) {
					robot.keyRelease(KeyEvent.VK_CONTROL);
				} else if (j == 13) {
					robot.keyPress(KeyEvent.VK_ALT);
				} else if (j == 14) {
					robot.keyRelease(KeyEvent.VK_ALT);
				} else if (j == 16) {
					robot.delay(1000);
					robot.keyPress(KeyEvent.VK_ESCAPE);
					robot.keyRelease(KeyEvent.VK_ESCAPE);
				} else if (j == 17) {
					robot.keyPress(KeyEvent.VK_INSERT);
					robot.keyRelease(KeyEvent.VK_INSERT);
				} else if (j == 18) {
					robot.keyPress(KeyEvent.VK_PRINTSCREEN);
					robot.keyRelease(KeyEvent.VK_PRINTSCREEN);
					
				} else if (j == 19) {
					robot.delay(1000);
					System.out.println(" hi ");
					robot.keyPress(KeyEvent.VK_DELETE);
					robot.keyRelease(KeyEvent.VK_DELETE);
					robot.keyRelease(KeyEvent.VK_ALT);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					
				} else if (j == 20) {
					robot.keyPress(KeyEvent.VK_UP);
					robot.keyRelease(KeyEvent.VK_UP);
					
				} else if (j == 21) {
					robot.keyPress(KeyEvent.VK_LEFT);
					robot.keyRelease(KeyEvent.VK_UP);
					
				} else if (j == 22) {
					robot.keyPress(KeyEvent.VK_DOWN);
					robot.keyRelease(KeyEvent.VK_DOWN);
				} else if (j == 23) {
					robot.keyPress(KeyEvent.VK_RIGHT);
					robot.keyRelease(KeyEvent.VK_RIGHT);
					
				} else if (j == 31) {
					robot.keyPress(KeyEvent.VK_F1);
					robot.keyRelease(KeyEvent.VK_F1);
					
				} else if (j == 32) {
					robot.keyPress(KeyEvent.VK_F2);
					robot.keyRelease(KeyEvent.VK_F2);
					
				} else if (j == 33) {
					robot.keyPress(KeyEvent.VK_F3);
					robot.keyRelease(KeyEvent.VK_F3);
					
				} else if (j == 34) {
					robot.keyPress(KeyEvent.VK_F4);
					robot.keyRelease(KeyEvent.VK_F4);
					
				} else if (j == 35) {
					robot.keyPress(KeyEvent.VK_F5);
					robot.keyRelease(KeyEvent.VK_F5);
					
				} else if (j == 36) {
					robot.keyPress(KeyEvent.VK_F6);
					robot.keyRelease(KeyEvent.VK_F6);
					
				} else if (j == 37) {
					robot.keyPress(KeyEvent.VK_F7);
					robot.keyRelease(KeyEvent.VK_F7);
					
				} else if (j == 38) {
					robot.keyPress(KeyEvent.VK_F8);
					robot.keyRelease(KeyEvent.VK_F8);
					
				} else if (j == 39) {
					robot.keyPress(KeyEvent.VK_F9);
					robot.keyRelease(KeyEvent.VK_F9);
					
				} else if (j == 40) {
					robot.keyPress(KeyEvent.VK_F10);
					robot.keyRelease(KeyEvent.VK_F10);
					
				} else if (j == 41) {
					robot.keyPress(KeyEvent.VK_F11);
					robot.keyRelease(KeyEvent.VK_F11);
					
				} else if (j == 42) {
					robot.keyPress(KeyEvent.VK_F12);
					robot.keyRelease(KeyEvent.VK_F12);
					
				} else if (j == 43) {
					robot.keyPress(KeyEvent.VK_TAB);
					robot.keyRelease(KeyEvent.VK_TAB);
						
				} else if (j == 44) {
					robot.keyPress(KeyEvent.VK_HOME);
					robot.keyRelease(KeyEvent.VK_HOME);
					
				} else if (j == 45) {
					robot.keyPress(KeyEvent.VK_PAGE_UP);
					robot.keyRelease(KeyEvent.VK_PAGE_UP);
					
				} else if (j == 46) {
					robot.keyPress(KeyEvent.VK_PAGE_DOWN);
					robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
				} else if (j == 47) {
					robot.keyPress(KeyEvent.VK_END);
					robot.keyRelease(KeyEvent.VK_END);
				} else if (j == 48) {
					robot.keyPress(KeyEvent.VK_WINDOWS);
					robot.keyRelease(KeyEvent.VK_WINDOWS);
				} else if (j == 6) {
					String str = dataInputStream.readUTF();
					System.out.println("" + str);
					int len = str.length();
					System.out.println("len" + len);
					System.out.println("cnt" + cnt);
					if (cnt > len) {
						cnt--;
						try {

							robot = new Robot();
							robot.delay(100);
							robot.keyPress(KeyEvent.VK_BACK_SPACE);

						} catch (AWTException e) {
							e.printStackTrace();
						}

					}

					while (len != 0 && cnt < len) {

						char i = str.charAt(cnt);
						int k = i;
						System.out.println("" + i);

						System.out.println("" + k);
						// dataOutputStream.writeUTF("You sent: " + str);
						try {

							robot = new Robot();
							// robot.delay(2000);

							if (k > 64 && k < 91) {

								robot.keyPress(KeyEvent.VK_SHIFT);
								robot.keyPress(k);
								robot.keyRelease(KeyEvent.VK_SHIFT);
							} else if (k > 96 && k < 123) {
								robot.keyPress(k - 32);

							} else if (k > 48 && k < 58) {
								robot.keyPress(k);
							} else {
								switch (i) {
								case ' ':
									robot.keyPress(KeyEvent.VK_SPACE);
									break;
								case '\n':
									robot.keyPress(KeyEvent.VK_ENTER);
									break;
								case '!': {
									robot.keyPress(KeyEvent.VK_SHIFT);
									robot.keyPress(KeyEvent.VK_1);
									robot.keyRelease(KeyEvent.VK_SHIFT);
									break;
								}

								case '@': {
									robot.keyPress(KeyEvent.VK_SHIFT);
									robot.keyPress(KeyEvent.VK_2);
									robot.keyRelease(KeyEvent.VK_SHIFT);
									break;
								}
								case '#': {
									robot.keyPress(KeyEvent.VK_SHIFT);
									robot.keyPress(KeyEvent.VK_3);
									robot.keyRelease(KeyEvent.VK_SHIFT);
									break;
								}
								case '$': {
									robot.keyPress(KeyEvent.VK_SHIFT);
									robot.keyPress(KeyEvent.VK_4);
									robot.keyRelease(KeyEvent.VK_SHIFT);
									break;
								}
								case '%': {
									robot.keyPress(KeyEvent.VK_SHIFT);
									robot.keyPress(KeyEvent.VK_5);
									robot.keyRelease(KeyEvent.VK_SHIFT);
									break;
								}
								case '^': {
									robot.keyPress(KeyEvent.VK_SHIFT);
									robot.keyPress(KeyEvent.VK_6);
									robot.keyRelease(KeyEvent.VK_SHIFT);
									break;
								}
								case '&': {
									robot.keyPress(KeyEvent.VK_SHIFT);
									robot.keyPress(KeyEvent.VK_7);
									robot.keyRelease(KeyEvent.VK_SHIFT);
									break;
								}
								case '*': {
									robot.keyPress(KeyEvent.VK_SHIFT);
									robot.keyPress(KeyEvent.VK_8);
									robot.keyRelease(KeyEvent.VK_SHIFT);
									break;
								}
								case '(': {
									robot.keyPress(KeyEvent.VK_SHIFT);
									robot.keyPress(KeyEvent.VK_9);
									robot.keyRelease(KeyEvent.VK_SHIFT);
									break;
								}
								case ')': {
									robot.keyPress(KeyEvent.VK_SHIFT);
									robot.keyPress(KeyEvent.VK_0);
									robot.keyRelease(KeyEvent.VK_SHIFT);
									break;
								}
								case '-':
									robot.keyPress(KeyEvent.VK_MINUS);
									break;
								case '=':
									robot.keyPress(KeyEvent.VK_EQUALS);
									break;
								case '_': {
									robot.keyPress(KeyEvent.VK_SHIFT);
									robot.keyPress(KeyEvent.VK_MINUS);
									robot.keyRelease(KeyEvent.VK_SHIFT);
									break;
								}
								case '+': {
									robot.keyPress(KeyEvent.VK_SHIFT);
									robot.keyPress(KeyEvent.VK_EQUALS);
									robot.keyRelease(KeyEvent.VK_SHIFT);
									break;
								}
								case '[':
									robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
									break;
								case ']':
									robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
									break;
								case '{': {
									robot.keyPress(KeyEvent.VK_SHIFT);
									robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
									robot.keyRelease(KeyEvent.VK_SHIFT);
									break;
								}
								case '}': {
									robot.keyPress(KeyEvent.VK_SHIFT);
									robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
									robot.keyRelease(KeyEvent.VK_SHIFT);
									break;
								}
								case ';':
									robot.keyPress(KeyEvent.VK_SEMICOLON);
									break;
								case ',':
									robot.keyPress(KeyEvent.VK_COMMA);
									break;
								case '.':
									robot.keyPress(KeyEvent.VK_PERIOD);
									break;
								case '/':
									robot.keyPress(KeyEvent.VK_SLASH);
									break;

								case ':': {
									robot.keyPress(KeyEvent.VK_SHIFT);
									robot.keyPress(KeyEvent.VK_SEMICOLON);
									robot.keyRelease(KeyEvent.VK_SHIFT);
									break;
								}
								case '<': {
									robot.keyPress(KeyEvent.VK_SHIFT);
									robot.keyPress(KeyEvent.VK_COMMA);
									robot.keyRelease(KeyEvent.VK_SHIFT);
									break;
								}

								case '>': {
									robot.keyPress(KeyEvent.VK_SHIFT);
									robot.keyPress(KeyEvent.VK_PERIOD);
									robot.keyRelease(KeyEvent.VK_SHIFT);
									break;
								}
								case '?': {
									robot.keyPress(KeyEvent.VK_SHIFT);
									robot.keyPress(KeyEvent.VK_SLASH);
									robot.keyRelease(KeyEvent.VK_SHIFT);
									break;
								}
								case '\\':
									robot.keyPress(KeyEvent.VK_BACK_SLASH);
									break;

								case '|': {
									robot.keyPress(KeyEvent.VK_SHIFT);
									robot.keyPress(KeyEvent.VK_BACK_SLASH);
									robot.keyRelease(KeyEvent.VK_SHIFT);
									break;
								}
								case '\'':
									robot.keyPress(KeyEvent.VK_QUOTE);
									break;

								case '"': {
									robot.keyPress(KeyEvent.VK_SHIFT);
									robot.keyPress(KeyEvent.VK_QUOTE);
									robot.keyRelease(KeyEvent.VK_SHIFT);
									break;
								}

								default: {
									System.out.println("Invalid Code: ");
									dataOutputStream.writeUTF("Invalid Code: ");
									break;
								}
								}

							}

							cnt++;

						} catch (AWTException e) {
							e.printStackTrace();
						} finally {
						}
					}
				} else {
				}
			}

			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (socket != null) {
					try {
						socket.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				if (dataInputStream != null) {
					try {
						dataInputStream.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				if (dataOutputStream != null) {
					try {
						dataOutputStream.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

}
