package task7.abstract_factory_method;
public class ServerFactory implements Computer_abstract_factory {

	private String ram;
	
	private String cpu;
	
	public ServerFactory(String ram, String cpu){
		this.ram=ram;
		this.cpu=cpu;
	}
	@Override
	public Computer createComputer() {
		return new PC(ram,cpu);
	}

}