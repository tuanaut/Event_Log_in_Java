package events;
import java.util.Scanner;

public class Event {
	
	private int hour;
	private int minute;
	private int month;
	private int date;
	private int year;
	private String eventName;
	
	public Event() {
		hour = 0;
		minute = 0;
		month = 1;
		date = 1;
		year = 18;
		eventName = "";
			
	}
	
	public void setData(int a, int b, int c, int d, int e, String x)
	{
		hour = a;
		minute = b;
		month = c;
		date = d;
		year = e;
		eventName = x;
	}
	
	
	
	public void printEvent()
	{
		System.out.println("The date of " + eventName + " is: " + month + "/"+ date+ "/" + year);
		System.out.println("At this time: " + hour + ":" + minute);
	}
	
	public boolean isValidDate(int mon, int dat)
	{
		if(mon == 4 || mon == 6 || mon == 9 || mon == 11)
		{
			if(dat < 1 || dat > 30)
			{
				return false;
			}
			else
				return true;
		}
		else if(mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12)
		{
			if(dat < 1 || dat > 31)
			{
				return false;
			}
			else
				return true;
		}
		else if(mon == 2)
		{
			if(dat < 1 || dat > 28)
				return false;
			else
				return true;
					
		}
		else
			return false;
	}
	
	public boolean isValidTime(int x, int y)
	{
		if(x < 0 || x > 12 || y < 0 || y >= 60)
		{
			return false;
		}
		else 
			return true;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

}
