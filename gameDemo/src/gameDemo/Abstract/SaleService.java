package gameDemo.Abstract;

import gameDemo.Entities.Campaign;
import gameDemo.Entities.Game;
import gameDemo.Entities.Gamer;

public interface SaleService {
	void sale(Gamer gamer,Game game);
	void campaignSale(Gamer gamer,Game game,Campaign campaign);
}
