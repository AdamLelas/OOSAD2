public class Singleton {

	private int count;
	private static Singleton instance;

	private void Singleton() {
		count ++; 
	}

	public int getCount() {
		return count;
	}

	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void demoMethod(){
		System.out.println("This is a demo method that prints number of instance");
		System.out.println("Number of instances" + count);
	}

}
