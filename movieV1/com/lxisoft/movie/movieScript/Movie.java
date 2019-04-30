package com.lxisoft.movie.movieScript;
import java.util.ArrayList;
import java.util.Scanner;
import com.lxisoft.movie.movieScript.*;
public class Movie
{
	Scanner scan=new Scanner(System.in);
	private String name;
	//private ArrayList<Actor>actors=new ArrayList<Actor>();
	private Director director;
	private ScriptWriter scriptWriter=new ScriptWriter();

	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setDirector(Director director)
	{
		this.name=name;
	}
	public  Director getDirector()
	{ 
		return director;
	}
	public void setScriptWriter(ScriptWriter scriptWriter )
	{
		this.scriptWriter=scriptWriter;
	}
	public ScriptWriter getScriptWriter()
	{
		return scriptWriter;
	}
	
	public void startMovie()
	{
		director=new Director();
	    System.out.println("DIRECTOR~  Rajpal");
		System.out.println("SCRIPTWRITER~  Mouly");
	   
		/*for(Actor actor:actors)
		{
			System.out.println("             "+actor.getName()+"  as "+actor.getCharacter().getName());
		}*/
		//System.out.println("   Story by "+scriptWriter.getName());
		//System.out.println("       Directed by "+scriptWriter.getName());
		//script.displayScript();
	}
}