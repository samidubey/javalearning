package javalearning;

public class useInterface implements car {
	int Speed;
	String Model;
	int Gear;

	public int carSpeed(int intSpeed) {
		return Speed = intSpeed;
	}

	public int changeGear(int intGear) {
		return Gear = intGear;
	}

	public String carModel(String strModel) {
		return Model = strModel;
	}
}
