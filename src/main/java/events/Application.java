package events;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 0;
		int hour = 0, minute = 0, month = 0, date = 0, year = 0;
		String eventName;
		boolean repeat = true;
		
		//Hashtable<String, Event> h = new Hashtable<String, Event>();
		ArrayList<Event> eventList = new ArrayList<Event>();
		
		System.out.println("Welcome to the event handler");
		
		printOptions();
		
		while(input != 4) {
			
			Scanner s = new Scanner(System.in);
			System.out.println("What would you like to do?");
			printOptions();
			
			try 
				{
					input = s.nextInt();		
				}
			catch(InputMismatchException ime) {
					System.out.println("Invalid input, Enter one of the options available");
			}
			s.nextLine();
			switch(input) {
			case 1: 
				Event e = new Event();
				int dt, mon, yr, hr, min;
				System.out.println("What is the name of the event?");
				eventName = s.nextLine();
				System.out.println("Event name is " + eventName);
				System.out.println("What date is the event?");
				System.out.println("Enter Month(1-12):");
				repeat = true;
				while(repeat)
				{
					try {
						month = s.nextInt();
						repeat = false;
					}
					catch(InputMismatchException ime)
					{
						System.out.println("Invalid Input, Please enter valid month(1-12)");
						s.next();
						repeat = true;
					}
				}
				System.out.println("Enter Date(1-30):");
				repeat = true;
				while(repeat)
				{
					try {
						date = s.nextInt();
						repeat = false;
					}
					catch(InputMismatchException ime)
					{
						System.out.println("Invalid Input, Please enter valid date");
						s.next();
						repeat = true;
					}
				}
				
				System.out.println("Enter Year(Last 2 Digits):");
				while(repeat)
				{
					try {
						year = s.nextInt();
						repeat = false;
					}
					catch(InputMismatchException ime)
					{
						System.out.println("Invalid Input, Please enter valid year");
						s.next();
						repeat = true;
					}
				}
				
				if(!(e.isValidDate(month, date)))
				{
					while(!(e.isValidDate(month,date)))
					{
						System.out.println("Please reenter a valid date: ");
						System.out.println("Enter Month: ");
						month = s.nextInt();
						System.out.println("Enter Date: ");
						date = s.nextInt();
						System.out.println("Enter Year: ");
						year = s.nextInt();
					}
				}
					
				String m = Integer.toString(month);
				String d = Integer.toString(date);
				String y = Integer.toString(year);
				String mdy = m + d + y;
				
				System.out.println("Enter Hour:");
				hour = s.nextInt();
				System.out.println("Enter minute:");
				minute = s.nextInt();
				
				if(!(e.isValidTime(hour, minute)))
				{
					while(!(e.isValidTime(hour,minute)))
					{
						System.out.println("Please reenter a valid time: ");
						System.out.println("Enter Hour: ");
						hour = s.nextInt();
						System.out.print("Enter Minute: ");
						minute = s.nextInt();
				
					}
				}
				
				e.setData(hour, minute, month, date, year, eventName);
				eventList.add(e);
				//h.put(mdy, e);
				System.out.println("Event added successfully");
				
				break;
			case 2:
				for(int i = 0; i < eventList.size(); i++)
				{
					((Event) eventList.get(i)).printEvent();
				}
				break;
			case 3:
				System.out.println("Enter date to see all events that day:");
				System.out.println("Enter Month: ");
				month = s.nextInt();
				s.nextLine();
				System.out.println("Enter Date: ");
				date = s.nextInt();
				s.nextLine();
				System.out.println("Enter Year: ");
				year = s.nextInt();
				s.nextLine();
				
				/*m = Integer.toString(month);
				d = Integer.toString(date);
				y = Integer.toString(year);
				mdy = m + d + y;
				Event ev = h.get(mdy);
				ev.printEvent();*/
				for(Event evs : eventList)
				{
					if(evs.getMonth() == month && evs.getDate() == date && evs.getYear() == year)
						evs.printEvent();
				}
				
				break;
			case 4:
				System.out.println("Exiting Event Handler");
				break;
			default:
				System.out.println("Invalid input, please enter one of the available options");
				break;
			}
		}
		
		
	}
	
	public static void printOptions() {
		System.out.println("Enter '1' to create an event");
		//System.out.println("Enter '2' to remove an event");
		System.out.println("Enter '2' to print out all options");
		System.out.println("Enter '3' to see all events for a certain date");
		System.out.println("Enter '4' to quit application");
	}

}
