package task7.singleton;


public class SingletonDemo{

	   public static void main(String[] args) {
	      //illegal construct

	      //Compile Time Error: The constructor SingleObject() is not visible

	      //SingleObject object = new SingleObject();

	      //Get the only object available

	      Singleton obj = Singleton.getObject();

	      obj.show();

	   }

	}