package facade.impl;

import javax.ejb.EJB;

import dao.GaertnerDAO;
import facade.IGaertner;

public class GaertnerFacadeImpl implements IGaertner{
	
	@EJB
	private GaertnerDAO gaertnerDAO;

}
