package com.lxisoft.movie.movieScript;
import com.lxisoft.movie.movieScript.*;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
public class Scene
{
public ArrayList<String> dialogue=new ArrayList<String>();
	File fi=new File("hero.txt");
	File fil=new File("heroine.txt");
	public void scene1()
	{
		try
		{
			
			FileReader fR=new FileReader(fi);
			BufferedReader bR=new BufferedReader(fR);
			FileReader fRe=new FileReader(fil);
			BufferedReader bRe=new BufferedReader(fRe);
            String b=null;
			String c=null;
		   while((b=bR.readLine())!=null)
		   {
			   
			   dialogue.add(b);
			
		   }
		   while((c=bRe.readLine())!=null)
		   {
			   dialogue.add(c);
		   }
		}
		catch(IOException z)
		{
			z.printStackTrace();
		}
		
		
		scene2();
	}
	public void scene2()
	{
		try
		{
		File f=new File("Villains.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String a=null;
		while((a=br.readLine())!=null)
	        {
				dialogue.add(a);
		    }
		}
		catch(Exception x)
		{
			System.out.println("Exception");
		}
		printing();
	
	}
	
		public void printing()
		{
			System.out.println("ROMANTIC SCENE");
			for(int i=0;i<dialogue.size();i++)
			{	
				
				System.out.println(dialogue.get(i));
			}
		}
}		