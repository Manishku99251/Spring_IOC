package beans;

public class Engine {
	
	private Engine() {
		System.out.println("Engine class constructor.......");
	}
	
	private String modelYear;

public void setModelYear(String modelYear) {
	this.modelYear = modelYear;
}	

public String getModelYear() {
	return modelYear;
}

}
