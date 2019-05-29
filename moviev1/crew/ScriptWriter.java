package com.lxisoft.moviev1.crew;
import com.lxisoft.moviev1.test.*;
import java.io.*;
import java.util.*;
public class ScriptWriter 
{
	private String name;
	Scanner scan=new Scanner(System.in);
	InputStreamReader r=new InputStreamReader(System.in);  
	BufferedReader br=new BufferedReader(r);
	String c;
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void writeScript(Movie movie)
	{
		movie.setTitle("Pookaalam Varavayi");
		movie.getDirector().setName("Lal Jose");
		name="Lal";
		movie.setType("Romantic comedy");
	}
	public Role addCharacters()
	{
		Role role = new Role();
		try
		{
		role.setRoleName(br.readLine());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return role;
	}
	public Scene makeScenes()
	{
		Scene scene=new Scene();
		scene.setNo(scan.nextInt());
		return scene;
		
	}
	public Dialogue makeDialogue()
	{
		Dialogue dialogue=new Dialogue();
		try
		{
		dialogue.setLine(br.readLine());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return dialogue;
	}
	public String getCharacter()
	{
		try{
		System.out.print("Which character you want to edit :");
		c=br.readLine();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return c;
	}
	public String getScene()
	{
		System.out.print("which scene:");
		c=scan.next();
		return c;
	}

}
		