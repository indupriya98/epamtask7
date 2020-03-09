package task7.Factory;

public abstract class Computer {
     public abstract String getCPU();
     public abstract String getRAM();
     @Override
     public String toString() {
		return  "CPU="+this.getCPU()+"RAM="+this.getRAM();
    	 
     }
}
