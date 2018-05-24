package pers.rush.beginner;

import java.applet.Applet;
import java.awt.Graphics;

public class _07_AppletExample extends Applet {
	 int a[]; // 声明数组
	 public void init() {
		 a = new int[5];
		 a[0] = 100;
		 a[1] = 101;
		 a[2] = 102;
		 a[3] = 103;
		 a[4] = 104;
	 }
	 
	 public void paint(Graphics g) {
		 g.drawString("a[0]=" + a[0] + "a[1]=" + a[1], 12, 12);
	 }
}
