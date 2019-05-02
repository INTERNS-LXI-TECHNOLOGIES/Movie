package com.lxisoft.movie.movieScript;
import java.util.*;
import java.io.*;
public class Dialogue
{
 File f=new File("ImotionalScene.txt");
 FileReader fr;
 BufferedReader br;
 String s;
		public void readingFileData()
		{
			try
			{
			fr=new FileReader(f);
		    br=new BufferedReader(fr);
				while ((s=br.readLine())!=null);
				{
					
					System.out.println(""+s);
				}
			br.close();
	        }
			catch(IOException e)
			{
				System.out.println("EXCEPTION");
			
			}
			
		
		}

}

