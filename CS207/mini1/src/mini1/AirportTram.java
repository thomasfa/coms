package mini1;

import org.junit.experimental.max.MaxCore;

public class AirportTram {
	public static final int MAX_CAPACITY = 20;
	private int totalPassengersServed = 0;
	private int currentPassengers = 0;
	private int currentStop = 0;
	private int maxPassengers = 0;
	private int numberOfStops = 0;
	private double count = 0;
	

	public AirportTram(int givenNumberOfStops, int givenInitialStop) {
		numberOfStops = givenNumberOfStops;
		currentStop = givenInitialStop;
	}

	public int getTotalPassengersServed() {

		return totalPassengersServed;
	}

	public int getCurrentPassengers() {
		return currentPassengers;
	}

	public int getMaxPassengers() {
		

		return maxPassengers;
	}

	public void restart(int givenInitialStop) {
		totalPassengersServed = 0;
		currentPassengers = 0;
		currentStop = givenInitialStop;
		maxPassengers = 0;
		count = 0;

	}

	public int getCurrentStop() {

		return (currentStop % numberOfStops);
	}

	public void runSegment(int passengersOff, int passengersOn) {
		System.out.println("On: " + passengersOn +" Off: " + passengersOff);
		int availableSpace;
		
		currentPassengers -= passengersOff;
		currentPassengers = Math.max(0, currentPassengers);
		availableSpace = MAX_CAPACITY - currentPassengers;
		passengersOn = Math.min(availableSpace, passengersOn);
		currentPassengers += passengersOn;
		currentPassengers = Math.min(currentPassengers, MAX_CAPACITY);
		totalPassengersServed += passengersOn;
		System.out.println(totalPassengersServed);
		setMaxPassengers();
		currentStop++;
		count++;

	}

	public double getAveragePassengersPerSegment() {
  
		return totalPassengersServed  / count;

	}

	private void setMaxPassengers() {
		if(maxPassengers<currentPassengers){
			maxPassengers=currentPassengers;
		}
	}

}
