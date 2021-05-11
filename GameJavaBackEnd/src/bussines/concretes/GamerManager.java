package bussines.concretes;

import bussines.abstracts.GamerService;
import core.abstracts.ValidatorService;
import dataAcces.abstracts.GamerDao;
import entities.concretes.Gamer;

public class GamerManager implements GamerService {
	private ValidatorService validatorService;
	private GamerDao gamerDao;
	

	public GamerManager(ValidatorService validatorService,GamerDao gamerDao ) {
		this.validatorService=validatorService;
		this.gamerDao=gamerDao;
	}

	@Override
	public void add(Gamer gamer) {
		if (!validatorService.isValid(gamer)) {
			System.out.println("Bilgileriniz hatalý  lütfen kontrol ediniz : ");
			return;
		}
		this.gamerDao.add(gamer);

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
