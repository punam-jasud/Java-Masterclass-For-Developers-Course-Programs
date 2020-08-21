package section7.polymorphism.example1;

import section7.composition.example1.Case;

class Movie {
	private String nameString;

	public Movie(String nameString) {
		this.nameString = nameString;
	}

	public String plot() {
		return "No plot here";
	}

	public String getNameString() {
		return nameString;
	}

}

class Jaws extends Movie {

	public Jaws() {
		super("Jaws");
	}

	public String plot() {
		return "A shark eats a lot of people";
	}
}

class IndependanceDay extends Movie {

	public IndependanceDay() {
		super("Independance Day");

	}

	@Override
	public String plot() {
		return "Aliens attempt to take over earth planet";
	}

}

class MazeRunner extends Movie {

	public MazeRunner() {
		super("Maze Runner");

	}

	@Override
	public String plot() {

		return "kids try and escape maze";
	}

}

class StarWars extends Movie {

	public StarWars() {
		super("Star Wars");

	}

	@Override
	public String plot() {

		return "Imperial Forces try to take over universe";
	}

}

class ForgettableMovie extends Movie {
	public ForgettableMovie() {
		super("Forgettable");
	}
	//No plot method
}

public class Movies {

	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			Movie movie = randoMovie();
			System.out.println("Movie #"+i+" : "+movie.getNameString()+"\n"+"Plot : "+movie.plot()+"\n");
		}
	}
	
	public static Movie randoMovie() {
		int randomNumber = (int)(Math.random()*5)+1;
		System.out.println("Random number generated was : "+randomNumber);
		switch (randomNumber) {
		case 1:
				return new Jaws(); 
		case 2:
			return new IndependanceDay();
		case 3:
			return new MazeRunner();
		case 4:
			return new StarWars();
		case 5:
			return new ForgettableMovie();

		default:
			return null;	
		}
	}

}
