package polinoame;
import java.util.ArrayList;


public class Polinom {
String rezultat = new String();
public ArrayList<Monom> polinom = new ArrayList<Monom>();
	// ------ Functie pentru adaugarea unui monom la polinom
	public void adauga(Monom m) {
		polinom.add(m);
	}
	
	// ------ Functie pentru afisarea polinomului
	public void afisare() {
	for(Monom i:polinom) {
		if(i.getCoeficient() != 0) {
			if(i.getCoeficient()>0) {
		System.out.print("+"+i.getCoeficient()+"x"+"^"+i.getPutere());
		rezultat = rezultat + "+"+i.getCoeficient()+"x"+"^"+i.getPutere();}
			else {
				System.out.print(i.getCoeficient()+"x"+"^"+i.getPutere());
				rezultat = rezultat + i.getCoeficient()+"x"+"^"+i.getPutere();
			}
	}
	}
	}
}
