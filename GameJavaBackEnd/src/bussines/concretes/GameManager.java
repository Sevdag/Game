package bussines.concretes;

import bussines.abstracts.GameService;
import dataAcces.abstracts.GameDao;
import entities.concretes.Gamer;

public class GameManager implements GameService {
	private GameDao gameDao;

	public GameManager(GameDao gameDao) {

		this.gameDao = gameDao;
	}

	@Override
	public void add(Gamer gamer) {
		if (gamer.getId() < 2) {
			System.out.println("Size oyun satamýyoruz");
			return;

		}
		gameDao.add(gamer);

	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub

	}

}
