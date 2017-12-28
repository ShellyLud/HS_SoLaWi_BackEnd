package facade.impl;

import dao.ProblemveranstaltungDAO;
import facade.IProblemveranstaltung;
import model.Problemveranstaltung;

//Stateless??
public class ProblemveranstaltungFacadeImpl implements IProblemveranstaltung{
	
	//@EJB??
	private ProblemveranstaltungDAO problemveranstaltungDAO;
	
	//@Override??
	//TODO: muss hier ueberhautp eine Problemver. erstellt werden können??
	public void neueProblemveranstaltung(String text, int minAnzahlHelfer, int zaehlwerk, boolean koordination, String termin1,
			String termin2, String termin3) {
		
		Problemveranstaltung problemveranstaltung = new Problemveranstaltung(text, minAnzahlHelfer, zaehlwerk, koordination, termin1, termin2, termin3);
		problemveranstaltungDAO.save(problemveranstaltung);
	}
	
	

}
