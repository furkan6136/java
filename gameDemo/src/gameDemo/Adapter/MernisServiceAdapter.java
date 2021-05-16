package gameDemo.Adapter;

import java.rmi.RemoteException;

import gameDemo.Abstract.GamerCheckService;
import gameDemo.Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService {
	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		boolean result;
		tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {

			result = client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),
					gamer.getFitstName().toUpperCase(), gamer.getLastName().toUpperCase(),
					gamer.getDateOfBirth().getYear());

		} catch (RemoteException e) {
			result = false;
			e.printStackTrace();
		}
		return result;
	}
}
