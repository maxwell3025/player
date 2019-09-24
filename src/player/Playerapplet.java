package player;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Playerapplet extends Applet implements KeyListener {
	private static final long serialVersionUID = -452569230913497245L;
	private int x = 0;
	private int y = 0;
	boolean hi = false;
	private int bulletdir;
	private int bx;
	private int by;
	Mythread bullet;
	@Override
	public void update(Graphics g) {
		paint(g);
		g.setColor(Color.WHITE);
		g.drawRect(x - 1, y - 1, 22, 22);
	}

	public void init() {
	
		addKeyListener(this);
	}

	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(x, y, 20, 20);
		g.fillRect(bullet.x, by, 10, 10);
		if (hi) {
			g.drawString("hi", x, y - 10);
			hi = false;
		}
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void keyPressed(KeyEvent e) {
		int c = e.getKeyCode();
		if (c == KeyEvent.VK_UP) {
			bulletdir = 4;
			y--;
		}
		if (c == KeyEvent.VK_DOWN) {
			bulletdir = 2;
			y++;
		}
		if (c == KeyEvent.VK_LEFT) {
			bulletdir = 3;
			x--;
		}
		if (c == KeyEvent.VK_RIGHT) {
			bulletdir = 1;
			x++;
		}
		if (c == KeyEvent.VK_SHIFT) {
			hi = true;
		}
		if (c == KeyEvent.VK_SPACE) {
			Mythread bullet = new Mythread(this, "1", bulletdir);
			bullet.start();
		} 
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
