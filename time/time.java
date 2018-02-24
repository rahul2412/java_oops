package time;

public class time {
	private int hours;
	private int mins;
	private int secs;
	
	public String toString() {
		String m=String.format("%02d:%02d:%02d",this.hours,this.mins,this.secs);
		return m;
	}
	void setTime(int hours,int mins,int secs)
	{
		this.hours=hours;
		this.mins=mins;
		this.secs=secs;

	}
	void next()
	{
		if(this.secs==59)
			{
			this.secs=0;
			if(this.mins==59)
			{
				this.mins=0;
				this.hours+=1;
				if(this.hours==24)
					this.hours=0;
			}
			else
			this.mins+=1;
			}
		else 
			this.secs+=1;
	}
	
}
