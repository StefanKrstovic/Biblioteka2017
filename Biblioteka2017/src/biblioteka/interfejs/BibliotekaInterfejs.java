package biblioteka.interfejs;

import java.util.LinkedList;

import biblioteka.Autori;
import biblioteka.Knjiga;

public interface BibliotekaInterfejs {
	public void dodajKnjigu(Knjiga k);
	public void obrisiKnjigu(Knjiga k);
	public LinkedList <Knjiga> vratiSveKnjige();
	public LinkedList <Knjiga> pronadjiKnjigu(String naslov, Autori autor, long isbn, String izdavac);
}