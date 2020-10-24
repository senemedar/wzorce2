package creational.singleton;

public class CommandStation {
	private static CommandStation commandStation = null;
	private static String commandStationType = "DeathStar";
	
	private CommandStation() {
	}
	
	public static CommandStation getCommandStation() {
		if (commandStation == null) {
			commandStation = new CommandStation();
		}
		return commandStation;
	}
	
	public static String getCommandStationType() {
		return commandStationType;
	}
}
