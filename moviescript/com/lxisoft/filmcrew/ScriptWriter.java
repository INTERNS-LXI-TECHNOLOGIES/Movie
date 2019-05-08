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

	String b=null;
	String c=null;
		
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
	Random rand=new Random();
	int x=rand.nextInt(5)+2;
	for(int i=0;i<x;i++)
	{
		Collections.shuffle(hero);
		Collections.shuffle(villain);
		System.out.println("Hero:"+hero.get(0));
		System.out.println("Villain:"+villain.get(0));
	}

}
}