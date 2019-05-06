package com.lxisoft.movie.movieScript;
import com.lxisoft.movie.movieScript.*;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
public class Scene
{
	/*private int sceneNumber;
	public ArrayList<Dialogue> dialogues=new ArrayList<Dialogue>();
	public ArrayList<Character> characterSequance=new ArrayList<Character>();
    public void setSceneNumber(int sceneNumber)
    {
		this.sceneNumber=sceneNumber;
	}	
	public int getSceneNumber()
	{
		return sceneNumber;
	}
	public void calling()
	{
	  dialogues.get(0).readingFileData();
	}*/
	public ArrayList<String> characters=new ArrayList<String>();
	//File f=new File("Villains.txt");
	File fi=new File("hero.txt");
	File fil=new File("heroine.txt");
	
	public void scene1()
	{
		try
		{	
		
			//FileReader fr=new FileReader(f);
	          //BufferedReader br=new BufferedReader(fr);
			FileReader fR=new FileReader(fi);
			BufferedReader bR=new BufferedReader(fR);
			FileReader fRe=new FileReader(fil);
			BufferedReader bRe=new BufferedReader(fRe);
			
		    //String a=null;
            String b=null;
			String c=null;
	       /*while((a=br.readLine())!=null)
	        {
				characters.add(a);
         //System.out.println("b="+characters.get(0));
		    }*/
		   while((b=bR.readLine())!=null)
		   {
			   characters.add(b);
		   }
		   while((c=bRe.readLine())!=null)
		   {
			   characters.add(c);
		   }
		}
		catch(IOException z)
		{
			z.printStackTrace();
		}
		
		System.out.println("ROMANTIC SCENE");
		for(int i=0;i<characters.size();i++)
		{
			System.out.println(characters.get(i));
		}
		//scene2();
	}
	/*public void scene2()
	{
		File f=new File("Villains.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String a=null;
		while((a=br.readLine())!=null)
	        {
				characters.add(a);
         //System.out.println("b="+characters.get(0));
		    }
	}*/

	
	
	
	
	
	
	
	
	
	
	
}