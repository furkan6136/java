package gameDemo.Abstract;

import gameDemo.Entities.Game;

public interface GameService {

	public void save(Game game);
	public void update(Game game);
	public void delete(Game game);
}
