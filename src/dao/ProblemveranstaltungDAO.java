package dao;

import model.Problemveranstaltung;

//Stateless??
public class ProblemveranstaltungDAO extends GenericDAO<Problemveranstaltung> {
	
	public ProblemveranstaltungDAO() {
		super(Problemveranstaltung.class);
	}
	
	//Hier jetzt was mit den Objekten in der Datenbank passieren soll
	public void save(Problemveranstaltung problemveranstaltung) {
		super.save(problemveranstaltung);
	}

}
