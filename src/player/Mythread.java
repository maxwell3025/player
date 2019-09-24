package player;

public class Mythread extends Thread {
	public int x = 0;
	public int y = 0;
	public int rotation;
	private Playerapplet parent;

	public Mythread(Playerapplet panel, String s, int dir) {
		super(s);
		parent = panel;
		rotation = dir;
	}

	public void run() {
		while (x > 0 && y > 0 && x < 500 && y < 500) {
			if (rotation == 1) {
				x = x + 5;
			} else if (rotation == 2) {
				y = y + 5;
			} else if (rotation == 3) {
				x = x - 5;
			} else {
				y = y - 5;
			}
			
			parent.repaint();
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
			}
		}

	}
}
