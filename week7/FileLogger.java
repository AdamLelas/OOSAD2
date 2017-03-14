public class FileLogger{
	
	int count;	

	private static FileLogger logger;

	private FileLogger() {	
		count++;
	}

	public static FileLogger getLogger() {
		if( logger == null ){
			logger = new FileLogger();
		}
		return logger;
	}

	public void demoMethod(){
		System.out.println("Number of instances" + count);	
	}
	
	
	
	

	


}
