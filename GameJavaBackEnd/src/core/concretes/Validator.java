package core.concretes;

import java.rmi.RemoteException;

import core.abstracts.ValidatorService;
import entities.concretes.Gamer;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Validator implements ValidatorService {

	@SuppressWarnings("deprecation")
	@Override
	public boolean isValid(Gamer gamer) {
		boolean result = false;

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),
					gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(),
					gamer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

}
