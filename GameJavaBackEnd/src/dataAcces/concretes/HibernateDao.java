package dataAcces.concretes;

import dataAcces.abstracts.GamerDao;
import entities.concretes.Gamer;

public class HibernateDao implements GamerDao{

	@Override
	public void add(Gamer gamer) {
		System.out.println("Oyuncu eklendi : "+gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi");

	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu güncellendi");

		
	}

}
