public class SingletonClient {

	public static void main(String[] args){
		Singleton s1 = Singleton.getInstance();
		s1.demoMethod();

		Singleton s2 = Singleton.getInstance();
		s2.demoMethod();	

	
	}

}
