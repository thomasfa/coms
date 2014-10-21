package lab3;
	
public class RabbitModel1 {	
	  private int rabbitPop;
	 
	  public RabbitModel1()
	  {
	    rabbitPop=0;
	  }  
	 
	  public int getPopulation()
	  {
	    return rabbitPop;
	  }
	  
	  public void simulateYear()
	  {
	    rabbitPop+=1;
	    rabbitPop=5%rabbitPop;
	  }
	  
	  public void reset()
	  {
	    rabbitPop=0;
	  }
}

