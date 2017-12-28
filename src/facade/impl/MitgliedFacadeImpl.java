package facade.impl;

import javax.ejb.EJB;

import dao.MitgliedDAO;
import facade.IMitglied;

public class MitgliedFacadeImpl implements IMitglied{
	
	@EJB
	private MitgliedDAO mitgliedDAO;

}
