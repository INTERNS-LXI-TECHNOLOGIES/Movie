package com.lxisoft.filmcrew;
import java.io.*;
import java.util.*;
public class ScriptWriter
{
private String name="Anurag";

public String getName()
{
return name;
}

public void script(String type)throws Exception
{
	ArrayList<String> hero=new ArrayList<String>();
	ArrayList<String> heroine=new ArrayList<String>();
	ArrayList<String> villain=new ArrayList<String>();
	ArrayList<String> comedian=new ArrayList<String>();
	
	File f=new File("hero.txt");
	FileReader fr=new FileReader(f);
	BufferedReader br=new BufferedReader(fr);

	File s=new File("villain.txt");
	FileReader fR=new FileReader(s);
	BufferedReader bR=new BufferedReader(fR);
	
	File g=new File("heroine.txt");
	FileReader gr=new FileReader(g);
	BufferedReader dr=new BufferedReader(gr);
	
	File m=new File("comedian.txt");
	FileReader gR=new FileReader(m);
	BufferedReader dR=new BufferedReader(gR);


	String b=null;
	String c=null;
	String d=null;
	String e=null;
		
	while((b=br.readLine())!=null)
{	
	String a[]=b.split(",");
	if(a[0].equals(type))
	{
		hero.add(a[1]);
	}
	
}

    while((c=bR.readLine())!=null)
	{
		
		String a[]=c.split(",");
		if(a[0].equals(type))
		{
			villain.add(a[1]);
		}
	}
	
	while((d=dr.readLine())!=null)
	{
		String a[]=d.split(",");
		if(a[0].equals(type))
		{
			heroine.add(a[1]);
		}
	}
	
	while((e=dR.readLine())!=null)
	{
		String a[]=e.split(",");
		if(a[0].equals(type))
		{
			comedian.add(a[1]);
		}
	}
	
	Random rand=new Random();
	int x=rand.nextInt(5)+2;
	
	//List<String>givenList=new ArrayList("Hero","Heroine","Villain","Comedian");
	
	for(int i=0;i<x;i++)
	{
		String[] a={"Hero","Heroine","Villain","Comedian"};
		int randomIndex=rand.nextInt(a.length);
		String randomElement=a[randomIndex];
		
		
		Collections.shuffle(hero);
		Collections.shuffle(villain);
		Collections.shuffle(heroine);
		Collections.shuffle(comedian);
		
		if(randomElement.equals("Hero"))
		{
			System.out.println("Hero:"+hero.get(0));
		}
		
		else if(randomElement.equals("Heroine"))
		{
			System.out.println("Heroine:"+heroine.get(0));
		}
		else if(randomElement.equals("Villain"))
		{
		System.out.println("Villain:"+villain.get(0));
		}
		else
		{
			System.out.println("Comedian:"+comedian.get(0));
		}
		
		/*System.out.println("Hero:"+hero.get(0));
		System.out.println("Villain:"+villain.get(0));
		System.out.println("Heroine:"+heroine.get(0));
		System.out.println("Comedian:"+comedian.get(0));*/
	}

}
}