public class Driver {

	public static void main(String[] args) {
		FileLogger tmp = FileLogger.getLogger();
		tmp.demoMethod();

		FileLogger tmp2 = FileLogger.getLogger();
		tmp2.demoMethod();
		tmp.demoMethod();

	}
}
