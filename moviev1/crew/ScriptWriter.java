package com.lxisoft.moviev1.crew;
import com.lxisoft.moviev1.test.*;
//import java.io.*;
import java.util.*;
public class ScriptWriter 
{
	private String name;
	
	//InputStreamReader r=new InputStreamReader(System.in);  
	//BufferedReader br=new BufferedReader(r);
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void writeScript(MovieScript ms)
	{
		ms.setTitle("Pookkalam Varavayi");
		ms.getDirector().setName("Lal Jose");
		name="Lal";
		ms.setType("Romantic comedy");
		ms.setCharacters(new ArrayList <Character>());
		Character c = new Character();
		c.setCharacterName("Balan");
		ms.getCharacters.add(c);
	}
	
	
}
		