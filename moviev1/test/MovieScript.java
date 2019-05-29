package com.lxisoft.moviev1.test;
import com.lxisoft.moviev1.crew.*;
import com.lxisoft.moviev1.cast.*;
import com.lxisoft.moviev1.test.*;
import java.io.*;
import java.util.*;
import java.lang.*;
public class MovieScript
{
	private ScriptWriter sw;
	private ArrayList <Actor> actors;
	private ArrayList <Role> roles;
	private ArrayList <Scene> scenes;
	private ArrayList <Dialogue> dialogues;
	Random random;
	Scanner scan=new Scanner(System.in);
	InputStreamReader r=new InputStreamReader(System.in);  
	BufferedReader br=new BufferedReader(r);
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
	setSw(new ScriptWriter());
	setRoles(new ArrayList <Role>());
	setActors(new ArrayList <Actor>());
	setScenes(new ArrayList <Scene>());
	setDialogues(new ArrayList <Dialogue>());
	random=new Random();
	}
	public void characterDetails()
	{
		do
		{
		System.out.println("Characters in the movie:");
		roles.add(sw.addCharacters());
		System.out.println("Next character press 1");
		}
		while(scan.nextInt()==1);
		try
		{
		File file=new File("roles.txt");
		FileWriter fw=new FileWriter(file,true);
		BufferedWriter bw=new BufferedWriter(fw);
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
	public void selectedCharacters()
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
	public void removeCharacters()
	{
		selectedCharacters();
		String c=sw.getCharacter();	
		for(int i=0;i<roles.size();i++)
		{
		if(c.equalsIgnoreCase(roles.get(i).getRoleName().trim()))
		{
			roles.remove(i);
		}
		}
		storeEditedCharacters();	
	}
	public void changeCharacters()
	{
		selectedCharacters();
		String s=sw.getCharacter();
		try{
		System.out.println("The changed character is:");
		String st=br.readLine();
		for(int i=0;i<roles.size();i++)
		{
			
		if((s).equalsIgnoreCase(roles.get(i).getRoleName()))
		{
			roles.get(i).setRoleName(st);
		}
		}
		storeEditedCharacters();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public void storeEditedCharacters()
	{
	try{
		File file=new File("roles.txt");
		FileWriter fw=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
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
	public void castDetails() throws MyException
	{
		Movie movie=new Movie();
		int index=0;
		try
		{
		File file=new File("actors.txt");
		FileWriter fw=new FileWriter(file,true);
		BufferedWriter bw=new BufferedWriter(fw);
		do{
		System.out.println("actors in the movie:");
		System.out.println("1.Hero\n2.Heroine\n3.Comedian\n4.Villain");
		actors.add(movie.getDirector().selectCast());
		System.out.println("add actors press 1");
		}
		while(scan.nextInt()==1);
		if(roles.size()!=actors.size())
		{
			throw new MyException("Not casting actors for all characters");
		}
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
	public void selectedActors()
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
	public void removeCasts()
	{
		Movie movie=new Movie();
		selectedActors();
		String s=movie.getDirector().getCast();
		for(int i=0;i<actors.size();i++)
		{
		if((s).equalsIgnoreCase(actors.get(i).getName()))
		{
			actors.remove(i);
		}
		}
		storeEditedCasts();
	}
	public void changeCasts()
	{
		Movie movie=new Movie();
		selectedActors();
		String s=movie.getDirector().getCast();
		try{
		System.out.println("The changed actor is:");
		String c=br.readLine();
		for(int i=0;i<actors.size();i++)
		{
		if((s).equalsIgnoreCase(actors.get(i).getName()))
		{
			actors.get(i).setName(c);
		}
		}
		storeEditedCasts();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public void storeEditedCasts()
	{
		try
		{
		File file=new File("actors.txt");
		FileWriter fw=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
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
		//System.out.println(a);
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
			Date d1=new Date();
			System.out.println(d1.toString());
			if(("scene"+(j+1)+".txt").equals("scene3.txt"))
			{ 
				for(int m=0;m<dialogues.size();m++)
				{
					System.out.println(dialogues.get(m).getLine());
				}
			}
			else {
			List<String> d = new ArrayList<String>();
			int in = 0,c=0;
			List<String> s=new ArrayList<String>();
			for(int n=0;n<roles.size();n++)
			{
				int index=random.nextInt(roles.size());
				s.add(roles.get(index).getRoleName());
				in=index;
			}
			Collections.shuffle(s);
			for(int k=0;k<dialogues.size();k++)
			{
				//int ind=random.nextInt(dialogues.size());
				d.add(dialogues.get(k).getLine());
				
			}
			
			//Collections.shuffle(d);
			for(int l=0;l<d.size();l++)
			{
			System.out.print(s.get(l)+":");
			System.out.println(d.get(l));			
			}
			
			}
		}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public void deleteScene()
	{
		String s=sw.getScene();
		File file=new File(s+".txt");
		file.delete();
	}
	public void addDialogues()
	{
		System.out.println("Which scene you want to edit:");
		String s=scan.next();
		try
			{
			File file=new File(s+".txt");
			//file.createNewFile();
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
	}
	public void removeDialogues()
	{
	String s=sw.getScene(); 
	System.out.print("Which dialogue:");
	int d=scan.nextInt();
	try
			{
			File file=new File(s+".txt");
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
				for(int j=0;j<dialogues.size();j++)
				{
					if((d-1)==(j))
					{
						dialogues.remove(j);
					}
				}
			File file1=new File(s+".txt");
			//file.createNewFile();
			FileWriter fw=new FileWriter(file1);
			BufferedWriter bw=new BufferedWriter(fw);
			for(int i=0;i<dialogues.size();i++){
			bw.write(dialogues.get(i).getLine()+"\n");
			}
			bw.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
	}
	public void changeDialogues()
	{
		String s=sw.getScene(); 
	System.out.print("Which dialogue:");
	int d=scan.nextInt();
	try
			{
				System.out.print("New dialogue:");
				String n=br.readLine();
			File file=new File(s+".txt");
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
				for(int j=0;j<dialogues.size();j++)
				{
					if((d-1)==(j))
					{
						dialogues.get(j).setLine(n);
					}
				}
			File file1=new File(s+".txt");
			//file.createNewFile();
			FileWriter fw=new FileWriter(file1);
			BufferedWriter bw=new BufferedWriter(fw);
			for(int i=0;i<dialogues.size();i++){
			bw.write(dialogues.get(i).getLine()+"\n");
			}
			bw.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
	}
	public void scriptPlay(MovieScript ms)throws MyException
	{
		Movie movie=new Movie();
		sw.writeScript(movie);
		System.out.print("Movie title:"+movie.getTitle()+"\n");
		System.out.print("Director:"+movie.getDirector().getName()+"\n");
		System.out.print("Script Writer:"+sw.getName()+"\n");
		System.out.print("Movie type:"+movie.getType()+"\n");
		System.out.println("Cast:");
		System.out.println("Charactername\t\t\t\tCastname");
		selectedCharacters();
		selectedActors();
		if(roles.size()!=actors.size())
		{
			throw new MyException("Not casting actors for all characters");
		}
		for(int i=0;i<roles.size();i++)
		{
			System.out.println(roles.get(i).getRoleName()+"\t\t\t\t\t"+actors.get(i).getName());
		}
		takeScenes();
		roles.clear();
		actors.clear();
	}	
}