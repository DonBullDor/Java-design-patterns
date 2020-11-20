
public class WildAnimalFactory implements AnimalFactory {

	public Dog createDog() {
		return new WildDog();
	}

	public Tiger createTiger() {
		return new WildTiger();
	}

}
