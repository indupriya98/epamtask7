package task7.abstract_factory_method;


public class ComputerFactory {

public static Computer getComputer(Computer_abstract_factory factory){
		return factory.createComputer();
	}
}