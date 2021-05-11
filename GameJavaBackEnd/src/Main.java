import java.util.Date;

import bussines.concretes.CampaignManager;
import bussines.concretes.GameManager;
import bussines.concretes.GamerManager;
import core.concretes.Validator;
import dataAcces.concretes.GameSave;
import dataAcces.concretes.HibernateDao;
import entities.concretes.Game;
import entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) {

		Gamer gamer = new Gamer();
		gamer.setId(3);
		gamer.setFirstName("Sevda");
		gamer.setLastName("Güneþ");
		gamer.setDateOfBirth(new Date(2002, 1, 22));
		gamer.setNationalityId("tc");
		GamerManager gameManager = new GamerManager(new Validator(), new HibernateDao());
		gameManager.add(gamer);
		Game game = new Game(1, "Pubg", 70);
		GameManager gameManager2 = new GameManager(new GameSave());
		gameManager2.add(gamer);

		CampaignManager campaignManager = new CampaignManager(game);
		campaignManager.add("Yeni oyuncu");
		System.out.println(campaignManager.disCount(10));

	}

}
