package br.com.contaazul;

public class Robot {

	private int x;
	private int y;
	private Orientation orientation = Orientation.NORTH;

	public String move(String movements, Ground ground) throws Exception {
		for (int i = 0; i < movements.length(); i++) {
			char action = movements.charAt(i);
			int position = 0;
			switch (action) {
			case 'L':
				position = orientation.getOrientation() - 1;
				position = (position < 1) ? 4 : position;
				this.orientation = orientation.getOrientation(position);
				break;
			case 'R':
				position = orientation.getOrientation() + 1;
				position = (position > 4) ? 1 : position;
				this.orientation = orientation.getOrientation(position);
				break;
			case 'M':
				explore();
				if (x >= ground.getWidth() || y >= ground.getLength()) {
					throw new Exception("400 Bad Request");
				}
				break;
			default:
				throw new Exception("400 Bad Request");
			}
		}

		return String.format("(%d,%d,%s)", x, y, orientation.getCardinalPoint());
	}

	private void explore() {
		switch (this.orientation.getOrientation()) {
		case 1:
			y++;
			break;
		case 2:
			x++;
			break;
		case 3:
			y--;
			break;
		case 4:
			x--;
			break;
		}
	}
}