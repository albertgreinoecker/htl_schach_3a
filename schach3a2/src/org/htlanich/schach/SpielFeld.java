package org.htlanich.schach;

public class SpielFeld {
	private Feld[][] mat = new Feld[8][8];
	private boolean werAmZug;

	public SpielFeld(Feld[][] mat) {
		this.mat = mat;
	}
	
	public SpielFeld(Feld[][] mat, boolean werAmZug) {
		this.mat = mat;
		this.werAmZug = werAmZug;
	}

	public Feld[][] getMat() {
		return mat;
	}

	public void setMat(Feld[][] mat) {
		this.mat = mat;
	}

	public boolean isWerAmZug() {
		return werAmZug;
	}

	public void setWerAmZug(boolean werAmZug) {
		this.werAmZug = werAmZug;
	}
	
	//Ausgabe ge�ndert
	public void ausgabe() {
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat.length;j++) {
				String s= mat[i][j].toString();
				System.out.print("|"+s);
			}
			System.out.println("|");
		}
	}

	public boolean schach() {
		return false;
	}

	public boolean schachMatt() {
		return false;
	}

	public boolean spielzug(String zug) {
		return false;
	}

	public Position schach2koordinate(String schach) {
		return null;
	}
	
	public Feld getFeld (int x, int y) {
		return mat[x][y];
	}
}
//hi Josh
//Lg Nof4ll