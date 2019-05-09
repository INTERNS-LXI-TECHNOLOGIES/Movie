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
	private ArrayList <Dialogue> dialogues;
	Random random;
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
	public void setDialogues(ArrayList <Dialogue> dialogues)
	{
		this.dialogues=dialogues;
	}
	public ArrayList <Dialogue> getDialogues()
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
	setDialogues(new ArrayList <Dialogue>());
	random=new Random();
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
	public void selectCharacters()
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
		int index=0;
		try
		{
		File file=new File("actors.txt");
		FileWriter fw=new FileWriter(file,true);
		BufferedWriter bw=new BufferedWriter(fw);
		do{
		System.out.println("actors in the movie:");
		System.out.println("1.Hero\n2.Heroine\n3.Comedian\n4.Villain");
		actors.add(director.selectCast());
		System.out.println("add actors press 1");
		}
		while(scan.nextInt()==1);
		if(roles.size()!=actors.size())
		{
			try{
			throw new MyException("Not casting actors for all characters");
			}
			catch(MyException m)
			{
				m.printStackTrace();
			}
		}
		for(int i=0;i<actors.size();i++)
		{
			//System.out.println(actors.get(i).getName());
			bw.write(actors.get(i).getName()+"\n");
		}
		
		bw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public void selectActors()
	{
		try{
		File file=new File("actors.txt");
		FileWriter fw=new FileWriter(file,true);
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);	
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
		Properties p = new Properties();
		int a = 0;
		try{
			
			p.load(new FileReader("prop.properties"));
			a = Integer.parseInt(p.getProperty("scene"));
			System.out.println(a);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		do{
			System.out.print("set secenes in the movie:");
			scenes.add(sw.makeScenes());
			
			try
			{
			File file=new File("scene"+(a+1)+".txt");
			file.createNewFile();
			FileWriter fw=new FileWriter(file,true);
			BufferedWriter bw=new BufferedWriter(fw);
			dialogues.clear();
			do{
			dialogues.add(sw.makeDialogue());
			System.out.print("add dialogue press 2:");
			}while(scan.nextInt()==2);
			for(int i=0;i<dialogues.size();i++){
			bw.write(dialogues.get(i).getLine()+"\n");
			}
			bw.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			System.out.print("Create scene press 1:");
			a++;
		}
		
		while(scan.nextInt()==1);
		p.setProperty("scene",a+"");
		try{
		p.store(new FileWriter("prop.properties"),"");
		}
		catch(Exception e){
			e.printStackTrace();
		}	
	}
	public void takeScenes()
	{
		//roles.clear();
		//sw.selectCharacters();
		
		try
		{
		Properties p = new Properties();	
		p.load(new FileReader("prop.properties"));
		int a = Integer.parseInt(p.getProperty("scene"));
		System.out.println(a);
		int size=a;
		for(int j=0;j<a;j++)
		{
		dialogues.clear();
		File file=new File("scene"+(j+1)+".txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		String data;		
				while((data=br.readLine())!=null)
				{
				//String item[]=data.split(";");
				Dialogue dialogue=new Dialogue();
				//dialogue.setLine(item[k]);
				dialogue.setLine(data);
				dialogues.add(dialogue);
				}
			System.out.println("Scene"+(j+1));
			List<String> d = new ArrayList<>();
			int c = 0;
			List<String> s=new ArrayList<>();
			for(int n=0;n<dialogues.size();n++)
			{
				s.add(roles.get(n).getRoleName());
			}
			Collections.shuffle(s);
			for(int k=0;k<dialogues.size();k++)
			{
				
				d.add(dialogues.get(k).getLine());
				
			}
			Collections.shuffle(d);
			for(int l=0;l<d.size();l++)
			{
			System.out.print(s.get(l)+":");
			System.out.println(d.get(l));	
			}
		}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
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
		selectCharacters();
		selectActors();
		for(int i=0;i<roles.size();i++)
		{
			System.out.println(roles.get(i).getRoleName()+"\t\t\t\t\t"+actors.get(i).getName());
		}
		takeScenes();
	}
	
}