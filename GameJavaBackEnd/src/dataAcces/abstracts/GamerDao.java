package dataAcces.abstracts;

import entities.concretes.Gamer;

public interface GamerDao {
	void add(Gamer gamer);
	void delete(Gamer gamer);
	void update (Gamer gamer);

}
