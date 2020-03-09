package task7.abstract_factory_method;



public class PC extends Computer{
	 
	private String ram,cpu;
	PC(String ram,String cpu){
		this.ram=ram;
		this.cpu=cpu;
	}
	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.ram;
	}

}