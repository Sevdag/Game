package bussines.abstracts;

import entities.concretes.Gamer;

public interface GameService {
	void add(Gamer gamer);

	void delete(Gamer gamer);

	void update(Gamer gamer);

}
