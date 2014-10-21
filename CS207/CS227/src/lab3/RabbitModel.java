package lab3;

import java.util.Random;

public class RabbitModel {	
	  private int rabbitPop;
	  
	  public RabbitModel()
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

