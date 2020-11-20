
public class PetAnimalFactory implements AnimalFactory {

	public Dog createDog() {
		return new PetDog();
	}

	public Tiger createTiger() {
		return new PetTiger();
	}

}
