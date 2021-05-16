package gameDemo.Concretes;

import gameDemo.Abstract.GameService;
import gameDemo.Entities.Game;

public class GameManager implements GameService {

	@Override
	public void save(Game game) {
		System.out.println(game.getGameName()+" eklendi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+" güncellendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+" silindi");
		
	}

}
