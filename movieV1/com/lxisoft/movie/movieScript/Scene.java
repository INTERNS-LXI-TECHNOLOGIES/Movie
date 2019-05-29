/*package com.lxisoft.movie.movieScript;
import com.lxisoft.movie.movieScript.*;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.util.Random;
public class Scene
{
public ArrayList<String> dialogue=new ArrayList<String>();
	public void createScene()
	{ 
	    Random rand=new Random();
		File f;
		int dia=0;
	     try
		 {
			for(int i=0;i<4;i++)
			  {
				Properties p=new Properties();
				p.load(new FileInputStream("prop.properties"));
				String a = p.getProperty("file"+i);
				f=new File(a);
				FileReader fr=new FileReader(f);
				BufferedReader br=new BufferedReader(fr);
				String data=null;
					while((data=br.readLine())!=null)
					  {
					 dialogue.add(data);
					  }
			  }
				System.out.println("                ");
				System.out.println("     SCENE 1    ");
				System.out.println("................");
			for(int j=0;j<dialogue.size();j++)
			  {
			    dia=(int)(Math.random()*12);
			    System.out.println(dialogue.get(dia));
			  }
			
		 }
		 catch(Exception x)
		 {
			 System.out.println("Exception.........");
		 }
	}
	
}*/	




package com.lxisoft.movie.movieScript;
import com.lxisoft.movie.movieScript.*;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;
public class Scene
{
public ArrayList<String> dialogue=new ArrayList<String>();
	public void createScene()
	{ 
	    Random rand=new Random();
		File f;
		int dia=0;
	     try
		 {
			for(int i=0;i<4;i++)
			  {
				Properties p=new Properties();
				p.load(new FileInputStream("prop.properties"));
				String a = p.getProperty("file"+i);
				f=new File(a);
				FileReader fr=new FileReader(f);
				BufferedReader br=new BufferedReader(fr);
				String data=null;
					while((data=br.readLine())!=null)
					  {
					 dialogue.add(data);
					  }
			  }
				System.out.println("                ");
				System.out.println("     SCENE 1    ");
				System.out.println("................");
			Set<Integer> value=new HashSet<>();
			for(int j=0;j<dialogue.size();j++)
			  {
			    dia=(int)(Math.random()*12);
				value.add(dia);
					for(Integer i: value)
					{
						System.out.println(dialogue.get(i));
						//System.out.println(i);
					}
			  }
		 }
		 catch(Exception x)
		 {
			 System.out.println("Exception.........");
		 }
	}
	
}	