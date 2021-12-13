package polinoame;

public class Monom {
	private int coeficient;
	private int putere;
	
	public void setCoeficient(int a) {
		this.coeficient = a;
	}
	public int getCoeficient() {
		return this.coeficient;
	}
	public void setPutere(int a) {
		this.putere = a;
	}
	public int getPutere() {
		return this.putere;
	}
	public Monom() {
		this.setCoeficient(0);
		this.setPutere(0);
	}
	public Monom(int c,int p) {
		this.setCoeficient(c);
		this.setPutere(p);
	}

}
