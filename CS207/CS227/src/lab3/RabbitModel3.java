package lab3;
import java.util.Random;

public class RabbitModel3 {	
	  private int rabbitPop;
	  Random r = new Random(15);
	  int increase = r.nextInt(11);
	 
	  public RabbitModel3()
	  {
	    rabbitPop=0;
	  }  
	 
	  public int getPopulation()
	  {
	    return rabbitPop;
	  }
	  
	  public void simulateYear()
	  {
	    rabbitPop+=increase;
	  }
	  
	  public void reset()
	  {
	    rabbitPop=0;
	  }
}

