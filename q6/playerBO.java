package q6;

public class playerBO {
void searchByName(playerss p[],String a)
{ 
	int flag=0;
	
	for(int i=0;i<p.length;i++)
	{ 
		if(p[i].getName().equals(a))
		{
			System.out.println(p[i]);
flag=1;
			
			//break;
		}
		
	}
	if(flag==0)
	{
		System.out.println("Player with name "+a+" not found");
	}
	
	}

void listPlayersBelongingToList(playerss p[],String a)
{ int flag=0;

	for(int i=0;i<p.length;i++)
	{ 
		if(p[i].getCountry().equals(a))
		{
			System.out.println(p[i].getName());
			flag=1;
			
		}
		
	}
	if(flag==0)
	{
		System.out.println("No player with country "+a+" found");
	}
	
}
}
