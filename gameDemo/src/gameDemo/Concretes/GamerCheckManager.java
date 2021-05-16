package gameDemo.Concretes;

import gameDemo.Abstract.GamerCheckService;
import gameDemo.Entities.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		return true;
		
	}
	
}
