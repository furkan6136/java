package gameDemo.Concretes;

import gameDemo.Abstract.GamerCheckService;
import gameDemo.Abstract.GamerService;
import gameDemo.Entities.Gamer;

public class GamerManager implements GamerService{
	private GamerCheckService gamerCheckService;
	public GamerManager(GamerCheckService gamerCheckService) {
	
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void save(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Ge�erli kimlik : "+gamer.getFitstName()+" "+gamer.getLastName()+" kaydedildi");
		}else {
			System.out.println("Ge�ersiz kimlik : "+gamer.getNationalityId());
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Ge�erli kimlik : "+gamer.getFitstName()+" "+gamer.getLastName()+" g�ncellendi");
		}else {
			System.out.println("Ge�ersiz kimlik : "+gamer.getNationalityId());
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Ge�erli kimlik : "+gamer.getFitstName()+" "+gamer.getLastName()+" silindi");
		}else {
			System.out.println("Ge�ersiz kimlik : "+gamer.getNationalityId());
		}
		
	}

}
