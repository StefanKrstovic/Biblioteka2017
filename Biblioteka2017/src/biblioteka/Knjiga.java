package biblioteka;

import java.util.LinkedList;

public class Knjiga {
	private String naslov;
	private long isbn;
	private String izdavac;
	private int izdanje;
	private LinkedList<Autori> autori;

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getIzdavac() {
		return izdavac;
	}

	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}

	public int getIzdanje() {
		return izdanje;
	}

	public void setIzdanje(int izdanje) {
		this.izdanje = izdanje;
	}


	@Override
	public String toString() {
		return "Knjiga [naslov=" + naslov + ", isbn=" + isbn + ", izdavac=" + izdavac + ", izdanje=" + izdanje
				+ ", autori=" + autori + "]";
	}

	@Override
	public boolean equals(Object arg0) {
		Knjiga a=(Knjiga)arg0;
		return this.getIsbn()==a.getIsbn();

	public LinkedList<Autori> getAutori() {
		return autori;
	}

	public void setAutori(LinkedList<Autori> autori) {
		this.autori = autori;

	}

}
