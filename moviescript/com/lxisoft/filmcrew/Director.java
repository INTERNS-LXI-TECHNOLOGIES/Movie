package com.lxisoft.filmcrew;
import com.lxisoft.actors.*;
import java.io.*;
import java.util.*;
public class Director
{
private String name="Prithviraj";

public String getName()
{
return name;
}
    Hero hero=new Hero();
	Heroine heroine=new Heroine();
	Villain villain=new Villain();
	Comedian comedian=new Comedian(); 
public void cast()
{	
	hero.setCharacterName("Mohanlal");
	hero.setRoleName("Stephen nedumpalli");
	hero.setRole("Hero");
	
	heroine.setCharacterName("Manju warrier");
	heroine.setRoleName("Priyadarshini ramdas");
	heroine.setRole("Heroine");
	
	villain.setCharacterName("vivek oberoi");
	villain.setRoleName("Bobby");
	villain.setRole("Villain");
	
	comedian.setCharacterName("Suraj");
	comedian.setRoleName("Biju");
	comedian.setRole("Comedy artist");
	
	System.out.println(hero.getRole()+": "+hero.getCharacterName()+" as "+hero.getRoleName());
	System.out.println(heroine.getRole()+": "+heroine.getCharacterName()+" as "+heroine.getRoleName());	
	System.out.println(villain.getRole()+": "+villain.getCharacterName()+" as "+villain.getRoleName());
	System.out.println(comedian.getRole()+": "+comedian.getCharacterName()+" as "+comedian.getRoleName());
}

public void directSong()throws Exception
{
	
	ArrayList<String> hero=new ArrayList<String>();
	ArrayList<String> heroine=new ArrayList<String>();
		
	File h=new File("song.txt");
	FileReader hr=new FileReader(h);
	BufferedReader kr=new BufferedReader(hr);
	
	String x=null;
	
	while((x=kr.readLine())!=null)
{	
	String a[]=x.split(",");
	if(a[0].equals("Hero"))
	{
       hero.add(a[1]);
	}
	else
	{
		heroine.add(a[1]);
	}
}
	
	for(int i=0;i<3;i++)
{
System.out.println("Hero : "+hero.get(i));
System.out.println("Heroine : "+heroine.get(i));
}	
	
}

}