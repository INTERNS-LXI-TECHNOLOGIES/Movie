package com.lxisoft.filmcrew;
import com.lxisoft.test.*;
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
	//int x=rand.nextInt(5)+2;
	try
	{
	
	int r=rand.nextInt(3)+5;
	String element=null;
	//int r=(int)(Math.random()*8);
	//List<String>givenList=new ArrayList("Hero","Heroine","Villain","Comedian");
		//throw new MyException();
	
	for(int j=0;j<r;j++)
	{
		System.out.println("--------------------------------------------SCENE "+(j+1)+"-------------------------------------------------------");
		System.out.println(" ");
		int x=rand.nextInt(5)+2;
	for(int i=0;i<x;i++)
	{
		String[] a={"Stephen","Manju","Bobby","Suraj"};
		int randomIndex=rand.nextInt(a.length);
		String randomElement=a[randomIndex];
		
		if(randomElement!=element)
		{
		 element=randomElement;
		Collections.shuffle(hero);
		Collections.shuffle(villain);
		Collections.shuffle(heroine);
		Collections.shuffle(comedian);
		
		if(randomElement.equals("Stephen"))
		{
			System.out.println("Stephen:"+hero.get(0));
			System.out.println(" ");
			
		}
		
		else if(randomElement.equals("Manju"))
		{
			System.out.println("Manju:"+heroine.get(0));
			System.out.println(" ");
			
		}
		else if(randomElement.equals("Bobby"))
		{
		System.out.println("Bobby:"+villain.get(0));
		System.out.println(" ");
		
		}
		else
		{
			System.out.println("Suraj:"+comedian.get(0));
			System.out.println(" ");
			
		}
		}
		else{
			//System.out.println("Error");
		}
		
		/*System.out.println("Hero:"+hero.get(0));
		System.out.println("Villain:"+villain.get(0));
		System.out.println("Heroine:"+heroine.get(0));
		System.out.println("Comedian:"+comedian.get(0));*/
	}
	}
	throw new MyException("Exception");
  }
  catch(MyException x)
  {
	//System.out.println(ex);
	//System.out.println("caught");
	//System.out.println(x.getMessage());
	 //System.out.println("In the catch clock due to Exception = "+x);
  }	

}
}