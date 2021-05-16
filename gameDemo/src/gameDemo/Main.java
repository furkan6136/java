package gameDemo;

import java.time.LocalDate;

import gameDemo.Adapter.MernisServiceAdapter;
import gameDemo.Concretes.CampaignManager;
import gameDemo.Concretes.GameManager;
import gameDemo.Concretes.GamerManager;
import gameDemo.Concretes.SaleManager;
import gameDemo.Entities.Campaign;
import gameDemo.Entities.Game;
import gameDemo.Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		Gamer gamer=new Gamer(1, "Furkan", "Sarmýsak", LocalDate.of(1996, 1, 28), "***********");
		gamerManager.save(gamer);
		gamerManager.update(gamer);
		gamerManager.delete(gamer);
		GameManager gameManager = new GameManager();
		Game game=new Game(1, "ETS 2", 25);
		gameManager.save(game);
		gameManager.update(game);
		gameManager.delete(game);		
		CampaignManager campaignManager=new CampaignManager();
		Campaign campaign=new Campaign(1,"Þahane Cuma");
		campaignManager.add(campaign);
		campaignManager.upddate(campaign);
		campaignManager.delete(campaign);
		SaleManager saleManager=new SaleManager();
		saleManager.sale(gamer, game);
		saleManager.campaignSale(gamer, game, campaign);
		
		


	}

}
