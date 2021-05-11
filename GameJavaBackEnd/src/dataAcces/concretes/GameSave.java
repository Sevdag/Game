package dataAcces.concretes;

import dataAcces.abstracts.GameDao;
import entities.concretes.Gamer;

public class GameSave implements GameDao {

	@Override
	public void add(Gamer gamer) {
System.out.println(" Oyun "  +gamer.getFirstName()+ " Satýldý ");		
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
