package task7.Factory;
public class Demo {

	public static void main(String[] args) {
		Computer pc = CFactory.getComputer("pc","2 GB","2.4 GHz");
		Computer server = CFactory.getComputer("server","16 GB","2.9 GHz");
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);
	}

}
