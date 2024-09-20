

	
	public class NumberDisplay
	{
		
		//implement 2 private variables, limit and value.
	    //  both should be ints

	    private int limit;
	    private int value;
	   
	   
	    //implement a constructor that sets the limit to a passed in variable rollOverLimit
	    //  should set value to 0
	    public NumberDisplay( int rollOverLimit)
	    {
	        limit = rollOverLimit;
	        value = 0;
	       
	    }
	   
	   
	   
	    //Implement getter/setter methods for limit and value
	    //  The setValue method should check the input for validity
	    //      (should not be less than 0, or over the limit)
	   
	    public int getLimit(){
	        return limit;
	    }
	   
	    public int getValue(){
	        return value;
	    }
	   
	    public void setLimit(int limit)
	    {
	        this.limit = limit;
	    }
	   
	    public void setValue(int val)
	    {
	        if (val>=0 && val<limit)
	        {
	            value = val;
	        }
	        else
	        {
	            System.out.print("Number is invalid");
	        }
	    }
	    //Implement a function getDisplayValue that take no parameters and returns a String.
	     //  The return string should be formatted as a two digit number
	    //  If the number is less than 10 it should return a 0 before the number.

	    public String getDisplayValue()
	    {
	    	
	        return String.format("%02d", value%100);
	    }
	   
	 	
	    //Implement a method increment that takes no parameters and returns nothing.
	    //  This function should increase value by 1, unless it reaches the limit.
	    //  It should reset to 0 if the limit is reached
	    
	    public void increment()
	    {
	    	if (value<=limit)
	    	{
	    		value++;
	    		
	    	}
	    	else
	    	{
	    		value = 0;
	    	}
	    
	    	
	    }
	    
	    
		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}
	}





