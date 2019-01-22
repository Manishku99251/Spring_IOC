package beans;

public class Car {
	
	private Car() {
		System.out.println("Car class Constructor.........");
	}

	private String[] carnames;
	private Engine[] engines;

	public void setCarnames(String[] carnames) {
		this.carnames = carnames;
	}

	public void setEngines(Engine[] engines) {
		this.engines = engines;
	}
	

	public void printCarData() {
		
		
		for(String car: carnames) {
			
			System.out.println(car);
		}
	}
	public void printEngine() {
		for(Engine e:engines) {
			System.out.println(e.getModelYear());
		}
	}
	
}
