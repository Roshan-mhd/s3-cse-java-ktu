/*public class GarbageCollector{
	public static void main(String [] args) throws InterruptedException
	{
		GarbageCollector g1 = new GarbageCollector();
		GarbageCollector g2 = new GarbageCollector();
		System.out.println(g1);
		System.out.println(g2);
		g1 = null;
		System.gc();
		g2 = null;
		Runtime.getRuntime().gc();
	}
	protected void finalize() throws Throwable
	{
		System.out.println("Garbage Collector is called");
		System.out.println("Object is garbage collected " + this);
	}
}*/


public class GarbageCollector {
    public static void main(String[] args) {
        GarbageCollector g1 = new GarbageCollector();
        GarbageCollector g2 = new GarbageCollector();

        System.out.println(g1);
        System.out.println(g2);

        g1 = null;
        System.gc();  // Request garbage collection
        g2 = null;
        Runtime.getRuntime().gc();  // Another request for garbage collection
    }
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collector is called");
        System.out.println("Object is garbage collected: " + this);
    }
}
