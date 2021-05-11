package bussines.concretes;

import bussines.abstracts.CampaignService;
import entities.concretes.Game;

public class CampaignManager implements CampaignService {
	private Game game;

	public CampaignManager(Game game) {
		this.game = game;
	}

	@Override
	public void add(String name) {
		System.out.println("Kampanyasý eklendi : "+name);

	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public double disCount(double unitPrice) {
		return  this.game.getUnitPrice()- unitPrice;
	}

}
