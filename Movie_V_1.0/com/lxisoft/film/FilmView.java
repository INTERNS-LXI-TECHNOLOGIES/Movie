package com.lxisoft.film;
import com.lxisoft.scriptwriter.Script;

public class FilmView{
	public static final String filmName="manichitrathazhu";

public void displaymovie(){
	Film film = new Film();
	System.out.println("moviename :"+filmName);
	System.out.println("directorname:"+film.createDirector().getName());
	System.out.println("scriptwriter:"+film.createScriptwriter().getName());
	

	
}	
	
}