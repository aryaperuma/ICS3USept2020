package oop;

public class SuperheroOrgins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superhero blackWidow = new Superhero();

		blackWidow.heroName = "Black Widow";
		blackWidow.realName = "Natasha Romanoff";
		blackWidow.powers = "Expert tactician, hand-to-hand combatant and secret agent Slowed aging, and enhanced immune system Expert marksman and mastery of various other weapons Equipment via gauntlets: grappling hook knock out gas taser explosives tear gas pellets radio transmitter";
		blackWidow.movies = " Avengers Endgame, Avengers Infinity War, Captain America: Civil War, Avengers: Age of Ultron, Captain America: The Winter Soldier, The Avengers, Iron Man 2";
		blackWidow.backstory = " The character was introduced as a Russian spy, an antagonist of the superhero Iron Man. She later defected to the United States, becoming an agent of the fictional spy agency S.H.I.E.L.D. and a member of the superhero team the Avengers. ";
		blackWidow.printBackstory();

		blackWidow.details();
	}

}
