package com.lxisoft.moviev1.crew;
import com.lxisoft.moviev1.cast.*;
import com.lxisoft.moviev1.test.*;
import java.io.*;
import java.util.*;
public class Director
{
	private String name;
	Scanner scan=new Scanner(System.in);
	InputStreamReader r=new InputStreamReader(System.in);  
	BufferedReader br=new BufferedReader(r);
	Random random=new Random();
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
		ArrayList<String> actors=new ArrayList<String>();
		Actor actor=null;
		int index=0;
		try{
		String data;
		File file=null;
		switch(scan.nextInt())
		{
		case 1:	
		actor= new Hero();
		 file=new File("heros.txt");
		break;
		case 2:
		actor= new Heroine();
		file=new File("heroines.txt");
		
		break;
		case 3:
		actor=new Comedian();
		file=new File("comedians.txt");
		break;
		case 4:
		actor= new Villain();
		file=new File("Villains.txt");
		break;
		default:System.out.println("Wrong choice:");
		break;
		}
		FileWriter fw=new FileWriter(file,true);
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		while((data=br.readLine())!=null)
		{
		actors.add(data);
		}
		for(int i=0;i<actors.size();i++)
		{
		index=random.nextInt(actors.size());
		
		}
		actor.setName(actors.get(index));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
			return actor;
		
	}
	public void selectSingers()
	{
		
	}
}
