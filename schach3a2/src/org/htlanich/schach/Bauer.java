package org.htlanich.schach;

public class Bauer extends Figur {
	public Bauer(boolean farbeWeiss, boolean bewegt) {
		super(farbeWeiss, bewegt);
		// TODO implement2
	}

	public boolean spielZug(SpielFeld sp, Position von, Position nach) {
		// TODO: implement
		return false;
	}

	public boolean spielzugMoeglich(SpielFeld sp, Position von, Position nach) {
		// TODO: implement
		return false;
	}
	// Test
	@Override
	public String toString() {
		return "B" + super.toString();
	}
}