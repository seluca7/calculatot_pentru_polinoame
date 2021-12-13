package polinoame;

public class Operatii {
	boolean exista;
	
	public int[] Conversie(String p) {
		String semne = p.replaceAll("[-]", "+-");
		String str = semne.replaceAll("[A-Za-z+]+", " ");
		String[] polinomStr = str.split(" ");
		int[] polinom = new int[polinomStr.length];
		for(int i = 0;i<polinomStr.length;i++) {
			polinom[i] = Integer.parseInt(polinomStr[i]);
		}
		return polinom;
		
	}
	// ----------------- Functia de adunare a polinoamelor ------------------
	public Polinom adunare(Polinom a,Polinom b) {
		for(Monom j:b.polinom) {
			exista = false;
			for(Monom i:a.polinom) {
				if(i.getPutere() == j.getPutere()) {
					i.setCoeficient(i.getCoeficient() + j.getCoeficient());
					j.setCoeficient(0);
					j.setPutere(0);
					exista = true;
				}
			}
			if (exista == false) {
				a.adauga(j);
			}
		}
		return a;
	}
	// ------------------ Functia de scadere a polinoamelor ------------------
	public Polinom scadere(Polinom a,Polinom b) {
		for(Monom j:b.polinom) {
			exista = false;
			for(Monom i:a.polinom) {
				if(i.getPutere() == j.getPutere()) {
					i.setCoeficient(i.getCoeficient() - j.getCoeficient());
					j.setCoeficient(0);
					j.setPutere(0);
					exista = true;
				}
			}
			if (exista == false) {
				j.setCoeficient(-j.getCoeficient());
				a.adauga(j);
			}
		}
		return a;
	}
	// -------------------- Functia de derivare a unui polinom -------------------
	public Polinom derivare(Polinom a) {
		for(Monom i:a.polinom) {
			i.setCoeficient(i.getCoeficient()*i.getPutere());
			i.setPutere(i.getPutere() - 1);
		}
		return a;
	}
	// ----------------------- Functia de integrare a unui polinom ---------------------
	public Polinom integrare(Polinom a) {
		for(Monom i:a.polinom) {
			i.setPutere(i.getPutere()+1);
			i.setCoeficient(i.getCoeficient()/i.getPutere());
		}
		return a;
	}
	
	// ---------------------- Functia de inmultire a 2 polinoame ----------------------
	public Polinom inmultire(Polinom a,Polinom b) {
		Polinom c = new Polinom();
		for(Monom i:a.polinom) {
			for(Monom j:b.polinom) {
				Monom k = new Monom();
				k.setCoeficient(i.getCoeficient()*j.getCoeficient());
				k.setPutere(i.getPutere() + j.getPutere());
				c.adauga(k);
			}
		}
		return c;
	}
	
	// ------------ Functia de grupare a elementelor cu coeficienti egali ---------------
	public void grupare(Polinom a) {
		for(Monom i:a.polinom) {
			for(Monom j:a.polinom) {
				if(i!=j) {
					if(i.getPutere() == j.getPutere()) {
						i.setCoeficient(i.getCoeficient() + j.getCoeficient());
						j.setCoeficient(0);
						j.setPutere(0);
					}
				}
			}
		}
	}
	// -------- Functia de ordonare a unui polinom in ordinea puterilor ----
	public void ordonare(Polinom a) {
		int coef_aux;
		int putere_aux;
			for(Monom i:a.polinom) {
				for(Monom j:a.polinom) {
					if(j.getPutere()<i.getPutere()) {
						putere_aux = j.getPutere();
						coef_aux = j.getCoeficient();
						j.setPutere(i.getPutere());
						j.setCoeficient(i.getCoeficient());
						i.setPutere(putere_aux);
						i.setCoeficient(coef_aux);
					}
				}
			}
	}
	// -------- Functie de golire/resetare a unui polinom
	public void resetare(Polinom a) {
		for(Monom i:a.polinom) {
			i.setCoeficient(0);
			i.setPutere(0);
		}
	}
		
}
