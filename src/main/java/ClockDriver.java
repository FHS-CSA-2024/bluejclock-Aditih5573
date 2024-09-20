

public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
    	
    	ClockDisplay clock1 = new ClockDisplay();
    	
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        
    	ClockDisplay clock2 = new ClockDisplay(3, 32);
    	clock2.timeTick();
    	ClockDisplay clock3 = new ClockDisplay(3, 9);
    	clock3.timeTick();
    	ClockDisplay clock4 = new ClockDisplay(1, 59);
    	clock4.timeTick();
    	ClockDisplay clock5 = new ClockDisplay(9, 59);
    	clock5.timeTick();
    	ClockDisplay clock6 = new ClockDisplay(23, 59);
    	clock6.timeTick();
    	System.out.println();
    	
    	
    	
    	
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
    	ClockDisplaySeconds clock7 = new ClockDisplaySeconds();
    	
    	
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
    	ClockDisplaySeconds clock8 = new ClockDisplaySeconds(3, 32, 59);
    	clock8.timeTick();
    	ClockDisplaySeconds clock9 = new ClockDisplaySeconds(1, 0, 59);
    	clock9.timeTick();
    	ClockDisplaySeconds clock10 = new ClockDisplaySeconds(1, 59, 59);
    	clock10.timeTick();
    	ClockDisplaySeconds clock11 = new ClockDisplaySeconds(23, 59, 59);
    	clock11.timeTick();
    	System.out.println();
    	
        
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
    	ClockDisplay12Hour clock12 = new ClockDisplay12Hour();
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
    	
    	ClockDisplay12Hour clock13 = new ClockDisplay12Hour(15, 32);
    	clock13.timeTick();
    	ClockDisplay12Hour clock14 = new ClockDisplay12Hour(23, 59);
    	clock14.timeTick();
    	ClockDisplay12Hour clock15 = new ClockDisplay12Hour(11, 59);
    	clock15.timeTick();
    	ClockDisplay12Hour clock16 = new ClockDisplay12Hour(12, 59);
    	clock16.timeTick();
    	
    }
}

