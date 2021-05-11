package bussines.abstracts;

import entities.concretes.Gamer;

public interface GamerService {
	void add(Gamer gamer);

	void delete(Gamer gamer);

	void update(Gamer gamer);
}
