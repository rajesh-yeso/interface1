package loop.com;

public class FlyableInterfaceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyInterface[] flyingObjects = { new Bird(), new Aeroplane() };
		for (int i = 0; i < flyingObjects.length; i++) {
			flyingObjects[i].fly();
		}
	}
}
