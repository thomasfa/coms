package mini1;


public class test {

	public static void main(String[] args) {
		AirportTram tram = new AirportTram(5, 3);
		tram.runSegment(0, 5);
//		System.out.println("Current: "+tram.getCurrentPassengers());
		System.out.println("Served: "+tram.getTotalPassengersServed());
		System.out.println("Current Passengers: "+tram.getCurrentPassengers());
		tram.runSegment(1, 19);
		System.out.println("Current Passengers: "+tram.getCurrentPassengers());

		System.out.println("Served: "+tram.getTotalPassengersServed());
		System.out.println("Expected: 21");
//		System.out.println(tram.getCurrentPassengers());
//		System.out.println(tram.getMaxPassengers());
//		tram.runSegment(7, 2);
//		System.out.println(tram.getMaxPassengers());
//		System.out.println(tram.getMaxPassengers());
//		tram.runSegment(0, 10);
//		System.out.println(tram.getCurrentPassengers());
	}

}
//int current = Math.min(MAX_CAPACITY, currentPassengers + passengersOn
//		- passengersOff);
//if (count >= 1) {
//	int mod = Math.max(0, (currentPassengers + passengersOn)
//			% MAX_CAPACITY);
//	current-= mod;
//	System.out.println("Current Modulated: " + mod);
//}