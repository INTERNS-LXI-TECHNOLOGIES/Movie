package com.lxisoft.movie.movieScript;
import java.util.*;
import java.io.*;
public class Dialogue
{
 File f=new File("Hero.Txt");
FileWriter fw;
BufferedWriter bw;

		public void writingOnFile()
		{
			try
			{
			fw=new FileWriter(f);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("kkkkk");
			bw.close();
	        }
			catch(IOException e)
			{
				System.out.println("EXCEPTION");
			
			}
			
		
		}

}