package gameDemo.Concretes;

import gameDemo.Abstract.SaleService;
import gameDemo.Entities.Campaign;
import gameDemo.Entities.Game;
import gameDemo.Entities.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void sale(Gamer gamer,Game game) {
		System.out.println(gamer.getFitstName()+" "+game.getGameName()+" oyununu satýn aldý");
		
	}

	@Override
	public void campaignSale(Gamer gamer,Game game,Campaign campaign) {
		System.out.println(gamer.getFitstName()+" "+game.getGameName()+" oyununu"+campaign.getCampaignName()+ " kampanyasýyla satýn aldý");
		
	}
	
	
}
