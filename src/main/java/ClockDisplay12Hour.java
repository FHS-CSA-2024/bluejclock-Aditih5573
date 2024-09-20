





public class ClockDisplay12Hour
{
	
    //Implement 2 private NumberDisplay objects. 
	//  One for hours and one for minutes
    //Implement a private String for the display
	
	//ClockDisplay hours = new ClockDisplay (---)
	//NumberDisplay hours = new NumberDisplay (---)
	
	private NumberDisplay hours;
	private NumberDisplay minutes;
	private String display;
	private boolean test = false;

    //Implement a constructor that takes no parameters
    //The constructor should set hours as a NumberDisplay object with 24 as the limit
    //The constructor should set minutes as a NumberDisplay object with 60 as the limit
    //The constructor should call the method updateDisplay before finishing
	public ClockDisplay12Hour()
	{
		hours = new NumberDisplay(24);
		minutes = new NumberDisplay(60);
		updateDisplay();
	}
    
    //Implement a constructor that takes 2 parameters, hour and minute
    //The constructor should set hours as a NumberDisplay object with 24 as the limit
    //The constructor should set minutes as a NumberDisplay object with 60 as the limit
    //The constructor should call the method setTime with the parameters passed in
	
	public ClockDisplay12Hour(int hour, int minute)
	{
		hours = new NumberDisplay(24);
		minutes = new NumberDisplay(60);
		setTime(hour,minute);
	}
	
	
    
    //Implement a method timeTick that takes no parameters and returns nothing
    //The method should increase the minute value by one each run
    //The hours should increase when the minutes roll over
    //The updateDisplay method should be called before finishing
	
	public void timeTick()
	{
		minutes.increment();
		
		if (minutes.getValue()==60)
		{
			minutes.setValue(0);
			hours.increment();
		if (hours.getValue()==24)
		{
			hours.setValue(0);
			test = true;
		}
		}
		updateDisplay();
	}
	
	
	
    
    //Implement a method setTime that takes in 2 parameters, hour and minute
    //The method should set the hours value and minutes value
    //The updateDisplay method should be called before finishing
	
	public void setTime(int hour, int minute)
	{
		hours.setValue(hour);
		minutes.setValue(minute);
		updateDisplay();
		
		
	}
    
    //Implement a method getTime that takes no parameter and returns a String
    //The return String should be formatted as HH:MM and report out the current time
	
	public String getTime()
	{
	display = "";
	display+=hours.getDisplayValue() + ":" + minutes.getDisplayValue();
	return display;
	}

    //Implement a method updateDisplay that takes no parameters and returns nothing
    //The method should update the displayString with the current time in a format
    //  HH:MM
	
	public void updateDisplay()
	{
		display = "";
		if (test)
		{
			display+=(12)+ ":" + String.format("%02d",minutes.getValue()) + "AM";
		}
		else if (hours.getValue()==12)
		{
			display+=String.format("%02d",hours.getValue())+ ":" + String.format("%02d",minutes.getValue()) + "PM";
		}
		else if (hours.getValue()>12)
		{
			display+=String.format("%02d",hours.getValue()%12)+ ":" + String.format("%02d",minutes.getValue()) + "PM";
		}
		else 
		{
			display+=String.format("%02d",hours.getValue())+ ":" + String.format("%02d",minutes.getValue()) + "AM";
		}
		System.out.println(display);
	}
}

