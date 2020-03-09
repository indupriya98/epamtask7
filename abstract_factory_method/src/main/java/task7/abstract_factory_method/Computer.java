package task7.abstract_factory_method;

public abstract class Computer {
    public abstract String getCPU();
    public abstract String getRAM();
    @Override
    public String toString() {
		return  "CPU="+this.getCPU()+"RAM="+this.getRAM();
   	 
    }
}
