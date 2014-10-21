package lab3;

public class RabbitModel4 {	
	  private int rabbitPop;
	  private int previousPop= 1;
	  private int yearbefore= 0;
	 
	  public RabbitModel4()
	  {
	    rabbitPop=0;
	  }  
	 
	  public int getPopulation()
	  {
	    return rabbitPop;
	  }
	  
	  public void simulateYear()
	  {
	    rabbitPop = previousPop + yearbefore;
	    yearbefore = previousPop;
	    previousPop=rabbitPop;
	  }
	  
	  public void reset()
	  {
	    rabbitPop=2;
	    previousPop=1;
	    yearbefore=0;
	  }
}

