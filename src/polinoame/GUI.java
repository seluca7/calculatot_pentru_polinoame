package polinoame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GUI {
	String polinom1;
	String polinom2;
	Polinom p1 = new Polinom();
	Polinom p2 = new Polinom();
	Polinom p3 = new Polinom();
	Operatii o = new Operatii();
	public GUI() {
		JFrame f = new JFrame("polinoame");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(420,400);
		
		JPanel p = new JPanel();
		p.setLayout(null);
		
		JLabel l1 = new JLabel("polinom 1");
		l1.setSize(100,30);
		l1.setLocation(50,10);
		
		JTextField t1 = new JTextField();
		t1.setSize(300,30);
		t1.setLocation(50,50);
		
		
		JLabel l2 = new JLabel("polinom 2");
		l2.setSize(100,30);
		l2.setLocation(50,90);
		
		JTextField t2 = new JTextField();
		t2.setSize(300,30);
		t2.setLocation(50,130);
		
		JButton b1 = new JButton("+");
		b1.setSize(45,45);
		b1.setLocation(50,170);
		
		
		JButton b2 = new JButton("-");
		b2.setSize(45,45);
		b2.setLocation(105,170);
		
		
		JButton b3 = new JButton("*");
		b3.setSize(45,45);
		b3.setLocation(160,170);
		
		JButton b4 = new JButton("/");
		b4.setSize(45,45);
		b4.setLocation(215,170);
		
		
		JButton b5 = new JButton("der");
		b5.setSize(60,45);
		b5.setLocation(270,170);
		
		
		JButton b6 = new JButton("int");
		b6.setSize(60,45);
		b6.setLocation(340,170);
		
		
		JLabel l3 = new JLabel("rezultat");
		l3.setSize(100,30);
		l3.setLocation(50,225);
		
		JTextField t3 = new JTextField();
		t3.setSize(300,30);
		t3.setLocation(50,265);
		
		
		// adaugam listener pt butonul "+"
				b1.addActionListener(e ->{
					o.resetare(p1);
					o.resetare(p2);
					o.resetare(p3);
					p3.rezultat = "";
					polinom1 = t1.getText();
					polinom2 = t2.getText();
					int[] k = o.Conversie(polinom1);
					int[] k2 = o.Conversie(polinom2);
					for(int i = 0;i<k.length;i=i+2) {
						Monom m = new Monom(k[i],k[i+1]);
						p1.adauga(m);
						
					}
					for(int i = 0;i<k2.length;i=i+2) {
						Monom m = new Monom(k2[i],k2[i+1]);
						p2.adauga(m);
						
					}
					o.grupare(p1);
					o.grupare(p2);
					p3 = o.adunare(p1, p2);
					o.grupare(p3);
					o.ordonare(p3);
					p3.afisare();
					t3.setText(p3.rezultat);
				});
				
		// adaugam listener pt butonul "-"
				b2.addActionListener(e ->{
					o.resetare(p1);
					o.resetare(p2);
					o.resetare(p3);
					p3.rezultat = "";
					polinom1 = t1.getText();
					polinom2 = t2.getText();
					int[] k = o.Conversie(polinom1);
					int[] k2 = o.Conversie(polinom2);
					for(int i = 0;i<k.length;i=i+2) {
						Monom m = new Monom(k[i],k[i+1]);
						p1.adauga(m);
						
					}
					for(int i = 0;i<k2.length;i=i+2) {
						Monom m = new Monom(k2[i],k2[i+1]);
						p2.adauga(m);
						
					}
					o.grupare(p1);
					o.grupare(p2);
					p3 = o.scadere(p1, p2);
					o.grupare(p3);
					o.ordonare(p3);
					p3.afisare();
					t3.setText(p3.rezultat);
					
				});
		// adaugam listener pt butonul "*"
				b3.addActionListener(e ->{
					o.resetare(p1);
					o.resetare(p2);
					o.resetare(p3);
					p3.rezultat = "";
					polinom1 = t1.getText();
					polinom2 = t2.getText();
					int[] k = o.Conversie(polinom1);
					int[] k2 = o.Conversie(polinom2);
					for(int i = 0;i<k.length;i=i+2) {
						Monom m = new Monom(k[i],k[i+1]);
						p1.adauga(m);
						
					}
					for(int i = 0;i<k2.length;i=i+2) {
						Monom m = new Monom(k2[i],k2[i+1]);
						p2.adauga(m);
						
					}
					o.grupare(p1);
					o.grupare(p2);
					p3 = o.inmultire(p1, p2);
					o.grupare(p3);
					o.ordonare(p3);
					p3.afisare();
					t3.setText(p3.rezultat);
				});
		// adaugam listener pt butonul "/"
				b4.addActionListener(e ->{
					o.resetare(p1);
					o.resetare(p2);
					o.resetare(p3);
					p3.rezultat = "";
					polinom1 = t1.getText();
					polinom2 = t2.getText();
					t3.setText(polinom1);
				});
		// adaugam listener pt butonul "derivare"
				b5.addActionListener(e ->{
					o.resetare(p1);
					o.resetare(p3);
					p3.rezultat = "";
					polinom1 = t1.getText();
					int[] k = o.Conversie(polinom1);
					for(int i = 0;i<k.length;i=i+2) {
						Monom m = new Monom(k[i],k[i+1]);
						p1.adauga(m);
						
					}
					o.grupare(p1);
					p3 = o.derivare(p1);
					o.grupare(p3);
					o.ordonare(p3);
					p3.afisare();
					t3.setText(p3.rezultat);
				});
		// adaugam listener pt butonul "integrare"
				b6.addActionListener(e ->{
					o.resetare(p1);
					o.resetare(p3);
					p3.rezultat = "";
					polinom1 = t1.getText();
					int[] k = o.Conversie(polinom1);
					for(int i = 0;i<k.length;i=i+2) {
						Monom m = new Monom(k[i],k[i+1]);
						p1.adauga(m);
						
					}
					o.grupare(p1);
					p3 = o.integrare(p1);
					o.grupare(p3);
					o.ordonare(p3);
					p3.afisare();
					t3.setText(p3.rezultat);
					
				});
		
		p.add(l1);
		p.add(t1);
		p.add(l2);
		p.add(l2);
		p.add(t2);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(l3);
		p.add(t3);
		
		f.setContentPane(p);
		f.setVisible(true);
		
	}

}
