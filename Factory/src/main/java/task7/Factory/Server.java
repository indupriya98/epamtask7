package task7.Factory;

public class Server extends Computer{
	private String ram,cpu;
	Server(String ram,String cpu){
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
