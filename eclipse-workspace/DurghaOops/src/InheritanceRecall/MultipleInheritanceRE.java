package InheritanceRecall;


 class Bus{
	
	private String busName;
	private  int seat;
	private float millage;
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public float getMillage() {
		return millage;
	}
	public void setMillage(float millage) {
		this.millage = millage;
	}

	
	//bus class common method for all buses 
	
	public void startBus() {
		System.out.println("The bus is starting");
		
	}
	
	public void stopBus() {
		
		System.out.println("The bus is stop");
		
		
	}
	
	

  	
}


 class Bus2{
	
	private String busName;
	private  int seat;
	private float millage;
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public float getMillage() {
		return millage;
	}
	public void setMillage(float millage) {
		this.millage = millage;
	}

	
	//bus class common method for all buses 
	
	public void startBus() {
		System.out.println("The bus is starting");
		
	}
	
	public void stopBus() {
		
		System.out.println("The bus is stop");
		
		
	}
	
	

  	
}









public class MultipleInheritanceRE  extends Bus{

	public static void main(String[] args){
		

	}

}
