package player;

public class Player {
	private int x, y;

	public Player(int xv, int yv) {
		setX(xv);
		setY(yv);

	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}
