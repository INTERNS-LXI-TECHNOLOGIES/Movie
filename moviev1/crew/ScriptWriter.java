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
	/*public Role selectCharacters()
	{
		System.out.print("Select characters for each scene:");
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
		
	}*/
}
		