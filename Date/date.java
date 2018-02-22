package Date;

public class date {
private int year;
private int month;
private int day;
date()
{
	
}
date(int year,int month,int day)
{
	
}
int getYear()
{
	return this.year;
	
}
int getMonth()
{
	return this.month;
	
}
int getDay()
{
	return this.day;
	
}
void setYear(int year)
{
	this.year=year;
}
void setMonth(int month)
{
	this.month=month;
}
void setDay(int day)
{
	this.day=day;
}
public String toString() {
	String m=String.format("%02d/%02d/%04d",this.day,this.month,this.year);
	return m;
}
void setDate(int year,int month,int day)
{
	this.year=year;
	this.month=month;
	this.day=day;

}
int check(int year,int month,int day)
{ int flag=1;
	if(year<1000||year>9999)
		{
		System.out.println("Invalid year");
		flag=0;
		}
	if(month<1||month>12)
	{ flag=0;
		System.out.println("Invalid month");
		
}
	if(day>31||day<1)
		{System.out.println("Invalid day");
		flag=0;

		}
	return flag;
		}
	

}
