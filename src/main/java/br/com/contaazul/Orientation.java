package br.com.contaazul;

public enum Orientation {

	NORTH(1, "N"), EAST(2, "E"), SOUTH(3, "S"), WEST(4, "W");

	private int orientation;
	private String cardinalPoint;

	Orientation(int orientation, String cardinalPoint) {
		this.orientation = orientation;
		this.cardinalPoint = cardinalPoint;
	}

	public int getOrientation() {
		return this.orientation;
	}

	public Orientation getOrientation(int i) {
		for (Orientation o : Orientation.values()) {
			if (o.getOrientation() == i) {
				return o;
			}
		}
		return null;
	}

	public String getCardinalPoint() {
		return cardinalPoint;
	}

	public void setCardinalPoint(String cardinalPoint) {
		this.cardinalPoint = cardinalPoint;
	}

	public void setOrientation(int orientation) {
		this.orientation = orientation;
	}
}
