
public class SpaceTurtle extends DrunkTurtle {
	
	    public SpaceTurtle() {
	        super();
	    }

	    public void moveForward(double distance) {
	        double randomValue = Math.random();
	        if (randomValue <= 0.5) {
	            super.moveForward(distance); 
	        } else if (randomValue <= 0.7) {
	            moveForwardNormal(distance); 
	        }
	        
	    }
	    
	    public void turnLeft(int degrees) {
	    	 double randomValue = Math.random();
		        if (randomValue <= 0.5) {
		            super.turnLeft(degrees); 
		        } else if (randomValue <= 0.7) {
		         turnLeftNormal(degrees); 
		        }
	    }
	    
	    public void turnRight(int degrees) {
	    	 double randomValue = Math.random();
		        if (randomValue <= 0.5) {
		            super.turnRight(degrees); 
		        } else if (randomValue <= 0.7) {
		            turnRightNormal(degrees); 
		        }
	    }
}
