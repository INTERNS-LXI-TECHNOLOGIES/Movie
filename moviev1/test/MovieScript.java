package com.lxisoft.moviev1.test;
import com.lxisoft.moviev1.crew.*;
import com.lxisoft.moviev1.cast.*;
import com.lxisoft.moviev1.test.*;
import java.io.*;
import java.util.*;
public class MovieScript
{
	private String title;
	private String type;
	private Director director;
	private ScriptWriter sw;
	private ArrayList <Actor> actors;
	private ArrayList <Role> roles;
	private ArrayList <Scene> scenes;
	private ArrayList <String> dialogues;
	Scanner scan=new Scanner(System.in);
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getTitle()
	{
		return title;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public String getType()
	{
		return type;
	}
	public void setDirector(Director director)
	{
		this.director=director;
	}
	public Director getDirector()
	{
		return director;
	}
	public void setSw(ScriptWriter sw)
	{
		this.sw=sw;
	}
	public ScriptWriter getSw()
	{
		return sw;
	}
	public void setActors(ArrayList <Actor> actors)
	{
		this.actors=actors;
	}
	public ArrayList <Actor> getActors()
	{
		return actors;
	}
	public void setRoles(ArrayList <Role> roles)
	{
		this.roles=roles;
	}
	public ArrayList <Role> getRoles()
	{
		return roles;
	}
	public void setScenes(ArrayList <Scene> scenes)
	{
		this.scenes=scenes;
	}
	public ArrayList <Scene> getScenes()
	{
		return scenes;
	}
	public void setDialogues(ArrayList <String> dialogues)
	{
		this.dialogues=dialogues;
	}
	public ArrayList <String> getDialogues()
	{                                                                                                                                                                                      
		return dialogues;
	}
	public MovieScript()
	{
	setDirector(new Director());
	setSw(new ScriptWriter());
	setRoles(new ArrayList <Role>());
	setActors(new ArrayList <Actor>());
	setScenes(new ArrayList <Scene>());
	}
	public void characterDetails()
	{
		try
		{
		File file=new File("roles.txt");
		FileWriter fw=new FileWriter(file,true);
		BufferedWriter bw=new BufferedWriter(fw);
		do
		{
		System.out.println("Characters in the movie:");
		roles.add(sw.addCharacters());
		System.out.println("Next character press 1");
		}
		while(scan.nextInt()==1);
		//System.out.println(roles.size());
		for(int i=0;i<roles.size();i++)
		{
			bw.write(roles.get(i).getRoleName()+"\n");
		}
		bw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public void readCharacters()
	{
		try{
		File file=new File("roles.txt");
		FileWriter fw=new FileWriter(file,true);
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
				int k=0;	
				String data;	
				while((data=br.readLine())!=null)
				{
				Role role=new Role();
				role.setRoleName(data);
				roles.add(role);
				}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public void castDetails()
	{
		try
		{
		File file=new File("actors.txt");
		FileWriter fw=new FileWriter(file,true);
		BufferedWriter bw=new BufferedWriter(fw);
		do
		{
		System.out.println("actors in the movie:");
		actors.add(director.selectCast());
		System.out.println("add actors press 1");
		}
		while(scan.nextInt()==1);
		for(int i=0;i<actors.size();i++)
		{
			bw.write(actors.get(i).getName()+"\n");
		}
		bw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public void readActors()
	{
		try{
		File file=new File("actors.txt");
		FileWriter fw=new FileWriter(file,true);
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
				int k=0;	
				String data;	
				while((data=br.readLine())!=null)
				{
				Actor actor=new Actor();
				actor.setName(data);
				actors.add(actor);
				}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public void createScenes()
	{
		int n=1;
		do{
		System.out.print("set secenes in the movie:");
		scenes.add(sw.makeScenes());
		try
		{
		File file=new File("scene"+n+".txt");
		file.createNewFile();
		FileWriter fw=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
		sw.makeDialogue(dialogues);
		for(int i=0;i<dialogues.size();i++)
		{
		//bw.write(dialogues.getDialogues()+"\n");
		bw.close();
		}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		n++;
		System.out.print("Create scene press 1");
		}
		while(scan.nextInt()==1);
	}
	public void scriptPlay(MovieScript ms)
	{
		sw.writeScript(ms);
		System.out.print("Movie title:"+title+"\n");
		System.out.print("Director:"+director.getName()+"\n");
		System.out.print("Script Writer:"+sw.getName()+"\n");
		System.out.print("Movie type:"+type+"\n");
		System.out.println("Cast:");
		System.out.println("Charactername\t\t\t\tCastname");
		readCharacters();
		readActors();
		
		for(int i=0;i<roles.size();i++)
		{
			System.out.println(roles.get(i).getRoleName()+"\t\t\t\t\t"+actors.get(i).getName());
		}
		
	}
	
}