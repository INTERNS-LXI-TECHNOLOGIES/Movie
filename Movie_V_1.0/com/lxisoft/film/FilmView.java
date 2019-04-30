package com.lxisoft.film;

public class FilmView{

public void displaymovie(){
	Film film = new Film();
	System.out.println("moviename :"+film.getFilmName());
	System.out.println("directorname:"+film.createDirector().getName());
	System.out.println("scriptwriter:"+film.createScriptwriter().getName());

	
}	
	
}