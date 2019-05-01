package com.lxisoft.moviev1.crew;
import com.lxisoft.moviev1.cast.*;
import com.lxisoft.moviev1.test.*;
import java.io.*;
import java.util.*;
public class Director
{
	private String name;
	InputStreamReader r=new InputStreamReader(System.in);  
	BufferedReader br=new BufferedReader(r);
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public Actor selectCast()
	{
		Actor actor = new Actor();
		try
		{
		actor.setName(br.readLine());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return actor;
		
		
	}
}
