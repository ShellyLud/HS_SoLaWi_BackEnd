package facade.impl;

import javax.ejb.EJB;

import dao.GruppeDAO;
import facade.IGruppe;

public class GruppeFacadeImpl implements IGruppe{
	
	@EJB
	private GruppeDAO gruppeDAO;

}
