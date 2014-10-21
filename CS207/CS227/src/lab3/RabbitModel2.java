package lab3;

public class RabbitModel2 {	
	  private int rabbitPop;
	  
	  public RabbitModel2()
	  {
	    rabbitPop=500;
	  }  
	
	  public int getPopulation()
	  {
	    return rabbitPop;
	  }
	
	  public void simulateYear()
	  {
	    rabbitPop/=2;
	  }
	  
	  public void reset()
	  {
	    rabbitPop=500;
	  }
}

