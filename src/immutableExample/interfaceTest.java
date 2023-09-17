package immutableExample;

@FunctionalInterface
public interface interfaceTest {
	
	abstract boolean myTest();
	
	//boolean test();
	
	default int getValue() {
		return 0;
	}
	
	default int getPrint() {
		return 0;
	}
	
	static String getName() {
		return null;
	}
	
	static String getAddress() {
		return null;
	}

}
