
public class App {

	public static void main(String[] args) {
		Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        asteriskLogger.Log("Cesar Run");
        asteriskLogger.Error("Cesar will not run!!!!!");
        System.out.println();
        spacedLogger.Log("Automobile");
        System.out.println();
        spacedLogger.Error("I have lost my Automobile!!!");
	}
}
