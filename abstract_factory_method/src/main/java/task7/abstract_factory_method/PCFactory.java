package task7.abstract_factory_method;


public class PCFactory implements Computer_abstract_factory {

	private String ram;
	
	private String cpu;
	
	public PCFactory(String ram, String cpu){
		this.ram=ram;
		this.cpu=cpu;
	}
	@Override
	public Computer createComputer() {
		return new PC(ram,cpu);
	}

}
