package com.lxisoft.movie.script;
import com.lxisoft.movie.crew.*;
import com.lxisoft.movie.dialogue.*;
import java.util.*;
import java.io.*;

public class Script
{

	//private Dialogue dialogue =new Dialogue();
	private  String writterName="BENNY";
	private String filmName="ABCD";
	/*Hero hero=new Hero();
	Heroine heroine =new Heroine();
  	Villain villain =new Villain();
  	Comedian comedian =new Comedian();
  	Director director=new Director();*/
  	
  	ArrayList <String> dialog=new ArrayList <String> ();
	Scanner scan=new Scanner(System.in);
	Random Random=new Random();
	
	public String getWritterName()
	{
		return this.writterName;
	}
	public String getFilmName()
	{
		return this.filmName;
	}
	

}

	